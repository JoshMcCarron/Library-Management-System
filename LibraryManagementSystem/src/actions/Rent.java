package actions;

import java.time.LocalDate;

import items.PhysicalItem;
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
	

	public Rent(int userId, int itemId, LocalDate dateBorrowed, LocalDate dateDue, LocalDate dateReturned) {
		this.userId = userId;
		this.itemId = itemId;
		this.dateBorrowed = dateBorrowed;
		this.dateDue = dateDue;
		this.dateReturned = dateReturned;
		this.rentalId = ++ lastId;
		
		//GET USER AND ITEM OBJECT FROM IDS!!!!
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
		return "Rental [id=" + this.rentalId + ", userID=" + this.userId + ", itemID=" + this.itemId + ", date borrowed="+ this.dateBorrowed + ", date due="+ this.dateDue+ ", date returned="+ this.dateReturned+"]";                                     
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
