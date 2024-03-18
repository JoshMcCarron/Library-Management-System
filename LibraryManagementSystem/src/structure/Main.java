package structure;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

import javax.swing.*;

import actions.Open;
import actions.Purchase;
import actions.Rent;
import course.Course;
import items.Book;
import items.Magazine;
import items.Newsletter;
import items.OnlineBook;
import items.PhysicalItem;
import maintaining.*;
import search.Search;
import userTypes.*;

public class Main {
	public static void main(String[]args) throws Exception{
		//temporarily using scanner but this will be the text boxes and buttons from the GUI
		Scanner scanner = new Scanner(System.in);
		boolean loggedIn = false;
		String regOrLog="";
		boolean validRent = false;
		boolean validReturn = false;
		LocalDateTime now = LocalDateTime.now();


		String userPath = "C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\user.csv";
		MaintainUser maintainUser = new MaintainUser();

		String itemsPath = "C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\items.csv";
		MaintainPhysicalItems  maintainItem = new MaintainPhysicalItems();

		String rentalsPath = "C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\itemsBorrowed.csv";
		MaintainRentals maintainRental = new MaintainRentals();

		String purchasePath ="C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\purchased.csv";
		MaintainPurchases maintainPurchase = new MaintainPurchases();

		String coursePath = "C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\courses.csv";
		MaintainCourses maintainCourse = new MaintainCourses();





		//load items
		maintainItem.load(itemsPath);
		//		for(PhysicalItem i: maintainItem.items){
		//			System.out.println(i.toString());
		//		}

		//load users
		maintainUser.load(userPath);
		//		for(User u: maintainUser.users){
		//			System.out.println(u.toString());
		//		}

		//load rentals
		maintainRental.load(rentalsPath);
		//		for (Rent r: maintainRental.rentals) {
		//			System.out.println(r.toString());
		//		}
		maintainPurchase.load(purchasePath);
		maintainCourse.load(coursePath);




		//create Manager to manage ALL users
		Management manager = Management.getManagement();

		//register or log in
		while(!regOrLog.equals("register") && !regOrLog.equals("login")) {

			System.out.println("Would you like to (register) or (login)?");
			regOrLog = scanner.nextLine();
			if (!regOrLog.equals("register")&& !regOrLog.equals("login")) {
				System.out.println("Invalid input");
			}
		}
		while (!loggedIn) {


			//register
			if (regOrLog.equals("register")) {
				System.out.println("Enter user type (Student, Faculty, Non-Faculty, Visitor):");
				String userType = scanner.nextLine();
				System.out.println("Enter email:");
				String email = scanner.nextLine();
				System.out.println("Enter password:");
				String password = scanner.nextLine();

				User user = maintainUser.register(email, password, userType, manager);

				if (user != null) {
					maintainUser.users.add(user);
					maintainUser.update(userPath);
					System.out.println(userType + " registered successfully with id: " + user.getId());
					loggedIn = true;
				} else {
					System.out.println("Registration failed. Try again.");
				}
			}
			//login
			else if (regOrLog.equals("login")){
				System.out.println("Enter email:");
				String email = scanner.nextLine();
				System.out.println("Enter password:");
				String password = scanner.nextLine();
				//user equals the user object that has matching email and password
				User user = maintainUser.login(email, password);
				//if the user is found they are logged, 
				if (user != null) {
					// The user has successfully logged in
					System.out.println("Login successful!");
					loggedIn = true;
					//everything accessible once logged in here


					user.calculateFines(maintainRental.rentals);
					System.out.println("You have a collective fine of $"+ user.getFine());

					//REQUIREMENT 3: display list of rentals by that user
					user.setRentals();
					for (Rent rentals: user.getRentals()) {

						LocalDateTime dueDateTime = rentals.getDateDue().atStartOfDay();
						long days = ChronoUnit.DAYS.between(now, dueDateTime);

						if (days <= 1 && days >= 0) {
							System.out.println("Warning: "+ rentals.getItem().getTitle()+ " is due in the next day.");
						} else if (days < 0) {
							System.out.println("Warning: "+ rentals.getItem().getTitle()+ " is overdue.");
						} else {
							System.out.println(rentals.toString());
						}
					}


					//Simulate rent process
					System.out.println("Would you like to rent an item? (yes) or (no)");
					String rentOrNo = scanner.nextLine();
					if (rentOrNo.equals("yes")){
						while (!validRent) {
							for(PhysicalItem i: maintainItem.items){
								System.out.println(i.toString());
							}

							System.out.println("Enter the title of the item you would like to rent (in the text field not console):");
							//rentalTitle will be replaced with a text field with document listener
							Search search = new Search(maintainItem.items);
							JTextField searchField = search.getSearchField();


							//Sample JFrame for search feature
							JFrame frame = new JFrame("Search");
							frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							frame.getContentPane().add(searchField);
							frame.pack();
							frame.setVisible(true);

							searchField.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									frame.dispose(); // Close the frame when enter is pressed
								}
							});//end of sample JFrame for search feature
							boolean preventMoving = false; //this variable is temporary and is so console wont progress until rental title and author are set //enter 1 after title is entered to move on
							while(!preventMoving) {
								String progress = scanner.nextLine();
								if (progress.equals("1")) {
									preventMoving = true;
								}
							}  
							//String rentalTitle = scanner.nextLine();

							//author will probably be removed
							//System.out.println("Enter the author/creator of the item you would like to rent:");
							String rentalTitle= search.getSearchedItem();
							//String rentalAuthor = scanner.nextLine();
							String rentalAuthor = search.getAuthor();


							boolean itemExists = false;
							//check if item with that author and title exists
							for(PhysicalItem i: maintainItem.items){
								if (i.getTitle().equals(rentalTitle) && i.getAuthor().equals(rentalAuthor)) {
									itemExists = true;
									validRent = true;  //to prevent asking user to rent again-either they rented, or have max amount of rentals
									break;

								}
							}

							if (itemExists) {

								if (user.getRentals().size()==10) {
									System.out.println("You have reached the max amount of rentals! Please return items to rent again");
								}
								else if(user.getNumOfOverdue()==3) {
									System.out.println("You have 3 rentals overdue! Please return items to rent again");
								}
								else {
									Rent newRental = new Rent(user, rentalTitle, rentalAuthor, maintainItem);
									if (newRental != null) {
										maintainRental.rentals.add(newRental);
										maintainRental.update(rentalsPath);
										maintainItem.update(itemsPath);

										System.out.println("Successfully rented");
										break;
									} 
								}
							}
							else{
								System.out.println("An item with that name and author does not exist in our database");
							}
						}
					}

					System.out.println("Would you like to return an item? (yes) or (no)");
					String returnOrNo = scanner.nextLine();
					if (returnOrNo.equals("yes")){
						while (!validReturn) {
							System.out.println("Enter the title of the item you would like to return:");
							String returnTitle = scanner.nextLine();
							System.out.println("Enter the author/creator of the item you would like to return:");							
							String returnAuthor = scanner.nextLine();


							for (Rent rental: user.getRentals()) {
								if(rental.getItem().getTitle().equals(returnTitle) && rental.getItem().getAuthor().equals(returnAuthor)) {
									validReturn = true;
									System.out.println(rental);
									user.returnRental(rental, maintainItem);
									System.out.println("Successfully returned");
									break;
								}
							}

							if(!validReturn) {
								System.out.println("Unable to return item");
							}

						}
					}


					//simulate purchasing item
					System.out.println("Would you like to purchase one of our items? (yes) or (no)");
					String purchOrNo = scanner.nextLine();

					if (purchOrNo.equals("yes")) {
						for(PhysicalItem i: maintainItem.items){
							if(i.getPurchasable()!= "") {
								if(Double.parseDouble(i.getPurchasable())<5) {
									System.out.println("SALE! $"+i.getPurchasable()+": " +i.getTitle() +" by "+i.getAuthor());
								}
								else {
									System.out.println("$"+i.getPurchasable()+": "+i.getTitle() +" by "+i.getAuthor());

								}
							}

						}
						boolean validPurch = false;
						while (!validPurch) {
							System.out.println("Enter the title of the item you would like to purchase");

							String purchTitle = scanner.nextLine();
							for(PhysicalItem i: maintainItem.items){
								if(i.getPurchasable()!= "") {
									if (purchTitle.equals(i.getTitle())) {
										validPurch = true;
										System.out.println("This item is $"+i.getPurchasable()+". How would you like to pay? (debit) (credit)");
										String debOrCred = scanner.nextLine();
										if (debOrCred.equals("credit")) {
											System.out.println("Your purchase is succesful, and your credit card has been charged:$ "+i.getPurchasable());									
										}
										else {
											System.out.println("Your purchase is succesful, and your debit card has been charged:$ "+i.getPurchasable());

										}
										Purchase newPurchase = new Purchase(user.getId(), i.getId());
										maintainPurchase.purchases.add(newPurchase);
										maintainPurchase.update(purchasePath);

									}
								}
							}

							if (!validPurch) {
								System.out.println("That title is not purchasable");
							}
						}

					}













					//simulate online book being pressed
					boolean validOnlineBook = false;
					System.out.println("Would you like to open one of our online books? (yes) or (no)");
					String onlineBookOrNo = scanner.nextLine();
					if (onlineBookOrNo.equals("yes")) {
						System.out.println("Cuurently, we have 2 online books:");
						System.out.println("The Adventure of the Lost Jewel by Author1");
						System.out.println("The Mystery of the Whispering Woods by Author2");

						while(!validOnlineBook) {
							System.out.println("Would you like to open The Adventure of the Lost Jewel or The Mystery of the Whispering Woods");
							String bookOneOrTwo = scanner.nextLine();
							try {
								if (bookOneOrTwo.equals("The Adventure of the Lost Jewel")) {
									//open textfile1
									validOnlineBook = true;
									Path path1 = Paths.get("C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\OnlineBook1.txt");
									String content = Files.readString(path1);
									System.out.println(content);
									validOnlineBook = true;
								}
								else if (bookOneOrTwo.equals("The Mystery of the Whispering Woods")) {
									//open textfile2
									Path path2 = Paths.get("C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\OnlineBook2.txt");						        
									String content = Files.readString(path2);
									System.out.println(content);
									validOnlineBook = true;
								}
								else {
									System.out.println("That is not one of our Online Books!");
								}
							}catch(IOException e) {
								e.printStackTrace();
							}


						}
					}

					//simulate request button
					//NOTE: NEED TO ADD CHECK FOR IF ITEM IS ALREADY IN DATABASE
					boolean requestStatus = false;
					while (!requestStatus) {
						System.out.println("Would you like to request a new book? (yes) or (no)");
						String reqOrNo = scanner.nextLine();
						//this will be moved to request class
						if (reqOrNo.equals("yes")) {
							System.out.println("Please enter the author:");
							String authorName = scanner.nextLine();
							System.out.println("Please enter the title:");
							String titleName = scanner.nextLine();
							PhysicalItem newItem = maintainItem.request(authorName, titleName, manager);

							if (newItem != null) {
								maintainItem.items.add(newItem);
								maintainItem.update(itemsPath);
								requestStatus = true;
								System.out.println("Your request for " + titleName + " by " + authorName + " has been prioritized and successfully been added");
							} else {
								System.out.println("Your request has been denied!");
							}

						}
						else {
							requestStatus = true;
						}
					}

					//simulate newsletter
					System.out.println("Our library provides direct subscription access to the NY Times, would you like to subscribe? (A we browser will be opened if yes) ");
					String newsOrNot = scanner.nextLine();
					if (newsOrNot.equals("yes")){
						if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
							try {
								Desktop.getDesktop().browse(new URI("https://www.nytimes.com/subscription"));
							} catch (IOException | URISyntaxException e) {
								e.printStackTrace();
							}
						}

					}

