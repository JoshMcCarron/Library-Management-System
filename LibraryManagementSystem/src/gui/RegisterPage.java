package gui;

import javax.swing.*;

import maintaining.MaintainUser;

import java.awt.*;
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
    String accountType;
    
    //variables needed for functionality
    private MaintainUser maintainUser;

    public RegisterPage(MaintainUser maintainUser) {
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
            accountType = "Visitor";
            CreateAccountPage createAccount = new CreateAccountPage(maintainUser);
        } else if (e.getSource() == studentB) {
            accountType = "Student";
            CreateAccountPage createAccount = new CreateAccountPage(maintainUser);
        } else if (e.getSource() == facultyB) {
            accountType = "Faculty Staff";
            CreateAccountPage createAccount = new CreateAccountPage(maintainUser);
        } else if (e.getSource() == nonFacultyB) {
            accountType = "Non-Faculty Staff";
            CreateAccountPage createAccount = new CreateAccountPage(maintainUser);
        } else if (e.getSource() == loginButton) {
            LoginPage loginPage = new LoginPage(maintainUser);

        }

        frame.dispose();
    }

}
