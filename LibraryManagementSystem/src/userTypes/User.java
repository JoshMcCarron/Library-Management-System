package userTypes;

import java.util.ArrayList;

import actions.Rent;
import items.Book;

public abstract class User {
	private String email;
	private String password;
	boolean validate;
	private ArrayList<Rent> rentals = new ArrayList<>();
	private ArrayList<Rent> rentalsLifetime = new ArrayList<>();
	private double penalty;
	private int numOfOverdue;

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public boolean getValidate() {
		return false;
	}

	
	
	public void register(String email, String password, boolean validateNeeded) {
		if (getValidate())
			System.out.println("Please wait while our management team validates your account");
		else
			System.out.println(this.email+ "You have been registered");
	}
	public void login(String email, String password) {
		System.out.println("You have been logged in");
		displayBookList();
		
		
	}
	public void displayBookList() {
		for (Rent rent : getRentals()) {
			if(rent.getItem() instanceof Book) {
				System.out.println(rent.getItem().getTitle());
				System.out.println(rent.getDateDue());

			}
		}
	}
	

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Rent> getRentals() {
		return rentals;
	}
	
	public ArrayList<Rent> getRentalHistory() {
		return rentalsLifetime;
	}
	
	
	
	public void addRental (Rent rental) {
		this.rentals.add(rental);
		this.rentalsLifetime.add(rental);
	}
	
	public void removeRental(Rent rental) {
		this.rentals.remove(rental);
		System.out.println(rental.getItem().getTitle() + " has successfully been returned!");
	}
	
	public double totalPenalty(User user) {
		for (Rent rent : user.getRentalHistory()) {
			this.penalty+= rent.getPenalty();      
		}
		return this.penalty;
	}
	

	public int totalOverdue(User user) {
		for (Rent rent : user.getRentals()) {
			if(rent.isOverdue(rent)) {
				this.numOfOverdue+= 1;      
			}
		}
		return this.numOfOverdue;
	}





}