					//simulate manager enable, disable, remove
					String manageCode = "1357";
					System.out.println("Are you a manager? (yes) or (no)");
					String isManager = scanner.nextLine();
					if (isManager.equals("yes")) {
						System.out.println("Enter your manager code");
						String userCode = scanner.nextLine();


						if(manageCode.equals(userCode)) {
							System.out.println("Would you like to (add) or (remove) any item?");
							String addOrRem = scanner.nextLine();
							if (addOrRem.equals("add")) {
								System.out.println("Enter the author of the item you would like to add");
								String manageAuthor = scanner.nextLine();
								System.out.println("Enter the title of the item you would like to add");
								String manageTitle = scanner.nextLine();
								boolean validManageType = false;
								while(!validManageType) {
									System.out.println("Enter the type of item you would like to add: (Book) (CD) (Magazine)");
									String manageType = scanner.nextLine();
									if (!manageType.equals("Book")&&!manageType.equals("CD")&&!manageType.equals("Magazine")) {
										System.out.println("INVALID TYPE");
									}
									else {
										validManageType = true;
										Book manageItem = new Book(manageTitle, manageAuthor, manageType);
										maintainItem.items.add(manageItem);
										maintainItem.update(itemsPath);
									}
								}


							}
							else if(addOrRem.equals("remove")) {
								boolean validRemTitle = false;
								while (!validRemTitle) {
									System.out.println("Please note, the item you remove will no longer be listed in user's rental lists! ");
									System.out.println("Enter the title of the item you would like to remove");
									String remTitle = scanner.nextLine();
									PhysicalItem itemToRemove = null;
									List<Rent> rentalsToRemove = new ArrayList<>();
									for(PhysicalItem i: maintainItem.items){
										if(remTitle.equals(i.getTitle())) {
											itemToRemove = i;
											for (Rent r: maintainRental.rentals) {
												if (r.getItemId()==itemToRemove.getId()) {
													rentalsToRemove.add(r);
												}
											}
										}
									}
									if(itemToRemove!= null) {
										for (Rent r: rentalsToRemove) {
											maintainRental.rentals.remove(r);
										}
										maintainRental.update(rentalsPath);
										maintainItem.items.remove(itemToRemove);
										maintainItem.update(itemsPath);
										validRemTitle = true;
										System.out.println("Item succesfully removed!");

									}
									else {
										System.out.println("An item with that title is not in our database");
									}
								}


							}
						}
						else {
							System.out.println("WRONG CODE, YOU ARE NOT THE MANAGER!");
						}
					}


