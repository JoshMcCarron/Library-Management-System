package structure;

import java.io.File;
import java.util.Scanner;

import actions.Open;
import actions.Rent;
import items.Book;
import items.Magazine;
import items.Newsletter;
import items.OnlineBook;
import items.PhysicalItem;
import maintaining.*;
import userTypes.*;

public class Main {
	public static void main(String[]args) throws Exception{
		//temporarily using scanner but this will be the text boxes and buttons from the GUI
		Scanner scanner = new Scanner(System.in);
		boolean loggedIn = false;
		String regOrLog="";
		boolean validRent = false;

		String userPath = "C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\user.csv";
		MaintainUser maintainUser = new MaintainUser();

		String itemsPath = "C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\items.csv";
		MaintainPhysicalItems  maintainItem = new MaintainPhysicalItems();

		String rentalsPath = "C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\itemsBorrowed.csv";
		MaintainRentals maintainRental = new MaintainRentals();








		//load items
		maintainItem.load(itemsPath);
		for(PhysicalItem i: maintainItem.items){
			System.out.println(i.toString());
		}

		//load users
		maintainUser.load(userPath);
		for(User u: maintainUser.users){
			System.out.println(u.toString());
		}

		//load rentals
		maintainRental.load(rentalsPath);
		for (Rent r: maintainRental.rentals) {
			System.out.println(r.toString());
		}



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

				User user = maintainUser.login(email, password);
				if (user != null) {
					// The user has successfully logged in
					System.out.println("Login successful!");
					loggedIn = true;
					//everything accessible once logged in here

					//just to test if methods are specific to that user
					System.out.println(user);

					//display list of rentals by that user
					user.setRentals();
					for (Rent rentals: user.getRentals()) {
						System.out.println(rentals.toString());
					}
					while (!validRent) {
					    System.out.println("Enter the title of the item you would like to rent:");
					    String rentalTitle = scanner.nextLine();
					    System.out.println("Enter the author/creator of the item you would like to rent:");
					    String rentalAuthor = scanner.nextLine();

					    boolean itemExists = false;
					    for(PhysicalItem i: maintainItem.items){
					        if (i.getTitle().equals(rentalTitle) && i.getAuthor().equals(rentalAuthor)) {
					            itemExists = true;
					            validRent = true; 
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

					    if (!itemExists) {
					        System.out.println("An item with that name and author does not exist in our database");
					    }
					}









					//simulate request button
					System.out.println("Would you like to request a new book? (yes) or (no)");
					String reqOrNo = scanner.nextLine();
					//this will be moved to request class
					if (reqOrNo.equals("yes")) {
						System.out.println("Please enter the author:");
						String authorName = scanner.nextLine();
						System.out.println("Please enter the title:");
						String titleName = scanner.nextLine();
						PhysicalItem newItem = maintainItem.request(authorName, titleName);

						if (newItem != null) {
							maintainItem.items.add(newItem);
							maintainItem.update(itemsPath);
							System.out.println(titleName + " by " + authorName + " has successfully been added");
						} else {
							System.out.println("Your request has been denied!");
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



		//		Student user1 = new Student("joshmcc@my.yorku.ca", "password");
		//		Visitor user2 = new Visitor("random@gmail.com", "password");
		//		user1.register("joshmcc@my.yorku.ca", "password",user1.getValidate());
		//		user2.register("random@gmail.com", "password",user2.getValidate());
		//		Management manager = Management.getManagement();
		//
		//		if (user1.getValidate() == true) {
		//			manager.validate((User) user1);
		//		}
		//
		//		Book book1 = new Book(20,"Percy Jackson");
		//
		//
		//
		//		Rent rent1 = new Rent(user1,book1,01);
		//		rent1.setDateDue(rent1.getDateBorrowed()+30);
		//		rent1.rentItem(rent1);
		//		System.out.println("You have rented out " + rent1.getItem().getTitle());
		//		System.out.println("It is due on: "+ rent1.getDateDue());
		//
		//
		//		for (Rent rent : user1.getRentals()) {
		//			System.out.println("title: "+rent.getItem().getTitle()); // Assuming Rent class has overridden toString() method
		//		}
		//		System.out.println("Has "+ rent1.getItem().getTitle()+ " been returned "+ rent1.getReturned());
		//
		//
		//		//rent1.returnItem(rent1);
		//		System.out.println("Has "+ rent1.getItem().getTitle()+ " been returned "+ rent1.getReturned());
		//		rent1.setCurrentDate(35);
		//		System.out.println("Is "+ rent1.getItem().getTitle()+ " overdue? "+rent1.isOverdue(rent1));
		//		rent1.calculatePenalty(rent1);
		//		System.out.println("The fine for that book is: "+ rent1.getPenalty());
		//		System.out.println("The total amount of fines on your account is: " +user1.totalPenalty(user1));
		//
		//
		//		System.out.println("Currently you are renting out " +user1.getRentals().size()+ " items.");
		//		System.out.println("Out of the books you are renting, "+ user1.totalOverdue(user1) +" are overdue");
		//
		//		Newsletter NYTimes = new Newsletter("NY Times");
		//		OnlineBook JJK = new OnlineBook("Jujutsu Kaisen");
		//
		//		Open view1 = new Open(NYTimes, user1);
		//		Open view2 = new Open(JJK, user1);
		//
		//		view1.openResource(NYTimes, user1);
		//		view2.openResource(JJK, user1);
		//		view1.openResource(NYTimes, user1);
		//
		//		Magazine magazine1 = new Magazine(20, "random Mag");
		//		Rent rent2 = new Rent(user1, magazine1, 01);
		//		rent2.setDateDue(rent2.getDateBorrowed()+30);
		//		rent2.rentItem(rent2);
		//		System.out.println("You have rented out " + rent2.getItem().getTitle());
		//		System.out.println("It is due on: "+ rent2.getDateDue());
		//
		//		for (Rent rent : user1.getRentals()) {
		//			System.out.println("title: "+rent.getItem().getTitle()); // Assuming Rent class has overridden toString() method
		//		}
		//		user1.login("joshmcc@my.yorku.ca", "password");

	}
}