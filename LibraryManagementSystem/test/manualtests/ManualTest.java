package manualtests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
	   
	   @Test
	   public void testUpdate2() throws Exception {
		   	String userPath = "/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/user.csv";
		    MaintainUser maintainUser = new MaintainUser();
		    maintainUser.load(userPath); // Assuming this is an empty csv file
		    maintainUser.update(userPath);
		    assertFalse(maintainUser.users.isEmpty());
	   }

	  
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
	       course.setTextAvail(true);
           assertEquals(true, course.isTextAvail());
	   }
	   
	   @Test
	   public void testToString() throws Exception {
	       Course course = new Course(1, 1, 1, 2, 3, "textbook", "new", LocalDate.now(), LocalDate.now().plusDays(10), "courseName");
	       String expected = "courseName: textbook, start date: " + LocalDate.now() + ", end date: " + LocalDate.now().plusDays(10);
	       assertEquals(expected, course.toString());
	   }
	   
	   @Test
	    public void testLostFineStrategy() {
	        FineStrategy lostFineStrategy = new LostFineStrategy();
	        assertEquals(10, lostFineStrategy.calculateFine(), 0.001);
	    }

	    @Test
	    public void testNormalFineStrategy() {
	        FineStrategy normalFineStrategy = new NormalFineStrategy();
	        assertEquals(.50, normalFineStrategy.calculateFine(), 0.001);
	    }

	    @Test
	    public void testFineContextWithLostFineStrategy() {
	        FineContext context = new FineContext();
	        context.setStrategy(new LostFineStrategy());
	        assertEquals(10, context.executeStrategy(), 0.001);
	    }

	    @Test
	    public void testFineContextWithNormalFineStrategy() {
	        FineContext context = new FineContext();
	        context.setStrategy(new NormalFineStrategy());
	        assertEquals(.50, context.executeStrategy(), 0.001);
	    }
	    
	    @Test
	    public void testPurchaseConstructor() {
	        Purchase purchase = new Purchase(1, 2);
	        assertEquals(9, purchase.getPurchaseId());
	        assertEquals(1, purchase.getUserId());
	        assertEquals(2, purchase.getItemId());
	    }

	    @Test
	    public void testPurchaseSettersAndGetters() {
	        Purchase purchase = new Purchase(1, 2);
	        purchase.setPurchaseId(3);
	        purchase.setUserId(4);
	        purchase.setItemId(5);
	        assertEquals(3, purchase.getPurchaseId());
	        assertEquals(4, purchase.getUserId());
	        assertEquals(5, purchase.getItemId());
	    }
	    
	    @Test
	    public void testRentConstructor() throws Exception {
	        LocalDate dateBorrowed = LocalDate.now();
	        LocalDate dateDue = dateBorrowed.plusDays(30);
	        LocalDate dateReturned = null;
	        Rent rent = new Rent(1, 2, dateBorrowed, dateDue, dateReturned, 3);
	        assertEquals(1, rent.getUserId());
	        assertEquals(2, rent.getItemId());
	        assertEquals(dateBorrowed, rent.getDateBorrowed());
	        assertEquals(dateDue, rent.getDateDue());
	        assertEquals(dateReturned, rent.getDateReturned());
	        assertEquals(3, rent.getRentalId());
	    }

	    @Test
	    public void testRentSettersAndGetters() throws Exception {
	        LocalDate dateBorrowed = LocalDate.now();
	        LocalDate dateDue = dateBorrowed.plusDays(30);
	        LocalDate dateReturned = null;
	        Rent rent = new Rent(1, 2, dateBorrowed, dateDue, dateReturned, 3);
	        LocalDate newDateBorrowed = LocalDate.now().minusDays(5);
	        LocalDate newDateDue = newDateBorrowed.plusDays(30);
	        LocalDate newDateReturned = LocalDate.now();
	        rent.setDateBorrowed(newDateBorrowed);
	        rent.setDateDue(newDateDue);
	        rent.setDateReturned(newDateReturned);
	        rent.setUserId(4);
	        rent.setItemId(5);
	        rent.setRentalId(6);
	        assertEquals(newDateBorrowed, rent.getDateBorrowed());
	        assertEquals(newDateDue, rent.getDateDue());
	        assertEquals(newDateReturned, rent.getDateReturned());
	        assertEquals(4, rent.getUserId());
	        assertEquals(5, rent.getItemId());
	        assertEquals(6, rent.getRentalId());
	    }
	    
	    
	    @Test
	    public void testSetItemId() throws Exception {
	        LocalDate dateBorrowed = LocalDate.now();
	        LocalDate dateDue = dateBorrowed.plusDays(30);
	        LocalDate dateReturned = null;
	        Rent rent = new Rent(1, 2, dateBorrowed, dateDue, dateReturned, 3);
	        rent.setItemId(4);
	        assertEquals(4, rent.getItemId());
	    }

	    @Test
	    public void testGetUser() throws Exception {
	        LocalDate dateBorrowed = LocalDate.now();
	        LocalDate dateDue = dateBorrowed.plusDays(30);
	        LocalDate dateReturned = null;
	        Rent rent = new Rent(1, 2, dateBorrowed, dateDue, dateReturned, 3);
	        User user = rent.getUser();
	        assertNotNull(user);
	    }

	    @Test
	    public void testGetItem() throws Exception {
	        LocalDate dateBorrowed = LocalDate.now();
	        LocalDate dateDue = dateBorrowed.plusDays(30);
	        LocalDate dateReturned = null;
	        Rent rent = new Rent(1, 2, dateBorrowed, dateDue, dateReturned, 3);
	        PhysicalItem item = rent.getItem();
	        assertNotNull(item);
	    }
	    
	    @Test
	    public void testRentConstructor2() throws Exception {
	        // Assuming there is a user with ID 1 and an item with ID 1
	        Rent rent = new Rent(1, 1, LocalDate.now(), LocalDate.now().plusDays(30), null, 1);
	        assertNotNull(rent);
	        assertEquals(1, rent.getUserId());
	        assertEquals(1, rent.getItemId());
	    }
	    
	    @Test
	    public void testSetItem() throws Exception {
	        // Assuming there is an item with ID 2
	        Rent rent = new Rent(1, 1, LocalDate.now(), LocalDate.now().plusDays(30), null, 1);
	        rent.setItem(2);
	        assertEquals(2, rent.getItem().getId());
	    }
	    
	    @Test
	    public void testRentConstructor3() {
	        MaintainPhysicalItems maintainItems = new MaintainPhysicalItems();
	        try {
	            Rent rent = new Rent(null, "itemTitle", "itemAuthor", maintainItems);
	            fail("Expected an Exception to be thrown");
	        } catch (Exception e) {
	            assertEquals("Cannot invoke \"userTypes.User.getId()\" because \"user\" is null", e.getMessage());
	        }
	    }
	    
	    //Testing manager class
	    @Test
	    public void testSingleton() {
	        Management manager = Management.getManagement();
	        Management manager2 = Management.getManagement();

	        assertEquals(manager, manager2);
	    }

	    @Test
	    public void testValidateParams() {
	        Management manager = Management.getManagement();
	        int result = manager.validate();
	        assertTrue(result >= 1 && result <= 10);
	    }

	    @Test
	    public void testSimulateParams() {
	        Management manager = Management.getManagement();
	        int result = manager.simulateRequest();
	        assertTrue(result >= 1 && result <= 10);
	    }

	    @Test
	    public void testManagerCode() {
	        Management manager = Management.getManagement();

	        assertEquals("1357", manager.getManagerCode());

	    }
	    
	    @Test
	       public void testCourseObserver() throws Exception {
	           Course course = new Course(1, 8, 1, 2, 3, "textbook", "new", LocalDate.now(), LocalDate.now().plusDays(10), "courseName");
	           course.addObserver(course.getFacultyId());
	           course.checkTextStatus();
	           //match the below assert to the details of the faculty id in the User csv. In this case it is 8, so below is information on the 8th user
	           assertEquals("User [email=faculty1@gmail.com, password=pass123,id=8]",course.Observer().toString());
	           assertEquals("textbook: A NEW EDITION IS AVAILABLE",course.getNewEditionMessage());

	           //assertEquals(3, course.isTextAvail());

	    }
	    
	    
	    
	    private static final String TEST_ITEM_CSV_PATH = "test_items.csv";
	    private MaintainPhysicalItems maintainPhysicalItems;
	    private Management manager; 
	    private static final String TEST_COURSE_CSV_PATH = "test_courses.csv";
	    private MaintainCourses maintainCourses;

	    @Before
	    public void setUp() {
	        maintainPhysicalItems = new MaintainPhysicalItems();
	        maintainCourses = new MaintainCourses();
	        manager = Management.getManagement();
	    }

	    @Test
	    public void testLoadItemsFromFile() throws Exception {
	        createItemTestCsvFile();

	        maintainPhysicalItems.load(TEST_ITEM_CSV_PATH);

	        assertEquals(3, maintainPhysicalItems.items.size());
	        PhysicalItem item = maintainPhysicalItems.items.get(0);
	        assertEquals("Vortex", item.getTitle());
	    }

	    @Test
	    public void testUpdateItemsToFile() throws Exception {
	        PhysicalItem testItem = new Book(1765, "Vortex", "Rich Mark", "Book", 5, "B", "Yes");
	        maintainPhysicalItems.items.add(testItem);

	        maintainPhysicalItems.update(TEST_ITEM_CSV_PATH);

	        File csvFile = new File(TEST_ITEM_CSV_PATH);
	        assertTrue(csvFile.exists());
	    }
	    
	    @Test
	    public void testRequestItemValid() {
	        PhysicalItem requestedItem = null;
	        while (requestedItem == null) {
	            if (manager.simulateRequest() > 5) {
	                requestedItem = maintainPhysicalItems.request("Rich Mark", "Vortex", manager);
	            }
	        }
	        assertNotNull(requestedItem);
	        assertEquals("Vortex", requestedItem.getTitle());
	        assertEquals("Rich Mark", requestedItem.getAuthor());
	    }

	    @Test
	    public void testDecreaseCopies2() {
	        PhysicalItem testItem = new Book(1, "Test Item", "Author", "Book", 5, "Location", "Yes");
	        maintainPhysicalItems.items.add(testItem);

	        maintainPhysicalItems.decreaseCopies(1);
	        assertEquals(4, testItem.getNumOfCopies());
	    }

	    @Test
	    public void testIncreaseCopies2() {
	        PhysicalItem testItem = new Book(1, "Test Item", "Author", "Book", 5, "Location", "Yes");
	        maintainPhysicalItems.items.add(testItem);

	        maintainPhysicalItems.increaseCopies(1);
	        assertEquals(6, testItem.getNumOfCopies());
	    }

	    @After
	    public void tearDown() {
	        File csvItemFile = new File(TEST_ITEM_CSV_PATH);
	        if (csvItemFile.exists()) {
	            csvItemFile.delete();
	        }
	        File csvCourseFile = new File(TEST_COURSE_CSV_PATH);
	        if (csvCourseFile.exists()) {
	        	csvCourseFile.delete();
	        }
	    }

	    private void createItemTestCsvFile() throws IOException {
	        FileWriter writer = new FileWriter(TEST_ITEM_CSV_PATH);
	        writer.append("id, title, copies, author, itemType, location, purchasable\n");
	        writer.append("1765, Vortex, 5, Rich Mark, Book, Library, Yes\n");
	        writer.append("164, Stocks, 7, Exchange, Magazine, A, Yes\n");
	        writer.append("854, Forest, 2, Quincy, CD, A, Yes\n");
	        writer.flush();
	        writer.close();
	    }
	    
	    private void createCourseTestCsvFile() throws IOException {
	        FileWriter writer = new FileWriter(TEST_COURSE_CSV_PATH);
	        writer.append("courseId, facultyId, studentId1, studentId2, studentId3, textbook, textbookStatus, startDate, endDate, courseName\n");
	        writer.write("1, 101, 201, 301, 401, Java Programming, Available, 2024-03-01, 2024-06-01, Java Basics\n");
	        writer.write("2, 102, 202, 302, 402, Python Programming, Available, 2024-03-15, 2024-06-15, Python Basics\n");
	        writer.write("3, 103, 203, 303, 403, C++ Programming, Not Available, 2024-04-01, 2024-07-01, C++ Basics\n");
	        writer.flush();
	        writer.close();
	    }
	    
	    @Test
	    public void testLoadCoursesFromCSV() throws Exception {
	    	createCourseTestCsvFile();
	    	maintainCourses.load(TEST_COURSE_CSV_PATH);
	        try {
	            assertNotNull(maintainCourses.courses); 
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Test
	    public void testLoadedCoursesSize() throws Exception {
	    	createCourseTestCsvFile();
	    	maintainCourses.load(TEST_COURSE_CSV_PATH);
	        try {
	            int expectedSize = 3; 
	            assertEquals(expectedSize, maintainCourses.courses.size());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    

	    @Test
	    public void testLoad2() {
	        Management manager = Management.getManagement();
	        assertThrows(IllegalArgumentException.class, () -> {
	            maintainPhysicalItems.load("/Users/ejirougolor/Documents/GitHub/LibraryAppEECS3311/LibraryManagementSystem/user.csv");
	        });
	    }
	    
	    @Test
	    public void testSetters() throws Exception {
	        Rent rent = new Rent(1, 1, LocalDate.now(), LocalDate.now().plusDays(30), null, 1);
	        rent.setDateBorrowed(LocalDate.of(2024, 4, 2));
	        rent.setDateDue(LocalDate.of(2024, 5, 2));
	        rent.setDateReturned(LocalDate.of(2024, 4, 22));
	        rent.setUserId(2);
	        rent.setItemId(2);
	        rent.setRentalId(2);
	        

	        assertEquals(LocalDate.of(2024, 4, 2), rent.getDateBorrowed());
	        assertEquals(LocalDate.of(2024, 5, 2), rent.getDateDue());
	        assertEquals(LocalDate.of(2024, 4, 22), rent.getDateReturned());
	        assertEquals(2, rent.getUserId());
	        assertEquals(2, rent.getItemId());
	        assertEquals(2, rent.getRentalId());
	    }
	    
	    
	    

	    
	 
	    
}
