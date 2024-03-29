package actions;


import java.time.LocalDate;
import items.PhysicalItem;
import maintaining.MaintainPhysicalItems;
import maintaining.MaintainUser;
import userTypes.User;
//This class is to handle each rental interaction
public class Rent {

	private LocalDate dateBorrowed;
	private LocalDate dateDue;
	private LocalDate dateReturned;
	private User user;
	private PhysicalItem item;
	private int userId;
	private int itemId;
	private int rentalId;
	private static int lastId = 0;


	//used to access and update the csv files
	String userPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/user.csv";
	MaintainUser maintainUser = new MaintainUser();

	String itemsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/items.csv";
	MaintainPhysicalItems  maintainItem = new MaintainPhysicalItems();

	//this constructor is for creating rent objects from the csv file
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
	}
	//this constructor is for creating new rent objects
	public Rent(User user, String itemTitle, String itemAuthor, MaintainPhysicalItems maintainItems) throws Exception {
		this.user = user;
		System.out.println(user);
		this.userId = user.getId();	
		setItemId(itemTitle, itemAuthor);
		this.dateBorrowed = LocalDate.now();
		this.dateDue = this.dateBorrowed.plusDays(30);
		this.dateReturned = null;
		this.rentalId = ++lastId;
		setItem(this.itemId);
		maintainItems.decreaseCopies(this.item.getId());
	}



	//getters and setters
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




	
}