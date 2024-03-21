package gui;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import actions.Rent;
import course.Course;
import items.PhysicalItem;
import maintaining.MaintainCourses;
import maintaining.MaintainPhysicalItems;
import maintaining.MaintainPurchases;
import maintaining.MaintainRentals;
import search.Search;
import structure.Management;
import userTypes.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
public class AppGUI extends JFrame implements ActionListener {
	private User user;
	private MaintainRentals maintainRental;
	private MaintainCourses maintainCourse;
	private MaintainPhysicalItems maintainItem;
	private Management manager;
	private String itemsPath;
	private String rentalsPath;
	private String purchasePath;
	private MaintainPurchases maintainPurchase;
	private String onlineBook1Path;
	private String onlineBook2Path;

	public AppGUI(User user,Management manager, MaintainRentals maintainRental, MaintainCourses maintainCourse, MaintainPhysicalItems maintainItem, String itemsPath, String rentalsPath, String purchasePath, MaintainPurchases maintainPurchase, String onlineBook1Path, String onlineBook2Path) throws Exception {
		this.user = user;
		this.maintainRental = maintainRental;
		this.maintainCourse = maintainCourse;
		this.maintainItem = maintainItem;
		this.manager = manager;
		this.itemsPath = itemsPath;
		this.rentalsPath = rentalsPath;
		this.purchasePath = purchasePath;
		this.maintainPurchase = maintainPurchase;
		this.onlineBook1Path = onlineBook1Path;
		this.onlineBook2Path = onlineBook2Path;
		
		setTitle("Library");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 800);

		JPanel taskbar = new JPanel();
		taskbar.setBackground(Color.LIGHT_GRAY);

		taskbar.setLayout(new BoxLayout(taskbar, BoxLayout.X_AXIS));


		//left side buttons
		JButton homepage = new JButton("Home Page");
		JButton newspaper = new JButton("Newspaper");
		JButton course = new JButton("Course");
		JButton request = new JButton("Request");
		JButton rent = new JButton("Rent");
		JButton purchase = new JButton("Purchase");
		JButton returns = new JButton("Returns");
		JButton onlineBooks = new JButton("Online Books");
		taskbar.add(homepage);
		taskbar.add(newspaper);
		taskbar.add(course);
		taskbar.add(request);
		taskbar.add(rent);
		taskbar.add(purchase);
		taskbar.add(returns);
		taskbar.add(onlineBooks);
		taskbar.add(Box.createHorizontalGlue());


		//right side button
		JButton userButton = new JButton("User");
		taskbar.add(userButton);

		// Creating a nested panel for the main content
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(taskbar, BorderLayout.NORTH);

		// Initialize CardLayout and panel to hold cards
		CardLayout cardLayout = new CardLayout();
		Container cardPanel = new JPanel(cardLayout);

		// Add panels to the card panel
		cardPanel.add(createHomePage(), "Home Page");
		cardPanel.add(createNewspaperPage(), "Newspaper");
		cardPanel.add(createCoursePage(), "Course");
		cardPanel.add(createRequestPage(), "Request");
		cardPanel.add(createUserPage(), "User");
		cardPanel.add(createRentPage(), "Rent");
		cardPanel.add(createPurchasePage(), "Purchase");
		cardPanel.add(createReturnsPage(),"Returns");
        cardPanel.add(createOnlineBooksPage(), "Online Books");


		// Add card panel to the main panel
		getContentPane().add(cardPanel, BorderLayout.CENTER);

		setLocationRelativeTo(null);
		setVisible(true);

		// Add action listener to the task bar buttons
		homepage.addActionListener(e -> cardLayout.show(cardPanel, "Home Page"));

		newspaper.addActionListener(e -> cardLayout.show(cardPanel, "Newspaper"));

		course.addActionListener(e -> cardLayout.show(cardPanel, "Course"));

		request.addActionListener(e -> cardLayout.show(cardPanel, "Request"));

		userButton.addActionListener(e -> cardLayout.show(cardPanel, "User"));

		rent.addActionListener(e -> cardLayout.show(cardPanel, "Rent"));

		purchase.addActionListener(e -> cardLayout.show(cardPanel, "Purchase"));

		returns.addActionListener(e -> cardLayout.show(cardPanel, "Returns"));
		
