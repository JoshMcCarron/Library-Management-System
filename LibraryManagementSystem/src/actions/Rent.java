package actions;

import items.PhysicalItem;
import userTypes.User;

public class Rent {
	private int dateBorrowed;
	private int dateDue;
	private int dateReturned;
	private User user;
	private PhysicalItem item;
	private int currentDate;
	private double penalty;
	private boolean returned = false;

	public Rent(User user, PhysicalItem item, int dateBorrowed) {
		this.dateBorrowed = dateBorrowed;
		this.item = item;
		this.user = user;

	}

	public int getDateBorrowed() {
		return dateBorrowed;
	}
	public int getDateDue() {
		return dateDue;
	}
	public void setDateDue(int dateDue) {
		this.dateDue = dateDue;
	}

	public User getUser() {
		return user;
	}

	public int getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(int currentDate) {
		this.currentDate = currentDate;
	}

	public PhysicalItem getItem() {
		return item;
	}

	public double getPenalty() {
		return this.penalty;
	}
	public boolean getReturned() {
		return this.returned;
	}
	public int getDateReturned() {
		return this.dateReturned;
	}




	public void rentItem(Rent rental) {
		if(this.user.getRentals().size() >= 10 || this.user.totalOverdue(user) == 3 ) {
			System.out.println("You are unable to rent any items");
		}
		else {
			this.user.addRental(rental);
		}
	}

	public boolean isOverdue(Rent rental) {
		if (rental.returned == false) {
			if (rental.dateDue > rental.dateBorrowed) {
				return true;
			}
		}
		return false;
	}

	public void calculatePenalty(Rent rental) {
		if (isOverdue(rental)== true) {
			this.penalty = (rental.currentDate - rental.dateDue)*0.5;
		}
		else {
			if((rental.dateReturned - rental.dateDue) > 0) {
				this.penalty = (rental.dateReturned - rental.dateDue)*0.5;
			}
		}

	}

	public void returnItem(Rent rental) {
		this.user.removeRental(rental);
		returned = true;
		this.dateReturned = this.currentDate;

	}






}
