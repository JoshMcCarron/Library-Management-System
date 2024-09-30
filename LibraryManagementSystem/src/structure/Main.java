package structure;


import gui.LoginPage;
import maintaining.*;


public class Main {
	public static void main(String[]args) throws Exception{
		//NOTE: under the "actions" package, in the file "Rent", under the "userTypes" package, in the file "USer", and under the "course" package, in the file "Course" there are paths that need to be updated
		//these are the paths to each of the csv files. Please edit to the location of where your files are located!
		String userPath = "user.csv";
		MaintainUser maintainUser = new MaintainUser();

		String itemsPath = "items.csv";
		MaintainPhysicalItems  maintainItem = new MaintainPhysicalItems();

		String rentalsPath = "itemsBorrowed.csv";
		MaintainRentals maintainRental = new MaintainRentals();

		String purchasePath ="purchased.csv";
		MaintainPurchases maintainPurchase = new MaintainPurchases();

		String coursePath = "courses.csv";
		MaintainCourses maintainCourse = new MaintainCourses();

		String onlineBook1Path = "OnlineBook1.txt";
		String onlineBook2Path = "OnlineBook2.txt";

		//calls method in each maintain class to create objects for each csv entry
		maintainItem.load(itemsPath);
		maintainUser.load(userPath);
		maintainRental.load(rentalsPath);
		maintainPurchase.load(purchasePath);
		maintainCourse.load(coursePath);

		//create Manager to manage ALL users
		//as one manager controls all other users, it is made a Singleton 
		Management manager = Management.getManagement();

		//load GUI
		new LoginPage(maintainUser, manager, userPath, maintainRental, maintainCourse, maintainItem, itemsPath, rentalsPath, purchasePath, maintainPurchase, onlineBook1Path, onlineBook2Path);



	}
}