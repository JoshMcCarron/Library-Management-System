package gui;

import javax.swing.*;

import maintaining.MaintainCourses;
import maintaining.MaintainPhysicalItems;
import maintaining.MaintainPurchases;
import maintaining.MaintainRentals;
import maintaining.MaintainUser;
import structure.Management;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPage implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Please Select Role:");
    JButton visitorB = new JButton("Visitor");
    JButton studentB = new JButton("Student");
    JButton facultyB = new JButton("Faculty Staff");
    JButton nonFacultyB = new JButton("Non-Faculty Staff");
    JButton loginButton = new JButton("Back to Login");
    String userType;
    
    
    //variables needed for functionality
    private MaintainUser maintainUser;
    private Management manager;
    private String userPath;
    private MaintainRentals maintainRental;
    private MaintainCourses maintainCourse;
    private MaintainPhysicalItems maintainItem;
    private String itemsPath;
    private String rentalsPath;
	private String purchasePath;
	private MaintainPurchases maintainPurchase;
	private String onlineBook1Path;
	private String onlineBook2Path;
    public RegisterPage(MaintainUser maintainUser, Management manager, String userPath, MaintainRentals maintainRental, MaintainCourses maintainCourse, MaintainPhysicalItems maintainItem, String itemsPath, String rentalsPath, String purchasePath, MaintainPurchases maintainPurchase, String onlineBook1Path, String onlineBook2Path) {
    	//initialize variables
    	this.maintainUser = maintainUser;
    	this.manager = manager;
    	this.userPath = userPath;
    	this.maintainRental = maintainRental;
    	this.maintainCourse = maintainCourse;
    	this.maintainItem = maintainItem;
    	this.itemsPath = itemsPath;
    	this.rentalsPath = rentalsPath;
		this.purchasePath = purchasePath;
		this.maintainPurchase = maintainPurchase;
		this.onlineBook1Path = onlineBook1Path;
		this.onlineBook2Path = onlineBook2Path;
    	
    	
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setUndecorated(true);


        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(label);

        visitorB.addActionListener(this);
        panel.add(visitorB);

        panel.add(studentB);
        studentB.addActionListener(this);

        panel.add(facultyB);
        facultyB.addActionListener(this);

        panel.add(nonFacultyB);
        nonFacultyB.addActionListener(this);

        panel.add(loginButton);
        loginButton.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == visitorB) {
            userType = "Visitor";
            new CreateAccountPage(maintainUser, userType, manager, userPath, maintainRental, maintainCourse, maintainItem, itemsPath, rentalsPath, purchasePath, maintainPurchase, onlineBook1Path, onlineBook2Path);
        } else if (e.getSource() == studentB) {
        	userType = "Student";
            new CreateAccountPage(maintainUser, userType, manager, userPath, maintainRental, maintainCourse, maintainItem, itemsPath, rentalsPath, purchasePath, maintainPurchase, onlineBook1Path, onlineBook2Path);
        } else if (e.getSource() == facultyB) {
        	userType = "Faculty";
            new CreateAccountPage(maintainUser, userType, manager, userPath, maintainRental, maintainCourse, maintainItem, itemsPath, rentalsPath, purchasePath, maintainPurchase, onlineBook1Path, onlineBook2Path);
        } else if (e.getSource() == nonFacultyB) {
        	userType = "Non-Faculty";
            new CreateAccountPage(maintainUser, userType, manager, userPath, maintainRental, maintainCourse, maintainItem, itemsPath, rentalsPath, purchasePath, maintainPurchase, onlineBook1Path, onlineBook2Path);
        } else if (e.getSource() == loginButton) {
            new LoginPage(maintainUser, manager, userPath, maintainRental, maintainCourse, maintainItem, itemsPath, rentalsPath, purchasePath, maintainPurchase, onlineBook1Path, onlineBook2Path);

        }

        frame.dispose();
    }

}
