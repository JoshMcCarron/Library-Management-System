package gui;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import actions.Rent;
import maintaining.MaintainRentals;
import userTypes.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class AppGUI extends JFrame implements ActionListener {
	private User user;
	private MaintainRentals maintainRental;

	public AppGUI(User user, MaintainRentals maintainRental) throws Exception {
		this.user = user;
		this.maintainRental = maintainRental;
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
		taskbar.add(homepage);
		taskbar.add(newspaper);
		taskbar.add(course);
		taskbar.add(request);
		taskbar.add(rent);
		taskbar.add(purchase);
		taskbar.add(returns);
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
		LocalDateTime now = LocalDateTime.now();
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
			
			//below code will be for getting fines later
//			LocalDateTime dueDateTime = rentals.getDateDue().atStartOfDay();
//			//get the days between today and the due date of the rental
//			long days = ChronoUnit.DAYS.between(now, dueDateTime);
//			//display different message depending on how close/past the due date of the rental is
//			if (days <= 1 && days >= 0) {
//				System.out.println("Warning: "+ rentals.getItem().getTitle()+ " is due in the next day.");
//			} else if (days < 0) {
//				System.out.println("Warning: "+ rentals.getItem().getTitle()+ " is overdue.");
//			} else {
//				System.out.println(rentals.toString());
//			}
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
		newspaperPanel.add(createSubSection("Newspaper 1.1"));


		return newspaperPanel;
	}

	//Course page
	private JPanel createCoursePage() {
		JPanel coursePanel = new JPanel();
		coursePanel.setLayout(new BoxLayout(coursePanel, BoxLayout.Y_AXIS));
		coursePanel.setBorder(BorderFactory.createTitledBorder("Course"));
		coursePanel.add(createSubSection("Course 1.1"));
		coursePanel.add(createSubSection("Course 1.2"));
		coursePanel.add(createSubSection("Course 1.3"));
		coursePanel.add(createSubSection("Course 1.4"));

		return coursePanel;
	}

	//Request page
	private JPanel createRequestPage() {
		JPanel requestPanel = new JPanel();
		requestPanel.setLayout(new BoxLayout(requestPanel, BoxLayout.Y_AXIS));
		requestPanel.setBorder(BorderFactory.createTitledBorder("Request New Item"));

		//Use values from "author" and "bookName" to create a request for backend
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
		JLabel priorityStatusLabel = new JLabel();
		final boolean[] requestButtonClicked = {false};
		JButton submitRequest = new JButton("Request");
		submitRequest.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				requestButtonClicked[0] = true;
				if(requestButtonClicked[0]) {
					boolean priority = true; // This is just for display. Add skeleton code. If item is priority, shows added, else it shows denied
					if (priority) {
						priorityStatusLabel.setText("Item Added");
					} else {
						priorityStatusLabel.setText("Item Denied");
					}
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
		JList<String> itemList = new JList<>();//Replace String list with our item type list for backend

		//adding examples into list
		DefaultListModel listModel = new DefaultListModel();
		itemList.setModel(listModel);
		listModel.addElement("Item 1");
		listModel.addElement("Item 2");
		listModel.addElement("Item 3");
		listModel.addElement("Item 4");

		JButton searchButton = new JButton("Search");
		searchButton.setAlignmentX(Component.CENTER_ALIGNMENT);

		// Action listener for the search button
		searchButton.addActionListener((ActionEvent e) -> {
			String searchText = searchField.getText().toLowerCase();
			DefaultListModel<String> filteredModel = new DefaultListModel<>();
			for (int i = 0; i < listModel.getSize(); i++) {
				String item = listModel.getElementAt(i).toString().toLowerCase();
				if (item.contains(searchText)) {
					filteredModel.addElement(listModel.getElementAt(i).toString());
				}
			}
			itemList.setModel(filteredModel);
		});

		//Selecting item opens the description
		itemList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					String selectedValue = itemList.getSelectedValue();
					if (selectedValue != null) {
						System.out.println("Selected item: " + selectedValue);
						Description des = new Description(selectedValue, user.getRentals());//opens description for selectedValue
					}
				}
			}
		});

		rentPanel.add(searchBarLabel);
		rentPanel.add(searchField);
		rentPanel.add(searchButton);
		rentPanel.add(new JScrollPane(itemList));


		return rentPanel;
	}

	//Purchase Page
	private JPanel createPurchasePage() {
		JPanel purchasePanel = new JPanel();
		purchasePanel.setLayout(new BoxLayout(purchasePanel, BoxLayout.Y_AXIS));
		purchasePanel.setBorder(BorderFactory.createTitledBorder("Purchase"));

		return purchasePanel;
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

				returnButtonPressed[0] = true;
				if(returnButtonPressed[0]) {
					boolean returned = true; //  This is just for display. Add skeleton code. If item is priority, shows returned, else shows unable
					if (returned) {
						returnStatusLabel.setText("Item Returned");
					} else {
						returnStatusLabel.setText("Unable to return");
					}
				}

			}
		});

		returnsPanel.add(authorPanel);
		returnsPanel.add(bookPanel);
		returnsPanel.add(submitReturn);
		returnsPanel.add(returnStatusLabel);
		return returnsPanel;
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
				Description des = new Description(name,user.getRentals());
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