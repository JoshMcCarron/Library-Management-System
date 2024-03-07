package userTypes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import actions.Rent;
import items.Book;
import structure.Management;

public abstract class  User {
	private String email;
	private String password;
	boolean validate;
	private ArrayList<Rent> rentals = new ArrayList<>();
	private ArrayList<Rent> rentalsLifetime = new ArrayList<>();
	private double penalty;
	private int numOfOverdue;
	private static int lastId = 0;
	private int id;
	private String userType;
	private static final String CSV_FILE_PATH = "C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\user.csv";


	public User(String email, String password, String userType) throws Exception{
		this.email = email;
		this.password = password;
		this.id = ++lastId;        
		this.userType= userType;

	}

	public User(String email, String password, String userType, Management manager) throws Exception{
		// TODO Auto-generated constructor stub
		if (isEmailExists(email)) {
			throw new Exception("Email already exists!");			
		} else {
			if(!userType.equals("Visitor")) {
				if (manager.validate() > 5 ) {
					this.email = email;
					this.password = password;
					this.id = ++lastId;        
					this.userType= userType; 
					System.out.println("Your account has successfully been validated");
				}
				else {
					throw new Exception("The management team has not validated your account!");	
				}

			}
			else {
				this.email = email;
				this.password = password;
				this.id = ++lastId;        
				this.userType= userType; 
				System.out.println("As you are a visitor, you do not need validation");

			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "User {email=" + this.email + ", password=" + this.password + ",id=" + this.id + "]";
	}

	private static boolean isEmailExists(String email) {
		File csvFile = new File(CSV_FILE_PATH);
		if (csvFile.isFile()) {
			try (BufferedReader csvReader = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
				String row;
				while ((row = csvReader.readLine()) != null) {
					String[] data = row.split(",");
					if (data.length == 4 && data[1].equals(email)) {
						return true;
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}


	//	public boolean getValidate() {
	//		return false;
	//	}
	//	public void register(String email, String password, boolean validateNeeded) {
	//		if (getValidate())
	//			System.out.println("Please wait while our management team validates your account");
	//		else
	//			System.out.println(this.email+ "You have been registered");
	//	}
	//	public void login(String email, String password) {
	//		System.out.println("You have been logged in");
	//		displayBookList();
	//
	//
	//	}
	//	public void displayBookList() {
	//		for (Rent rent : getRentals()) {
	//			if(rent.getItem() instanceof Book) {
	//				System.out.println(rent.getItem().getTitle());
	//				System.out.println(rent.getDateDue());
	//
	//			}
	//		}
	//	}


	//	public ArrayList<Rent> getRentals() {
	//		return rentals;
	//	}
	//
	//	public ArrayList<Rent> getRentalHistory() {
	//		return rentalsLifetime;
	//	}
	//
	//
	//
	//	public void addRental (Rent rental) {
	//		this.rentals.add(rental);
	//		this.rentalsLifetime.add(rental);
	//	}
	//
	//	public void removeRental(Rent rental) {
	//		this.rentals.remove(rental);
	//		System.out.println(rental.getItem().getTitle() + " has successfully been returned!");
	//	}
	//
	//	public double totalPenalty(User user) {
	//		for (Rent rent : user.getRentalHistory()) {
	//			this.penalty+= rent.getPenalty();      
	//		}
	//		return this.penalty;
	//	}
	//
	//
	//	public int totalOverdue(User user) {
	//		for (Rent rent : user.getRentals()) {
	//			if(rent.isOverdue(rent)) {
	//				this.numOfOverdue+= 1;      
	//			}
	//		}
	//		return this.numOfOverdue;
	//	}







}