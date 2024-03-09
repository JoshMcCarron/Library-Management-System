package actions;

import java.io.FileNotFoundException;
import java.time.LocalDate;

import com.csvreader.CsvReader;

import items.PhysicalItem;
import maintaining.MaintainPhysicalItems;
import maintaining.MaintainUser;
import userTypes.User;

public class Rent {
	private LocalDate dateBorrowed;
	private LocalDate dateDue;
	private LocalDate dateReturned;
	private User user;
	private PhysicalItem item;
	private int currentDate;
	private double penalty;
	private boolean returned = false;
	private int userId;
	private int itemId;
	private int rentalId;
	private static int lastId = 0;
	


	String userPath = "C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\user.csv";
	MaintainUser maintainUser = new MaintainUser();
	
	String itemsPath = "C:\\Users\\Josh\\git\\LibraryAppEECS3311\\LibraryManagementSystem\\items.csv";
	MaintainPhysicalItems  maintainItem = new MaintainPhysicalItems();
	
	public Rent(int userId, int itemId, LocalDate dateBorrowed, LocalDate dateDue, LocalDate dateReturned, int rentalId) throws Exception {
		this.userId = userId;
		this.itemId = itemId;
		this.dateBorrowed = dateBorrowed;
		this.dateDue = dateDue;
		this.dateReturned = dateReturned;
		setUser(this.userId);
		setItem(this.itemId);
		this.rentalId = rentalId;
		lastId = rentalId;
		//get access to itemcount of item and decrease by if that specific item
		
	}
	
	public Rent(int userId, String itemTitle, String itemAuthor) throws Exception {
		this.userId = userId;
		setItemId(itemTitle, itemAuthor);
		this.dateBorrowed = LocalDate.now();
		this.dateDue = this.dateBorrowed.plusDays(30);
		this.dateReturned = null;
		this.rentalId = ++lastId;
		setUser(this.userId);
		setItem(this.itemId);
		
	}
	
	
	
	
	//GET USER AND ITEM OBJECT FROM IDS!!!!
	public void setUser(int userId) throws Exception {
		maintainUser.load(userPath);
	    for (User user : maintainUser.users) {
	        if (user.getId() == userId) {
	            this.user = user;
	        }

	    }
	}
	public void setItem(int itemId) throws Exception {
		maintainItem.load(itemsPath);
	    for (PhysicalItem item : maintainItem.items) {
	        if (item.getId() == itemId) {
	            this.item = item;
	        }

	    }
	}
	
	public void setItemId(String itemTitle, String itemAuthor) throws Exception {
		maintainItem.load(itemsPath);
	    for (PhysicalItem item : maintainItem.items) {
	        if (item.getAuthor().equals(itemAuthor)&& item.getTitle().equals(itemTitle)) {
	            this.itemId = item.getId();
	        }

	    }
	}
	
	


	public LocalDate getDateBorrowed() {
		return dateBorrowed;
	}


	public void setDateBorrowed(LocalDate dateBorrowed) {
		this.dateBorrowed = dateBorrowed;
	}


	public LocalDate getDateDue() {
		return dateDue;
	}


	public void setDateDue(LocalDate dateDue) {
		this.dateDue = dateDue;
	}


	public LocalDate getDateReturned() {
		return dateReturned;
	}


	public void setDateReturned(LocalDate dateReturned) {
		this.dateReturned = dateReturned;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public int getRentalId() {
		return rentalId;
	}


	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	@Override
	public String toString() {
		return "Rental [id=" + this.rentalId + " item name=" + this.item.getTitle()+ ", rented by:" + this.user.getEmail()+  ", date borrowed="+ this.dateBorrowed + ", date due="+ this.dateDue+ ", date returned="+ this.dateReturned+"]";                                     
	}
	




	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}
	public PhysicalItem getItem() {
		return item;
	}
	public void setItem(PhysicalItem item) {
		this.item = item;
	}



//
//	public void rentItem(Rent rental) {
//		if(this.user.getRentals().size() >= 10 || this.user.totalOverdue(user) == 3 ) {
//			System.out.println("You are unable to rent any items");
//		}
//		else {
//			this.user.addRental(rental);
//		}
//	}
//
//	public boolean isOverdue(Rent rental) {
//		if (rental.returned == false) {
//			if (rental.dateDue > rental.dateBorrowed) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	public void calculatePenalty(Rent rental) {
//		if (isOverdue(rental)== true) {
//			this.penalty = (rental.currentDate - rental.dateDue)*0.5;
//		}
//		else {
//			if((rental.dateReturned - rental.dateDue) > 0) {
//				this.penalty = (rental.dateReturned - rental.dateDue)*0.5;
//			}
//		}
//
//	}
//
//	public void returnItem(Rent rental) {
//		this.user.removeRental(rental);
//		returned = true;
//		this.dateReturned = this.currentDate;
//
//	}
//
//




}
