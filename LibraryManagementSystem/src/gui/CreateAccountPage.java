package gui;

import javax.swing.*;

import maintaining.MaintainCourses;
import maintaining.MaintainPhysicalItems;
import maintaining.MaintainPurchases;
import maintaining.MaintainRentals;
import maintaining.MaintainUser;
import structure.Management;
import userTypes.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccountPage implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel userLabel = new JLabel("Email");
	JTextField userText = new JTextField(30);
	JLabel passLabel = new JLabel("Password");
	JPasswordField passwordText = new JPasswordField(30);
	JLabel confirmPassLabel = new JLabel("Confirm Password");
	JPasswordField confirmPasswordText = new JPasswordField(30);
	JButton registerButton = new JButton("Register");
	JLabel invalidEmail = new JLabel("Please enter valid email");
	JLabel passwordsDontMatch = new JLabel("Passwords Don't Match");
	JLabel invalidPassword = new JLabel("Password must include a combination of uppercase letters, lowercase letters, numbers, and symbols");
	JButton backButton = new JButton("Back");
	String email;
	String password;
	String confirmPassword;
	//variables needed for functionality
	private MaintainUser maintainUser;
	private String userType;
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

	public CreateAccountPage(MaintainUser maintainUser, String userType, Management manager, String userPath, MaintainRentals maintainRental, MaintainCourses maintainCourse, MaintainPhysicalItems maintainItem, String itemsPath, String rentalsPath,String purchasePath, MaintainPurchases maintainPurchase, String onlineBook1Path, String onlineBook2Path) {
		//initialize variables
		this.maintainUser = maintainUser;
		this.userType = userType;
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
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);

		userText.setMaximumSize(new Dimension(200, 25));
		passwordText.setMaximumSize(new Dimension(200, 25));
		confirmPasswordText.setMaximumSize(new Dimension(200, 25));

		panel.add(userLabel);
		panel.add(userText);
		panel.add(passLabel);
		panel.add(passwordText);
		panel.add(confirmPassLabel);
		panel.add(confirmPasswordText);
		panel.add(registerButton);
		panel.add(invalidEmail);
		panel.add(passwordsDontMatch);
		panel.add(invalidPassword);
		invalidEmail.setVisible(false);
		passwordsDontMatch.setVisible(false);
		invalidPassword.setVisible(false);
		backButton.addActionListener(this);
		panel.add(backButton);

		frame.add(panel);
		frame.setVisible(true);

		registerButton.addActionListener(this);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == registerButton) {
			email = userText.getText();
			password = new String(passwordText.getPassword());
			confirmPassword = new String(confirmPasswordText.getPassword());
			boolean allFieldsValid = true;
			//email is valid
			if (!email.endsWith(".com") && !email.endsWith(".ca")) {
				JOptionPane.showMessageDialog(null, "Please enter valid email");
				allFieldsValid = false;
				userText.setText("");
                passwordText.setText("");
                confirmPasswordText.setText("");
			}

			//passwords are equal
			if (!(password.equals(confirmPassword))){
				JOptionPane.showMessageDialog(null, "Passwords Don't Match");
				allFieldsValid = false;
				userText.setText("");
                passwordText.setText("");
                confirmPasswordText.setText("");
			}


			//password is valid
			boolean hasUppercase = false;
			boolean hasLowercase = false;
			boolean hasDigit = false;
			boolean hasSymbol = false;

			for (char c : password.toCharArray()) {
				if (Character.isUpperCase(c)) {
					hasUppercase = true;
				} else if (Character.isLowerCase(c)) {
					hasLowercase = true;
				} else if (Character.isDigit(c)) {
					hasDigit = true;
				} else {
					hasSymbol = true;
				}
			}

			// Check if all required criteria are met
			if (!hasUppercase || !hasLowercase || !hasDigit || !hasSymbol) {
				JOptionPane.showMessageDialog(null, "Password must include a combination of uppercase letters, lowercase letters, numbers, and symbols");
				allFieldsValid = false;
				userText.setText("");
                passwordText.setText("");
                confirmPasswordText.setText("");
				//invalidPassword.setVisible(false);
			} 

			if(allFieldsValid){
				//attempt to create a user object with the user's input
				User user = maintainUser.register(email, password, userType, manager);
				

				if (user != null) {
					//if user exists they are added to the list of users, and written into the user csv file
					maintainUser.users.add(user);
					try {
						maintainUser.update(userPath);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	    			// The user has successfully registered and auto logged in.
					JOptionPane.showMessageDialog(null, "Registration successful! Welcome!", "Success", JOptionPane.INFORMATION_MESSAGE);

	    			try {
						new AppGUI(user, manager, maintainRental, maintainCourse, maintainItem, itemsPath, rentalsPath, purchasePath, maintainPurchase, onlineBook1Path, onlineBook2Path, maintainUser);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	    			 frame.dispose();

				}
				else {
					//management has denied user creation
					JOptionPane.showMessageDialog(null, "Registration failed. Try again.");
					userText.setText("");
	                passwordText.setText("");
	                confirmPasswordText.setText("");

					
				}

			}





		}
		if (e.getSource() == backButton) {
			new RegisterPage(maintainUser, manager, userPath, maintainRental, maintainCourse, maintainItem, itemsPath, rentalsPath, purchasePath, maintainPurchase, onlineBook1Path, onlineBook2Path);
			frame.dispose();
		}
	}
}
