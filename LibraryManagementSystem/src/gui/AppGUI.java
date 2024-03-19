package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppGUI extends JFrame {

    public AppGUI() {
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
        JButton user = new JButton("User");
        taskbar.add(user);

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

        user.addActionListener(e -> cardLayout.show(cardPanel, "User"));

        rent.addActionListener(e -> cardLayout.show(cardPanel, "Rent"));

        purchase.addActionListener(e -> cardLayout.show(cardPanel, "Purchase"));

        returns.addActionListener(e -> cardLayout.show(cardPanel, "Returns"));


    }

    //Home page
    private JPanel createHomePage() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel sectionsPanel = new JPanel(new GridLayout(1, 3));

        // First section (Books)
        JPanel section1 = new JPanel();
        section1.setLayout(new BoxLayout(section1, BoxLayout.Y_AXIS));
        section1.setBorder(BorderFactory.createTitledBorder("Book"));
        section1.add(createSubSection("Book 1.1"));
        section1.add(createSubSection("Book 1.2"));
        section1.add(createSubSection("Book 1.3"));
        section1.add(createSubSection("Book 1.4"));

        // Second section (CDs)
        JPanel section2 = new JPanel();
        section2.setLayout(new BoxLayout(section2, BoxLayout.Y_AXIS));
        section2.setBorder(BorderFactory.createTitledBorder("CD"));
        section2.add(createSubSection("CD 2.1"));
        section2.add(createSubSection("CD 2.2"));
        section2.add(createSubSection("CD 2.3"));
        section2.add(createSubSection("CD 2.4"));

        // Third section (Magazines)
        JPanel section3 = new JPanel();
        section3.setLayout(new BoxLayout(section3, BoxLayout.Y_AXIS));
        section3.setBorder(BorderFactory.createTitledBorder("Magazine"));
        section3.add(createSubSection("Magazine 3.1"));
        section3.add(createSubSection("Magazine 3.2"));
        section3.add(createSubSection("Magazine 3.3"));
        section3.add(createSubSection("Magazine 3.4"));

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

        JButton submitRequest = new JButton("Request");

        boolean priority = true; // work your magic. If item is priority, shows added, else it shows denied
        JLabel priorityStatusLabel = new JLabel();
        if (priority) {
            priorityStatusLabel.setText("Item Added");
        } else {
            priorityStatusLabel.setText("Item Denied");
        }

        // requestPanel.add(priorityStatusLabel);

        requestPanel.add(authorPanel);
        requestPanel.add(bookPanel);
        requestPanel.add(submitRequest);
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

            JButton submitReturn = new JButton("Return");

          boolean returned = true; // work your magic. If item is returned, shows returned, else it shows unable
            JLabel returnStatusLabel = new JLabel();
             if (returned) {
            returnStatusLabel.setText("Item Returned");
             } else {
            returnStatusLabel.setText("Unable to return");
            }

       // returnsPanel.add(returnStatusLabel);

            returnsPanel.add(authorPanel);
            returnsPanel.add(bookPanel);
            returnsPanel.add(submitReturn);
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
                Description des = new Description(name);
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

}