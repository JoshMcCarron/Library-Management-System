package structure;


import actions.Open;
import actions.Rent;
import items.Book;
import items.Magazine;
import items.Newsletter;
import items.OnlineBook;
import userTypes.*;

public class Main {
	public static void main(String[]args) {
		

		Student user1 = new Student("joshmcc@my.yorku.ca", "password");
		Visitor user2 = new Visitor("random@gmail.com", "password");
		user1.register("joshmcc@my.yorku.ca", "password",user1.getValidate());
		user2.register("random@gmail.com", "password",user2.getValidate());
		Management manager = Management.getManagement();

		if (user1.getValidate() == true) {
			manager.validate((User) user1);
		}

		Book book1 = new Book(20,"Percy Jackson");



		Rent rent1 = new Rent(user1,book1,01);
		rent1.setDateDue(rent1.getDateBorrowed()+30);
		rent1.rentItem(rent1);
		System.out.println("You have rented out " + rent1.getItem().getTitle());
		System.out.println("It is due on: "+ rent1.getDateDue());


		for (Rent rent : user1.getRentals()) {
			System.out.println("title: "+rent.getItem().getTitle()); // Assuming Rent class has overridden toString() method
		}
		System.out.println("Has "+ rent1.getItem().getTitle()+ " been returned "+ rent1.getReturned());


		//rent1.returnItem(rent1);
		System.out.println("Has "+ rent1.getItem().getTitle()+ " been returned "+ rent1.getReturned());
		rent1.setCurrentDate(35);
		System.out.println("Is "+ rent1.getItem().getTitle()+ " overdue? "+rent1.isOverdue(rent1));
		rent1.calculatePenalty(rent1);
		System.out.println("The fine for that book is: "+ rent1.getPenalty());
		System.out.println("The total amount of fines on your account is: " +user1.totalPenalty(user1));


		System.out.println("Currently you are renting out " +user1.getRentals().size()+ " items.");
		System.out.println("Out of the books you are renting, "+ user1.totalOverdue(user1) +" are overdue");

		Newsletter NYTimes = new Newsletter("NY Times");
		OnlineBook JJK = new OnlineBook("Jujutsu Kaisen");

		Open view1 = new Open(NYTimes, user1);
		Open view2 = new Open(JJK, user1);

		view1.openResource(NYTimes, user1);
		view2.openResource(JJK, user1);
		view1.openResource(NYTimes, user1);

		Magazine magazine1 = new Magazine(20, "random Mag");
		Rent rent2 = new Rent(user1, magazine1, 01);
		rent2.setDateDue(rent2.getDateBorrowed()+30);
		rent2.rentItem(rent2);
		System.out.println("You have rented out " + rent2.getItem().getTitle());
		System.out.println("It is due on: "+ rent2.getDateDue());

		for (Rent rent : user1.getRentals()) {
			System.out.println("title: "+rent.getItem().getTitle()); // Assuming Rent class has overridden toString() method
		}
		user1.login("joshmcc@my.yorku.ca", "password");

	}
}
