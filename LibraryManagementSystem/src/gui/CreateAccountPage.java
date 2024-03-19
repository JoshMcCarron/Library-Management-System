package gui;

import javax.swing.*;

import maintaining.MaintainUser;

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

    public CreateAccountPage(MaintainUser maintainUser) {
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
            if (!(email.endsWith(".com") || email.endsWith(".ca"))) {
                invalidEmail.setVisible(true);
                frame.pack();
                allFieldsValid = false;
            }
            else{
                invalidEmail.setVisible(false);
            }

            //passwords are equal
            if (!(password.equals(confirmPassword))){
                passwordsDontMatch.setVisible(true);
                frame.pack();
                allFieldsValid = false;
            }
            else{
                passwordsDontMatch.setVisible(false);
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
                if (hasUppercase && hasLowercase && hasDigit && hasSymbol) {
                    invalidPassword.setVisible(false);
                } else {
                    allFieldsValid = false;
                    invalidPassword.setVisible(true);
                }

                if(allFieldsValid){
                    //create account method
                }





        }
        if (e.getSource() == backButton) {
            RegisterPage registerPage = new RegisterPage(maintainUser);
            frame.dispose();
        }
    }
}
