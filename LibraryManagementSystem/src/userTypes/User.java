package userTypes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import actions.Rent;
import maintaining.MaintainPhysicalItems;
import maintaining.MaintainRentals;
import structure.Management;

public abstract class  User implements Observer{
	private String email;
	private String password;
	boolean validate;
	private ArrayList<Rent> rentals = new ArrayList<>();
	//private ArrayList
	private double fine;
	private int numOfOverdue = 0;
	private static int lastId = 0;
	private int id;
	private String userType;
	private static final String CSV_FILE_PATH = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/user.csv";
	String rentalsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/itemsBorrowed.csv";
	MaintainRentals maintainRental = new MaintainRentals();

	String itemsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/items.csv";


	public User(int id, String email, String password, String userType) throws Exception{
		this.email = email;
		this.password = password;
		this.id = id;        
		this.userType= userType;
		this.fine=0;
		lastId = id;

	}

	//	public User(String email, String password, String userType, int id) throws Exception{
	//		this.email = email;
	//		this.password = password;
	//		this.id = this.id;        
	//		this.userType= userType;
	//
	//	}

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
					this.fine=0;
					//System.out.println("Your account has successfully been validated");
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
				//System.out.println("As you are a visitor, you do not need validation");

			}
		}
	}

	//dont think this method is needed	
	//	public Rent newRent(int userId, String title, String author) {
	//		try {
	//			Rent newRental = new Rent(userId,title, author);
	//			return newRental;
	//		} catch (Exception e) {
	//			System.out.println(e.getMessage());
	//			return null;
	//		}
	//	}


	//sets the rentals for a specific user
	public void setRentals() throws Exception {
		maintainRental.load(rentalsPath);
		for (Rent r: maintainRental.rentals) {
			if (r.getUserId() == this.id) {
				if(r.getDateReturned()== null) {
					rentals.add(r);
				}
			}
		}

	}

	public ArrayList<Rent> getRentals(){
		return this.rentals;
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
		return "User [email=" + this.email + ", password=" + this.password + ",id=" + this.id + "]";
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

	public void returnRental (Rent rental, MaintainPhysicalItems maintainItem) throws Exception {
		rentals.remove(rental);
		maintainRental.returnDate(rental.getRentalId());
		maintainRental.update(rentalsPath);
		maintainItem.increaseCopies(rental.getItemId());
		maintainItem.update(itemsPath);

	}

	public double getFine() {
		return fine;
	}
	public void calculateFines(ArrayList<Rent> totalRentals) {
		LocalDate today =  LocalDate.now();
        FineContext context = new FineContext();

		//loop through rentals
		for (Rent r: totalRentals) {
			//filter rents to only this users rentals (past and current)
			if(this.getId()==r.getUserId()) {
				//calculate fine if item has already been returned
				if(r.getDateReturned()!= null) {
					//check if dateReturned > dateDue
					if (r.getDateReturned().isAfter(r.getDateDue())) {
						//fine calculation
				        long daysBetween = ChronoUnit.DAYS.between(r.getDateDue(), r.getDateReturned());
				        context.setStrategy(new NormalFineStrategy());
						this.fine = fine + daysBetween * context.executeStrategy();;
						this.numOfOverdue= numOfOverdue+ 1;
					}
				}
				//calculate fine if item has not been returned yet
				else {
					//fine calculation
					if (today.isAfter(r.getDateDue())) {
				        long daysBetween = ChronoUnit.DAYS.between(r.getDateDue(), today);
						if (daysBetween>= 15) {
							//System.out.println(r.getItem().getTitle()+ " by "+ r.getItem().getAuthor()+ " is overdue by more than 15 days. Our system deems that this item is lost. $10 has been added to your fine.");
							 context.setStrategy(new LostFineStrategy());
							this.fine = fine + context.executeStrategy();;
						}
						else {
							context.setStrategy(new NormalFineStrategy());
						this.fine = fine + daysBetween * context.executeStrategy();;
						}

					}
				}
			}
		}
	}

	public int getNumOfOverdue() {
		return numOfOverdue;
	}

	public void setNumOfOverdue(int numOfOverdue) {
		this.numOfOverdue = numOfOverdue;
	}
	
	public String update(String newEdition) {
		//System.out.println(newEdition);
		return newEdition;
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