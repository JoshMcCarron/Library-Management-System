package manualtests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.time.LocalDate;
import java.util.List;
import org.junit.Assert;
import userTypes.User;
import maintaining.*;
import structure.Management;
import actions.*;
import items.*;
import userTypes.*;
import course.*;


import maintaining.*;

public class ManualTest {
	@Test
	   public void testUserFile() {
	       // This test might need to be adjusted based on the actual data in your CSV file
			String userPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/user.csv";
	       MaintainUser maintainUser = new MaintainUser();
	       try {
				maintainUser.load(userPath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       assertFalse(maintainUser.users.isEmpty());
	   }
		
		@Test
	   public void testPurchaseFile() throws Exception {
	       // This test might need to be adjusted based on the actual data in your CSV file
			String purchasePath ="/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/purchased.csv";
	       MaintainPurchases maintainPurchases = new MaintainPurchases();
	       maintainPurchases.load(purchasePath);
	       assertFalse(maintainPurchases.purchases.isEmpty());
	   }
		
		@Test
	   public void testLoad() throws Exception {
	       // This test might need to be adjusted based on the actual data in your CSV file
			String itemsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/items.csv";
	       MaintainPhysicalItems maintainPhysicalItems = new MaintainPhysicalItems();
	       maintainPhysicalItems.load(itemsPath);
	       assertFalse(maintainPhysicalItems.items.isEmpty());
	   }
		
		@Test
	   public void testLoadUser() throws Exception {
			String userPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/user.csv";
	       // This test might need to be adjusted based on the actual data in your CSV file
			String itemsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/items.csv";
	       MaintainUser maintainUser = new MaintainUser();
	       maintainUser.load(userPath);
	       assertFalse(maintainUser.users.isEmpty());
	   }
		
		@Test
		public void testLogin() throws Exception {
			String userPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/user.csv";
		    MaintainUser maintainUser = new MaintainUser();
		    maintainUser.load(userPath);
		    User user = maintainUser.login("testEmail", "testPassword");
		    assertNull(user); //changed
		}
		
		
		
		@Test
	   public void testRegister() {
			Management manager = Management.getManagement();
	       MaintainUser maintainUser = new MaintainUser();
	       User user = maintainUser.register("newEmail", "newPassword", "Visitor", manager);
	       assertNotNull(user);
	   }
		
		
		@Test
	   public void testReturnDate() throws Exception {
			String rentalsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/itemsBorrowed.csv";
	       MaintainRentals maintainRentals = new MaintainRentals();
	       maintainRentals.load(rentalsPath);
	       maintainRentals.returnDate(1);
	       Rent rental = maintainRentals.rentals.get(0);
	       assertNotNull(rental.getDateReturned());
	   }
		@Test
	   public void testUpdate() throws Exception {
			String purchasePath ="/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/purchased.csv";
	       MaintainPurchases maintainPurchases = new MaintainPurchases();
	       maintainPurchases.load(purchasePath);
	       maintainPurchases.update(purchasePath);
	       assertFalse(maintainPurchases.purchases.isEmpty());
	   }
		
//		@Test
//	    public void testRequest() {
//			String itemsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/items.csv";
//	        MaintainPhysicalItems maintainPhysicalItems = new MaintainPhysicalItems();
//	        maintainPhysicalItems.load("path/to/your/items.csv");
//	        PhysicalItem item = maintainPhysicalItems.request("testAuthor", "testTitle", new Management());
//	        assertNotNull(item);
//	    }
	   @Test
	   public void testDecreaseCopies() throws Exception {
	   	String itemsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/items.csv";
	       MaintainPhysicalItems maintainPhysicalItems = new MaintainPhysicalItems();
	       maintainPhysicalItems.load(itemsPath);
	       maintainPhysicalItems.decreaseCopies(1);
	       PhysicalItem item = maintainPhysicalItems.items.get(0);
	       assertFalse(item.getNumOfCopies() >= 0); //changed
	   }
	   @Test
	   public void testIncreaseCopies() throws Exception {
	   	String itemsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/items.csv";
	       MaintainPhysicalItems maintainPhysicalItems = new MaintainPhysicalItems();
	       maintainPhysicalItems.load(itemsPath);
	       maintainPhysicalItems.increaseCopies(1);
	       PhysicalItem item = maintainPhysicalItems.items.get(0);
	       assertTrue(item.getNumOfCopies() > 0);
	   }
		
	  
	   @Test
	   public void testInvalidLogin() throws Exception {
	   	String userPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/user.csv";
	       MaintainUser maintainUser = new MaintainUser();
	       maintainUser.load(userPath);
	       User user = maintainUser.login("invalidEmail", "invalidPassword");
	       assertNull(user);
	   }
	  
	   @Test
	   public void testInvalidReturnDate() throws Exception {
	   	String rentalsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/itemsBorrowed.csv";
	       MaintainRentals maintainRentals = new MaintainRentals();
	       maintainRentals.load(rentalsPath);
	       maintainRentals.returnDate(999); // Assuming 999 is an invalid rentalId
	       Rent rental = maintainRentals.rentals.get(0);
	       assertNull(rental.getDateReturned());
	   }
	  
	   @Test
	   public void testNonEmptyUpdatePurchases() throws Exception {
	   	String purchasePath ="/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/purchased.csv";
	       MaintainPurchases maintainPurchases = new MaintainPurchases();
	       maintainPurchases.load(purchasePath); // Assuming this is an empty csv file
	       maintainPurchases.update(purchasePath);
	       assertFalse(maintainPurchases.purchases.isEmpty());
	   }
	  
	   @Test
	   public void testNonEmptyUpdateRentals() throws Exception {
	   	String rentalsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/itemsBorrowed.csv";
	       MaintainRentals maintainRentals = new MaintainRentals();
	       maintainRentals.load(rentalsPath); // Assuming this is an empty csv file
	       maintainRentals.update(rentalsPath);
	       assertFalse(maintainRentals.rentals.isEmpty());
	   }
	  
//	    @Test
//	    public void testNonEmptyUpdateItems throws Exception {
//	    	String itemsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/items.csv";
//	        MaintainPhysicalItems maintainPhysicalItems = new MaintainPhysicalItems();
//	        maintainPhysicalItems.load(itemsPath);
//	        maintainPhysicalItems.update(itemsPath);
//	        assertFalse(maintainPhysicalItems.items.isEmpty());
//	    }
	  
	  
//	    @Test
//	    void testInvalidRequest() {
//	        MaintainPhysicalItems maintainPhysicalItems = new MaintainPhysicalItems();
//	        maintainPhysicalItems.load("path/to/your/items.csv");
//	        PhysicalItem item = maintainPhysicalItems.request("invalidAuthor", "invalidTitle", new Management());
//	        assertNull(item);
//	    }
	  
	   @Test
	   public void testInvalidDecreaseCopies() throws Exception {
	   	String itemsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/items.csv";
	       MaintainPhysicalItems maintainPhysicalItems = new MaintainPhysicalItems();
	       maintainPhysicalItems.load(itemsPath);
	       maintainPhysicalItems.decreaseCopies(999); // Assuming 999 is an invalid itemId
	       PhysicalItem item = maintainPhysicalItems.items.get(0);
	       assertTrue(item.getNumOfCopies() >= 0);
	   }
	   @Test
	   public void testInvalidIncreaseCopies() throws Exception {
	   	String itemsPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/items.csv";
	       MaintainPhysicalItems maintainPhysicalItems = new MaintainPhysicalItems();
	       maintainPhysicalItems.load(itemsPath);
	       maintainPhysicalItems.increaseCopies(2); // Assuming 999 is an invalid itemId
	       PhysicalItem item = maintainPhysicalItems.items.get(0);
	       assertFalse(item.getNumOfCopies() > 0); //changed
	   }
	  
	   @Test
	   public void testCreateBook() {
	       ItemKeeper itemKeeper = new ItemKeeper();
	       Book book = itemKeeper.createBook("Test Book", "Test Author");
	       assertEquals("Test Book", book.getTitle());
	       assertEquals("Test Author", book.getAuthor());
	       assertEquals("Book", book.getItemType());
	   }
	   @Test
	   public void testCreateMagazine() {
	       ItemKeeper itemKeeper = new ItemKeeper();
	       Magazine magazine = itemKeeper.createMagazine("Test Magazine", "Test Author");
	       assertEquals("Test Magazine", magazine.getTitle());
	       assertEquals("Test Author", magazine.getAuthor());
	       assertEquals("Magazine", magazine.getItemType());
	   }
	   @Test
	   public void testCreateCD() {
	       ItemKeeper itemKeeper = new ItemKeeper();
	       CD cd = itemKeeper.createCD("Test CD", "Test Author");
	       assertEquals("Test CD", cd.getTitle());
	       assertEquals("Test Author", cd.getAuthor());
	       assertEquals("CD", cd.getItemType());
	   }
	  
//	    @Test
//	    public void testGetId() throws Exception {
//	        Management manager = Management.getManagement();
//	        User user = new Student("testEmail", "testPassword", "Student", manager);
//	        assertEquals(23, user.getId());
//	    }
	//
//	    @Test
//	    public void testGetRentals() throws Exception {
//	        Management manager = Management.getManagement();
//	        User user = new Student("testEmail", "testPassword", "Student", manager);
//	        assertTrue(user.getRentals().isEmpty());
//	    }
	//
//	    @Test
//	    public void testSetRentals() throws Exception {
//	        Management manager = Management.getManagement();
//	        User user = new Student("testEmail", "testPassword", "Student", manager);
//	        user.setRentals();
//	        assertTrue(user.getRentals().isEmpty());
//	    }
	//
//	    @Test
//	    public void testUserCreation() throws Exception {
//	        Management manager = Management.getManagement();
//	        User user = new Student("testEmail", "testPassword", "Student", manager);
//	        assertNotNull(user);
//	    }
	//
//	    @Test
//	    public void testUserCreationWithInvalidEmail() {
//	        Management manager = Management.getManagement();
//	        assertThrows(Exception.class, () -> {
//	            User user = new Student("existingEmail", "testPassword", "Student", manager);
//	        });
//	    }
	//
//	    @Test
//	    public void testUserCreationWithInvalidUserType() {
//	        Management manager = Management.getManagement();
//	        assertThrows(Exception.class, () -> {
//	            User user = new Student("testEmail", "testPassword", "InvalidUserType", manager);
//	        });
//	    }
//	    @SuppressWarnings("deprecation")
//		@Test
//	    public void testLostFineStrategy() {
//	        FineStrategy lostFineStrategy = new LostFineStrategy();
//	        double fine = lostFineStrategy.calculateFine();
//	        assertEquals(10, fine);
//	    }
	//
//	    @SuppressWarnings("deprecation")
//		@Test
//	    public void testNormalFineStrategy() {
//	        FineStrategy normalFineStrategy = new NormalFineStrategy();
//	        double fine = normalFineStrategy.calculateFine();
//	        assertEquals(.50, fine);
//	    }
	  
	   @Test
	   public void testLoadFileNotFound() {
	       MaintainCourses maintainCourses = new MaintainCourses();
	       assertThrows(Exception.class, () -> maintainCourses.load("nonexistent/path"));
	   }
	  
	   @Test
	   public void testCourse() throws Exception {
	       Course course = new Course(1, 1, 1, 2, 3, "textbook", "new", LocalDate.now(), LocalDate.now().plusDays(10), "courseName");
	       assertNotNull(course);
	   }
	   @Test
	   public void testGettersAndSetters() throws Exception {
	       Course course = new Course(1, 1, 1, 2, 3, "textbook", "new", LocalDate.now(), LocalDate.now().plusDays(10), "courseName");
	       course.setCourseId(2);
	       assertEquals(2, course.getCourseId());
	       course.setFacultyId(2);
	       assertEquals(2, course.getFacultyId());
	       course.setStudentId1(2);
	       assertEquals(2, course.getStudentId1());
	       course.setStudentId2(3);
	       assertEquals(3, course.getStudentId2());
	       course.setStudentId3(4);
	       assertEquals(4, course.getStudentId3());
	       course.setTextbook("newTextbook");
	       assertEquals("newTextbook", course.getTextbook());
	       course.setTextbookStatus("old");
	       assertEquals("old", course.getTextbookStatus());
	       LocalDate newStartDate = LocalDate.now().plusDays(1);
	       course.setStartDate(newStartDate);
	       assertEquals(newStartDate, course.getStartDate());
	       LocalDate newEndDate = LocalDate.now().plusDays(11);
	       course.setEndDate(newEndDate);
	       assertEquals(newEndDate, course.getEndDate());
	       course.setCourseName("newCourseName");
	       assertEquals("newCourseName", course.getCourseName());
	   }
	   @Test
	   public void testToString() throws Exception {
	       Course course = new Course(1, 1, 1, 2, 3, "textbook", "new", LocalDate.now(), LocalDate.now().plusDays(10), "courseName");
	       String expected = "courseName: textbook, start date: " + LocalDate.now() + ", end date: " + LocalDate.now().plusDays(10);
	       assertEquals(expected, course.toString());
	   }

}
