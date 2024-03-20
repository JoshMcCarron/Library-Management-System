package gui;

import javax.swing.*;

import maintaining.MaintainCourses;
import maintaining.MaintainPhysicalItems;
import maintaining.MaintainRentals;
import maintaining.MaintainUser;
import structure.Management;
import userTypes.User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {
    private JPanel panel = new JPanel();
    private JFrame frame = new JFrame();
    private JLabel userLabel = new JLabel("Email");
    private JTextField userText = new JTextField(30);
    private JLabel passLabel = new JLabel("Password");
    private JPasswordField passwordText = new JPasswordField(30);
    private JButton loginButton = new JButton("Login");
    private JButton registerButton = new JButton("Register");
    private String email;
    private String password;
    //variables needed for functionality
    private MaintainUser maintainUser;
    private Management manager;
    private String userPath;
    private MaintainRentals maintainRental;
    private MaintainCourses maintainCourse;
    private MaintainPhysicalItems maintainItem;
    private String itemsPath;
    private String rentalsPath;

    public LoginPage(MaintainUser maintainUser, Management manager, String userPath, MaintainRentals maintainRental, MaintainCourses maintainCourse, MaintainPhysicalItems maintainItem, String itemsPath, String rentalsPath) {
    	//initialize variables
    	this.maintainUser = maintainUser;
    	this.manager = manager;
    	this.userPath = userPath;
    	this.maintainRental = maintainRental;
    	this.maintainCourse = maintainCourse;
    	this.maintainItem = maintainItem;
    	this.itemsPath = itemsPath;
    	this.rentalsPath = rentalsPath;
    	
    	
    	
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);
        frame.setLocationRelativeTo(null);

        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passLabel.setBounds(10, 50, 80, 25);
        panel.add(passLabel);

        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        registerButton.setBounds(10, 110, 80, 25);
        registerButton.addActionListener(this);
        panel.add(registerButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
        	//get email and password
            email = userText.getText();
            password = new String(passwordText.getPassword());
            User user = maintainUser.login(email, password);
    		if (user != null) {
    			// The user has successfully logged in
    			JOptionPane.showMessageDialog(null, "Registration successful! Welcome!", "Success", JOptionPane.INFORMATION_MESSAGE);

    			try {
					AppGUI mainPage = new AppGUI(user, manager, maintainRental, maintainCourse, maintainItem, itemsPath, rentalsPath);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    			 frame.dispose();
    		}
    		else {
    			JOptionPane.showMessageDialog(null, "Invalid email or password. Please try again.");
    			userText.setText("");
                passwordText.setText("");
    		}         
           
        } else if (e.getSource() == registerButton) {
            RegisterPage regPage = new RegisterPage(maintainUser, manager, userPath, maintainRental,maintainCourse, maintainItem, itemsPath, rentalsPath);
            frame.dispose();
        }
    }
}
