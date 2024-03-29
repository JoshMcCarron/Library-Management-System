package structure;


import gui.LoginPage;
import maintaining.*;


public class Main {
	public static void main(String[]args) throws Exception{
		//NOTE: under the "actions" package, in the file "Rent", and under the "course" package, in the file "Course" there are paths that need to be updated
		//these are the paths to each of the csv files. Please edit to the location of where your files are located!
		String userPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/user.csv";
		MaintainUser maintainUser = new MaintainUser();

		String itemsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/items.csv";
		MaintainPhysicalItems  maintainItem = new MaintainPhysicalItems();

		String rentalsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/itemsBorrowed.csv";
		MaintainRentals maintainRental = new MaintainRentals();

		String purchasePath ="/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/purchased.csv";
		MaintainPurchases maintainPurchase = new MaintainPurchases();

		String coursePath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/courses.csv";
		MaintainCourses maintainCourse = new MaintainCourses();

		String onlineBook1Path = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/OnlineBook1.txt";
		String onlineBook2Path = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/OnlineBook2.txt";

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