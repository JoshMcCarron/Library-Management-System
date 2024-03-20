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
import gui.LoginPage;
import items.Book;
import items.CD;
import items.ItemKeeper;
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
		//uncomment below line to view GUI
		
		Scanner scanner = new Scanner(System.in);
		boolean loggedIn = false;
		boolean quit = false;
		boolean validRent = false;
		boolean validReturn = false;
		LocalDateTime now = LocalDateTime.now();


		//these are the paths to each of the csv files. Please edit to the location of yours!
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

		String onlineBook1Path = "C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\OnlineBook1.txt";
		String onlineBook2Path = "C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\OnlineBook2.txt";

		//calls method in each maintain class to create objects for each csv entry
		maintainItem.load(itemsPath);
		maintainUser.load(userPath);
		maintainRental.load(rentalsPath);
		maintainPurchase.load(purchasePath);
		maintainCourse.load(coursePath);

		//create Manager to manage ALL users
		//as one manager controls all other users, it is made a Singleton 
		Management manager = Management.getManagement();

		//declare user to be used
		User user = null;
		
		//load GUI
		LoginPage login = new LoginPage(maintainUser, manager, userPath, maintainRental, maintainCourse, maintainItem, itemsPath, rentalsPath, purchasePath, maintainPurchase);


		//REQ1
		//check if user is registering or logging in
		String regOrLog = registerOrLogin(scanner);
		//loops until user registration or login is successful
		while (!loggedIn) {
			if (regOrLog.equals("register")) {
				user = register(scanner, maintainUser, manager, userPath);
				if (user!= null) {
					loggedIn = true;
				}
			} else if (regOrLog.equals("login")){
				user = login(scanner, maintainUser);
				if (user!= null) {
					loggedIn = true;
				}
			}
			else {
				System.out.println("Invalid option. Please enter either 'register' or 'login'.");
			}
		}

		//REQ3
		//display the list of user rentals, warning messages if needed, and calculate user fines
		displayRentalsAndFines(user, maintainRental);




		//after each function, until user clicks quit, they should be able to do other functionalitites
		while (!quit) {
			//get which button the user would like to press
			String whichFunctionality = userChoice(scanner);
			if(whichFunctionality.equals("Rent")) {
				rent(scanner, maintainItem, maintainRental, user, rentalsPath, itemsPath);
			}
			else if(whichFunctionality.equals("Return")) {
				returnRental(scanner, user, maintainItem);
			}
			else if(whichFunctionality.equals("Purchase")) {
				purchase( scanner, maintainItem, maintainPurchase, user, purchasePath);
			}
			else if(whichFunctionality.equals("Open Online Book")) {
				open(scanner, onlineBook1Path, onlineBook2Path);
			}
			else if(whichFunctionality.equals("Request")) {
				request(scanner, maintainItem, manager, itemsPath);
			}
			else if(whichFunctionality.equals("Newsletter")) {
				newsletter(scanner);
			}
			else if(whichFunctionality.equals("quit")) {
				System.out.println("Application closed");
				quit = true;
			}
			else if(whichFunctionality.equals("account")) {
				accountInfo(user, maintainCourse);
				System.out.println("The manager of our system has special access. Are you the manager");
				String isManager = scanner.nextLine();
				if(isManager.equals("yes")) {
					managerTasks(scanner, manager, maintainItem, maintainRental, itemsPath, rentalsPath);
				}

			}

		}//end of quit while loop

		//close scanner
		scanner.close();


	}
	//method to check if user is registering or logging in
	public static String registerOrLogin(Scanner scanner) {
		//variable for getting userInput
		String regOrLog="";
		//loop through until user chooses register or login
		while(!regOrLog.equals("register") && !regOrLog.equals("login")) {
			System.out.println("Would you like to (register) or (login)?");
			//get user input
			regOrLog = scanner.nextLine();
			if (!regOrLog.equals("register")&& !regOrLog.equals("login")) {
				System.out.println("Invalid input");
			}
		}
		return regOrLog;
	}//end of registerOrLogin method

	//method to handle registering
	public static User register(Scanner scanner, MaintainUser maintainUser, Management manager, String userPath) throws Exception {
		//get user details
		System.out.println("Enter user type (Student, Faculty, Non-Faculty, Visitor):");
		String userType = scanner.nextLine();
		System.out.println("Enter email:");
		String email = scanner.nextLine();
		System.out.println("Enter password:");
		String password = scanner.nextLine();

		//create a user object with the user's input
		User user = maintainUser.register(email, password, userType, manager);

		//check if user was actually created and display appropriate messages accordingly
		if (user != null) {
			//if user exists they are added to the list of users, and written into the user csv file
			maintainUser.users.add(user);
			maintainUser.update(userPath);
			System.out.println(userType + " registered successfully with id: " + user.getId());

		} else {
			System.out.println("Registration failed. Try again.");
		}

		return user;
	}//end of register method

	public static User login(Scanner scanner, MaintainUser maintainUser) {

		//get user info
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
		}

		return user;
	}//end of login method

	public static String userChoice(Scanner scanner) {
		boolean validChoice = false;
		String userFunction = "";
		//list of valid functionalities
		final List<String> VALID_FUNCTIONALITIES = Arrays.asList("Rent", "Return", "Purchase", "Open Online Book", "Request", "Newsletter", "quit", "account");

		//list functionalities to user
		System.out.println("Below are the functionalities our system currently has:");
		System.out.println("Rent");
		System.out.println("Return");
		System.out.println("Purchase");
		System.out.println("Open Online Book");
		System.out.println("Request");
		System.out.println("Newsletter");
		System.out.println("quit");
		System.out.println("account");

		//get user choice
		//loops until user enter a valid functionality
		while (!validChoice) {
			System.out.println("Enter what you would like to do:");
			userFunction = scanner.nextLine();

			if (!VALID_FUNCTIONALITIES.contains(userFunction)) {
				System.out.println("That is not a valid choice!");
			}
			else {
				validChoice = true;
			}
		}

		return userFunction;
	}//end of userChoice method


	//fines will be stored when User is clciekd
	public static void displayRentalsAndFines(User user, MaintainRentals maintainRental) throws Exception {
		//variable for getting current date/time
		LocalDateTime now = LocalDateTime.now();


		//display user rentals
		//set user rentals
		user.setRentals();
		//loop through user rentals
		for (Rent rentals: user.getRentals()) {

			LocalDateTime dueDateTime = rentals.getDateDue().atStartOfDay();
			//get the days between today and the due date of the rental
			long days = ChronoUnit.DAYS.between(now, dueDateTime);
			//display different message depending on how close/past the due date of the rental is
			if (days <= 1 && days >= 0) {
				System.out.println("Warning: "+ rentals.getItem().getTitle()+ " is due in the next day.");
			} else if (days < 0) {
				System.out.println("Warning: "+ rentals.getItem().getTitle()+ " is overdue.");
			} else {
				System.out.println(rentals.toString());
			}
		}//end of rentals for loop

		//display user fines
		user.calculateFines(maintainRental.rentals);
		System.out.println("You have a collective fine of $"+ user.getFine());
	}//end of displayRentalsAndFines method

	public static void rent(Scanner scanner, MaintainPhysicalItems maintainItem, MaintainRentals maintainRental, User user, String rentalsPath, String itemsPath) throws Exception {
		boolean validRent = false;
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


	}//end of rent method

	public static void returnRental(Scanner scanner, User user, MaintainPhysicalItems maintainItem) throws Exception {
		boolean validReturn = false;
		//get item information for return
		System.out.println("Enter the title of the item you would like to return:");
		String returnTitle = scanner.nextLine();
		System.out.println("Enter the author/creator of the item you would like to return:");							
		String returnAuthor = scanner.nextLine();

		//loop through user rentals to see if they are renting an item with the info the user entered
		for (Rent rental: user.getRentals()) {
			//if item exists return it
			if(rental.getItem().getTitle().equals(returnTitle) && rental.getItem().getAuthor().equals(returnAuthor)) {
				validReturn = true;
				//method in user to returnRental
				user.returnRental(rental, maintainItem);
				System.out.println("Successfully returned");
				break;
			}
		}
		
//		Iterator<Rent> rentalIterator = user.getRentals().iterator();
//		while(rentalIterator.hasNext()) {
//		    Rent rental = rentalIterator.next();
//		    if(rental.getItem().getTitle().equals(returnTitle) && rental.getItem().getAuthor().equals(returnAuthor)) {
//		        validReturn = true;
//		        user.returnRental(rental, maintainItem);
//		        System.out.println("Successfully returned");
//		        break;
//		    }
//		}
		//if item is not in user rentals it cannot be returned
		if(!validReturn) {
			System.out.println("Unable to return item");
		}
	}//end of returnRental method

	public static void purchase(Scanner scanner, MaintainPhysicalItems maintainItem, MaintainPurchases maintainPurchase, User user, String purchasePath) throws Exception {
		//loops through items 
		for(PhysicalItem i: maintainItem.items){
			//Purchasable attribute in item contains a value
			if(i.getPurchasable()!= "") {
				//purchasable is converted to a double value, and a sale is displayed if there
				if(Double.parseDouble(i.getPurchasable())<5) {
					System.out.println("SALE! $"+i.getPurchasable()+": " +i.getTitle() +" by "+i.getAuthor());
				}
				else {
					System.out.println("$"+i.getPurchasable()+": "+i.getTitle() +" by "+i.getAuthor());

				}
			}//end of items for loop

		}
		boolean validPurch = false;
		//loop to check if the item user tries to buy is valid
		while (!validPurch) {
			System.out.println("Enter the title of the item you would like to purchase");
			String purchTitle = scanner.nextLine();
			//loop through items
			for(PhysicalItem i: maintainItem.items){
				if(i.getPurchasable()!= "") {
					//if the title they would like to purchase is available, get payment method
					if (purchTitle.equals(i.getTitle())) {
						validPurch = true;
						System.out.println("This item is $"+i.getPurchasable()+". How would you like to pay? (debit) (credit)");
						String debOrCred = scanner.nextLine();
						//display message depending on if payment method is debit or credit
						if (debOrCred.equals("credit")) {
							System.out.println("Your purchase is succesful, and your credit card has been charged:$ "+i.getPurchasable());									
						}
						else {
							System.out.println("Your purchase is succesful, and your debit card has been charged:$ "+i.getPurchasable());

						}
						//create a new purchase object, add it to the purchases list, and update the purchase csv file
						Purchase newPurchase = new Purchase(user.getId(), i.getId());
						maintainPurchase.purchases.add(newPurchase);
						maintainPurchase.update(purchasePath);

					}
				}
			}
			//if the item is not purchasable
			if (!validPurch) {
				System.out.println("That title is not purchasable");
			}
		}//end of validPurch while loop
	}//end of purchase method

	public static void open(Scanner scanner, String onlineBook1Path, String onlineBook2Path) {
		//variable to check if user has chosen one of the available online books
		boolean validOnlineBook = false;
		System.out.println("Cuurently, we have 2 online books:");
		System.out.println("The Adventure of the Lost Jewel by Author1");
		System.out.println("The Mystery of the Whispering Woods by Author2");
		//loop until a valid online book is chosen
		while(!validOnlineBook) {
			System.out.println("Would you like to open The Adventure of the Lost Jewel or The Mystery of the Whispering Woods");
			//get user input
			String bookOneOrTwo = scanner.nextLine();
			try {
				//if title equals first online book
				if (bookOneOrTwo.equals("The Adventure of the Lost Jewel")) {
					//open textfile1
					//path to online book one
					Path path1 = Paths.get(onlineBook1Path);
					String content = Files.readString(path1);
					System.out.println(content);
					validOnlineBook = true;
				}
				//if title equals second online book
				else if (bookOneOrTwo.equals("The Mystery of the Whispering Woods")) {
					//open textfile2
					//path to online book two
					Path path2 = Paths.get(onlineBook2Path);						        
					String content = Files.readString(path2);
					System.out.println(content);
					validOnlineBook = true;
				}
				//if title is not an online book
				else {
					System.out.println("That is not one of our Online Books!");
				}
			}catch(IOException e) {
				e.printStackTrace();
			}


		}
	}//end of open method

	public static void request(Scanner scanner, MaintainPhysicalItems maintainItem, Management manager, String itemsPath) throws Exception {
		//get info on book user would like to request
		System.out.println("Please enter the author of the book you would like to request:");
		String authorName = scanner.nextLine();
		System.out.println("Please enter the title of the book you would like to request:");
		String titleName = scanner.nextLine();
		//try to create a new item. The manager will decide
		PhysicalItem newItem = maintainItem.request(authorName, titleName, manager);
		//if manager adds the item it is added to the items csv file and items list
		if (newItem != null) {
			maintainItem.items.add(newItem);
			maintainItem.update(itemsPath);
			System.out.println("Your request for " + titleName + " by " + authorName + " has been prioritized and successfully been added");
			//if manager does not add item
		} else {
			System.out.println("Your request has been denied!");
		}



	}//end of request method

	public static void newsletter(Scanner scanner) {
		System.out.println("Our library provides direct subscription access to the NY Times, would you like to subscribe? (A we browser will be opened if yes) ");
		String newsOrNot = scanner.nextLine();
		//if user wants to subscribe, a browser is opened to the NY Time subscribe page
		if (newsOrNot.equals("yes")){
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI("https://www.nytimes.com/subscription"));
				} catch (IOException | URISyntaxException e) {
					e.printStackTrace();
				}
			}

		}
	}//end of newsletter method

	public static void accountInfo(User user, MaintainCourses maintainCourse) {
		//display faculty info
		
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
					
					try {
						c.addObserver(user.getId());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						c.checkTextStatus();
				
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
		else if(user.getClass().getSimpleName().equals("Student")) {
			System.out.println("Currently these are the virtual textbook copies available to you:");
			for (Course c: maintainCourse.courses) {
				if (user.getId() == c.getStudentId1()|| user.getId() == c.getStudentId3() || user.getId() == c.getStudentId3()) {
					if(LocalDate.now().isBefore(c.getEndDate())){
						System.out.println(c.getTextbook()+": Available until "+ c.getEndDate());
					}
				}
			}
		}

	}//end of accountInfo method

	public static void managerTasks(Scanner scanner, Management manager, MaintainPhysicalItems maintainItem, MaintainRentals maintainRental,String itemsPath, String rentalsPath) throws Exception {
		System.out.println("Enter your manager code");
		String userCode = scanner.nextLine();
		//check if code entered matches manger's code
		if(manager.getManagerCode().equals(userCode)) {
			System.out.println("Would you like to (add) or (remove) any item?");
			String addOrRem = scanner.nextLine();
			//adding item functionality
			if (addOrRem.equals("add")) {
				//getting new item info
				System.out.println("Enter the author of the item you would like to add");
				String manageAuthor = scanner.nextLine();
				System.out.println("Enter the title of the item you would like to add");
				String manageTitle = scanner.nextLine();
				boolean validManageType = false;
				//make sure item type is Book, CD, or Magazine
				while(!validManageType) {
					System.out.println("Enter the type of item you would like to add: (Book) (CD) (Magazine)");
					String manageType = scanner.nextLine();
					if (!manageType.equals("Book")&&!manageType.equals("CD")&&!manageType.equals("Magazine")) {
						System.out.println("INVALID TYPE");
					}
					//if everything is valid, add item to items list and write to csv file
					else {
						ItemKeeper ik = new ItemKeeper();
						validManageType = true;
						//acts as a client for the facade pattern
						switch(manageType) {
						case "Book":
							Book book = ik.createBook(manageTitle, manageAuthor);
							maintainItem.items.add(book);
							maintainItem.update(itemsPath);
							break;
						case "Magazine":
							Magazine magazine = ik.createMagazine(manageTitle, manageAuthor);
							maintainItem.items.add(magazine);
							maintainItem.update(itemsPath);
							break;
						case "CD":
							CD cd = ik.createCD(manageTitle, manageAuthor);
							maintainItem.items.add(cd);
							maintainItem.update(itemsPath);
							break;
						default:
							throw new IllegalArgumentException("Invalid item type: " + manageType);
						}
//						Book manageItem = new Book(manageTitle, manageAuthor, manageType);
//						maintainItem.items.add(manageItem);
//						maintainItem.update(itemsPath);
					}
				}


			}
			//removing item functionality
			else if(addOrRem.equals("remove")) {
			    boolean validRemTitle = false;
			    while (!validRemTitle) {
			        System.out.println("Please note, the item you remove will no longer be listed in user's rental lists! ");
			        System.out.println("Enter the title of the item you would like to remove");
			        String remTitle = scanner.nextLine();
			        PhysicalItem itemToRemove = null;
			        //list of rentals to remove as if an item does not exist, users cannot rent it
			        List<Rent> rentalsToRemove = new ArrayList<>();
			        //iterate through items to see if item user wishes to remove exists
			        Iterator<PhysicalItem> itemIterator = maintainItem.items.iterator();
			        while(itemIterator.hasNext()){
			        	//item is set to the next item in the iteration
			            PhysicalItem i = itemIterator.next();
			            if(remTitle.equals(i.getTitle())) {
			                itemToRemove = i; //sets item to remove
			                //iterate through rentals and add each rental that matches the item that is removed to the remove list
			                Iterator<Rent> rentalIterator = maintainRental.rentals.iterator();
			                while(rentalIterator.hasNext()){
			                    Rent r = rentalIterator.next();
			                    if (r.getItemId()==itemToRemove.getId()) {
			                        rentalsToRemove.add(r);
			                    }
			                }
			            }
			        }
			        //if user is removing an item
			        if(itemToRemove!= null) {
			            //iterate through rentals and remove each rental that includes item
			            Iterator<Rent> rentalToRemoveIterator = rentalsToRemove.iterator();
			            while(rentalToRemoveIterator.hasNext()){
			                Rent r = rentalToRemoveIterator.next();
			                maintainRental.rentals.remove(r);
			            }
			            //update the rentals csv, remove the item from the items list, and finally update the item csv
			            maintainRental.update(rentalsPath);
			            maintainItem.items.remove(itemToRemove);
			            maintainItem.update(itemsPath);
			            validRemTitle = true;
			            System.out.println("Item succesfully removed!");

			        }
			        //if user tries to remove item that doesn't exist
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



}