        onlineBooks.addActionListener(e -> cardLayout.show(cardPanel, "Online Books"));



	}

	//Home page
	private JPanel createHomePage() throws Exception {
		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel sectionsPanel = new JPanel(new GridLayout(1, 3));

		// First section (Books)
		JPanel section1 = new JPanel();




		// first section (Book)
		section1.setLayout(new BoxLayout(section1, BoxLayout.Y_AXIS));
		section1.setBorder(BorderFactory.createTitledBorder("Book"));

		// Second section (CDs)
		JPanel section2 = new JPanel();
		section2.setLayout(new BoxLayout(section2, BoxLayout.Y_AXIS));
		section2.setBorder(BorderFactory.createTitledBorder("CD"));

		// Third section (Magazines)
		JPanel section3 = new JPanel();
		section3.setLayout(new BoxLayout(section3, BoxLayout.Y_AXIS));
		section3.setBorder(BorderFactory.createTitledBorder("Magazine"));


		//variable for getting current date/time
		user.setRentals();
		//loop through user rentals //and create a new subsection for 
		for (Rent rentals: user.getRentals()) {

			if (rentals.getItem().getItemType().equals("Book")) {
				section1.add(createSubSection(rentals.getItem().getTitle()));
			}
			else if (rentals.getItem().getItemType().equals("CD")) {
				section2.add(createSubSection(rentals.getItem().getTitle()));
			}
			else if (rentals.getItem().getItemType().equals("Magazine")) {
				section3.add(createSubSection(rentals.getItem().getTitle()));
			}


		}//end of rentals for loop

		//display user fines
		//		user.calculateFines(maintainRental.rentals);
		//		System.out.println("You have a collective fine of $"+ user.getFine());



		sectionsPanel.add(section1);
		sectionsPanel.add(section2);
		sectionsPanel.add(section3);

		// Adding nested panel to the main panel
		mainPanel.add(sectionsPanel, BorderLayout.CENTER);

		return mainPanel;
	}

	//Newspaper page
	private JPanel createNewspaperPage() {
		JPanel newspaperPanel = new JPanel();
		newspaperPanel.setLayout(new BoxLayout(newspaperPanel, BoxLayout.Y_AXIS));
		newspaperPanel.setBorder(BorderFactory.createTitledBorder("Newspaper"));
		newspaperPanel.add(createSubSection("The NewYork Times"));


		return newspaperPanel;
	}

	//Course page
	private JPanel createCoursePage() {
		JPanel coursePanel = new JPanel();
		coursePanel.setLayout(new BoxLayout(coursePanel, BoxLayout.Y_AXIS));
		coursePanel.setBorder(BorderFactory.createTitledBorder("Course"));
		for (Course c: maintainCourse.courses) {
			if ((c.getFacultyId()== user.getId() || user.getId() == c.getStudentId1()|| user.getId() == c.getStudentId3() || user.getId() == c.getStudentId3())&& LocalDate.now().isBefore(c.getEndDate())) {
				if ((c.getFacultyId()== user.getId() || user.getId() == c.getStudentId1()|| user.getId() == c.getStudentId3() || user.getId() == c.getStudentId3())&& LocalDate.now().isBefore(c.getEndDate())) 
					coursePanel.add(createSubSection(c.getCourseName()));

			}
		}


		return coursePanel;
	}

	//Request page
	private JPanel createRequestPage() {
		JPanel requestPanel = new JPanel();
		requestPanel.setLayout(new BoxLayout(requestPanel, BoxLayout.Y_AXIS));
		requestPanel.setBorder(BorderFactory.createTitledBorder("Request New Item"));

		//Use values from "author" and "bookName" to create a request for backend
		JLabel authorLabel = new JLabel("Enter Author Name:");
		JPanel authorPanel = new JPanel();
		JTextField author = new JTextField();
		author.setPreferredSize(new Dimension(600, 70));
		authorPanel.add(authorLabel);
		authorPanel.add(author);

		JLabel bookLabel = new JLabel("Enter Book Name:");
		JPanel bookPanel = new JPanel();
		JTextField bookName = new JTextField();
		bookName.setPreferredSize(new Dimension(600, 70));
		bookPanel.add(bookLabel);
		bookPanel.add(bookName);
		JLabel priorityStatusLabel = new JLabel();
		final boolean[] requestButtonClicked = {false};
		JButton submitRequest = new JButton("Request");
		//button for submitting request
		submitRequest.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//try to create a new item. The manager will decide
				PhysicalItem newItem = maintainItem.request(author.getText(), bookName.getText(), manager);
				if (newItem != null) {
					maintainItem.items.add(newItem);
					try {
						maintainItem.update(itemsPath);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					priorityStatusLabel.setText("Your request for " +  bookName.getText() + " by " + author.getText() + " has been prioritized and successfully been added");
					//if manager does not add item
				} else {
					priorityStatusLabel.setText("Your request has been denied!");
					author.setText("");
					bookName.setText("");
				}



			}

		});

		requestPanel.add(priorityStatusLabel);
		requestPanel.add(authorPanel);
		requestPanel.add(bookPanel);
		requestPanel.add(submitRequest);
		requestPanel.add(priorityStatusLabel);
		return requestPanel;
	}

	//User Page
	private JPanel createUserPage() {
		JPanel userPanel = new JPanel();
		JLabel searchBarLabel = new JLabel("Search Bar");
		searchBarLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		userPanel.setLayout(new BoxLayout(userPanel, BoxLayout.Y_AXIS));
		userPanel.setBorder(BorderFactory.createTitledBorder("User"));

		return userPanel;
	}

	//Rent Page
	private JPanel createRentPage() {
		JPanel rentPanel = new JPanel();
		rentPanel.setLayout(new BoxLayout(rentPanel, BoxLayout.Y_AXIS));
		rentPanel.setBorder(BorderFactory.createTitledBorder("Rent"));

		//search bar
		JLabel searchBarLabel = new JLabel("Search Bar");
		searchBarLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JTextField searchField = new JTextField();
		searchField.setMaximumSize(new Dimension(2000,40));


		DefaultListModel<String> listModel;
		listModel = new DefaultListModel<>();



		searchField.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				filter();
			}
			public void removeUpdate(DocumentEvent e) {
				filter();
			}
			public void insertUpdate(DocumentEvent e) {
				filter();
			}
			public void filter() {
				String filter = searchField.getText();
				listModel.clear();
				for (PhysicalItem item : maintainItem.items) {
					String title = item.getTitle();
					if (title.startsWith(filter)) {
						listModel.addElement(title);
					}
				}
			}
		});

		JButton rentButton = new JButton("Rent");
		rentButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		rentButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String searchedItem = searchField.getText();
				for (PhysicalItem item : maintainItem.items) {
					if (item.getTitle().equals(searchedItem)) {
						String author = item.getAuthor();
						if (user.getRentals().size()==10) {
			    			JOptionPane.showMessageDialog(null, "You have reached the max amount of rentals! Please return items to rent again");
						}
						else if(user.getNumOfOverdue()==3) {
			    			JOptionPane.showMessageDialog(null, "You have 3 rentals overdue! Please return items to rent again");
						}
						else {
							Rent newRental = null;
							try {
								newRental = new Rent(user, searchedItem, author, maintainItem);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							if (newRental != null) {
								maintainRental.rentals.add(newRental);
								try {
									maintainRental.update(rentalsPath);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								try {
									maintainItem.update(itemsPath);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}

				    			JOptionPane.showMessageDialog(null, "Item successfully rented!", "Success", JOptionPane.INFORMATION_MESSAGE);
								break;
							}
							else{
				    			JOptionPane.showMessageDialog(null, "An item with that name and author does not exist in our database");

							}
						}
					}

				}
				searchField.setText(""); // Clear the text field
			}
		});
		JList<String> bookList = new JList<>(listModel);
		JScrollPane scrollPane = new JScrollPane(bookList);



		rentPanel.add(searchField);
		rentPanel.add(rentButton);
		rentPanel.add(scrollPane);
















		return rentPanel;
	}

	//Purchase Page
	private JPanel createPurchasePage() {
		JPanel purchasePanel = new JPanel();
		purchasePanel.setLayout(new BoxLayout(purchasePanel, BoxLayout.Y_AXIS));
		purchasePanel.setBorder(BorderFactory.createTitledBorder("Purchase"));
		
        //incorporate real purchasable books
		for(PhysicalItem i: maintainItem.items){
			//Purchasable attribute in item contains a value
			if(i.getPurchasable()!= "") {
				//purchasable is converted to a double value, and a sale is displayed if there
				if(Double.parseDouble(i.getPurchasable())<5) {
					purchasePanel.add(openPurchaseDetails(i.getTitle(), i.getAuthor(), i.getPurchasable(), i));
					System.out.println("SALE! $"+i.getPurchasable()+": " +i.getTitle() +" by "+i.getAuthor());
				}
				else {
					purchasePanel.add(openPurchaseDetails(i.getTitle(), i.getAuthor(), i.getPurchasable(), i));
					System.out.println("$"+i.getPurchasable()+": "+i.getTitle() +" by "+i.getAuthor());

				}
			}//end of items for loop

		}
		
		
		
		
        //purchasePanel.add(openPurchaseDetails("Book 1", "Bob", 6));
        //purchasePanel.add(openPurchaseDetails("Book 2", "John", 3));

		return purchasePanel;
	}
	
    //Purchase page
    private JPanel openPurchaseDetails(String name, String author, String cost, PhysicalItem item) {
        JPanel subSection = new JPanel();
        subSection.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JLabel label = new JLabel(name);
        subSection.add(label);


        subSection.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //details will have the details of author and price added
                PurchaseDetails details = new PurchaseDetails(name,author,cost, user, item, purchasePath, maintainPurchase);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                subSection.setBackground(Color.lightGray);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                subSection.setBackground(null);
            }
        });

        return subSection;
    }


	
	
	
	
	
	
	
	
	
	//Returns Page
	private JPanel createReturnsPage() {
		JPanel returnsPanel = new JPanel();
		returnsPanel.setLayout(new BoxLayout(returnsPanel, BoxLayout.Y_AXIS));
		returnsPanel.setBorder(BorderFactory.createTitledBorder("Return An Item"));


		//Use values from "author" and "bookName" to create a return for backend
		JLabel authorLabel = new JLabel("Enter Author Full Name:");
		JPanel authorPanel = new JPanel();
		JTextField author = new JTextField();
		author.setPreferredSize(new Dimension(600, 70));
		authorPanel.add(authorLabel);
		authorPanel.add(author);

		JLabel bookLabel = new JLabel("Enter Book Name:");
		JPanel bookPanel = new JPanel();
		JTextField bookName = new JTextField();
		bookName.setPreferredSize(new Dimension(600, 70));
		bookPanel.add(bookLabel);
		bookPanel.add(bookName);
		final boolean[] returnButtonPressed = {false};
		JButton submitReturn = new JButton("Return");
		JLabel returnStatusLabel = new JLabel();
		submitReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean validReturn = false;
				for (Rent rental: user.getRentals()) {
					//if item exists return it
					if(rental.getItem().getTitle().equals(bookName.getText()) && rental.getItem().getAuthor().equals(author.getText())) {
						
						//method in user to returnRental
						try {
							validReturn = true;
							user.returnRental(rental, maintainItem);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						returnStatusLabel.setText("Item Returned");
						break;
					}
				}
				if(!validReturn) {
					returnStatusLabel.setText("Unable to return item");
				}
				

			}
		});

		returnsPanel.add(authorPanel);
		returnsPanel.add(bookPanel);
		returnsPanel.add(submitReturn);
		returnsPanel.add(returnStatusLabel);
		return returnsPanel;
	}
	
    //Online Books Page
    private JPanel createOnlineBooksPage() {
        JPanel OBookPanel = new JPanel();
        OBookPanel.setLayout(new BoxLayout(OBookPanel, BoxLayout.Y_AXIS));
        OBookPanel.setBorder(BorderFactory.createTitledBorder("Online Books"));
        //incorporate real online books
        
        OBookPanel.add(openOBook("The Adventure of the Lost Jewel"));
        OBookPanel.add(openOBook("The Mystery of the Whispering Woods"));
        return OBookPanel;
    }
    
    //Open Online Book
    private JPanel openOBook(String name) {
    	
        JPanel subSection = new JPanel();
        subSection.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JLabel label = new JLabel(name);
        subSection.add(label);


        subSection.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	if(name.equals("The Adventure of the Lost Jewel")) {
            		//path to online book one
					Path path1 = Paths.get(onlineBook1Path);
					String content;
					try {
						content = Files.readString(path1);
		        		OnlineBook onlineBook = new OnlineBook(name, content);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

            	}
            	else {
            		Path path2 = Paths.get(onlineBook2Path);						        
					String content;
					try {
						content = Files.readString(path2);
		        		OnlineBook onlineBook = new OnlineBook(name, content);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

            	}

            	
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                subSection.setBackground(Color.lightGray);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                subSection.setBackground(null);
            }
        });

        return subSection;
    }

	//Subsections
	private JPanel createSubSection(String name) {
		JPanel subSection = new JPanel();
		subSection.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JLabel label = new JLabel(name);
		subSection.add(label);

		subSection.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Description des = new Description(name,user, maintainCourse);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				subSection.setBackground(Color.lightGray);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				subSection.setBackground(null);
			}
		});

		return subSection;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}