					if(user.getClass().getSimpleName().equals("Faculty")) {
						System.out.println("Below is a list of courses you are currently teaching:");
						for (Course c: maintainCourse.courses) {
							if (c.getFacultyId()== user.getId()&& LocalDate.now().isBefore(c.getEndDate())) {
								System.out.println(c.getCourseName()+ ": started on "+ c.getStartDate()+ " ends on "+ c.getEndDate());
							}
						}
						System.out.println("Below is a list of textbooks you are using or have used:");
						for (Course c: maintainCourse.courses) {
							Random random = new Random();
							if (c.getFacultyId()== user.getId()) {
								if(random.nextBoolean()) {
									System.out.println(c.getTextbook()+ ": Sorry, but currently this textbook is not available. We will notify our management to help procure this textbook for you");
								}
								else if (c.getTextbookStatus().equals("new")) {
									System.out.println(c.getTextbook()+ ": A NEW EDITION IS AVAILABLE");
								}
								else {
									System.out.println(c.getTextbook());
								}
							}
						}


					}

					if(user.getClass().getSimpleName().equals("Student")) {
						System.out.println("Currently these are the virtual textbook copies available to you:");
						for (Course c: maintainCourse.courses) {
							if (user.getId() == c.getStudentId1()|| user.getId() == c.getStudentId3() || user.getId() == c.getStudentId3()) {
								if(LocalDate.now().isBefore(c.getEndDate())){
									System.out.println(c.getTextbook()+": Available until "+ c.getEndDate());
								}
							}
						}


					}


















				} else {
					// The entered email and password do not match any user
					System.out.println("Invalid email or password.");
				}
			}
			else {
				System.out.println("Invalid option. Please enter either 'register' or 'login'.");
			}
		}

		scanner.close();


	}
}