package gui;

import javax.swing.*;

import actions.Rent;
import course.Course;
import maintaining.MaintainCourses;
import userTypes.User;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;

public class Description extends JFrame {

	public Description(String name, User user, MaintainCourses maintainCourse) {
		setTitle(name);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setLocationRelativeTo(null);




		JTextArea textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		LocalDateTime now = LocalDateTime.now();

		for (Rent rent : user.getRentals()) {
			if(name.equals(rent.getItem().getTitle())) {
				textArea.append("Title: "+ rent.getItem().getTitle() + "\n");
				textArea.append("Author: "+ rent.getItem().getAuthor() + "\n");
				textArea.append("Date Borrowed: "+ rent.getDateBorrowed() + "\n");
				textArea.append("Date Due: "+ rent.getDateBorrowed() + "\n");

				LocalDateTime dueDateTime = rent.getDateDue().atStartOfDay();
				long days = ChronoUnit.DAYS.between(now, dueDateTime);

				if (days <= 1 && days >= 0) {
					textArea.append("Warning: "+ rent.getItem().getTitle()+ " is due in the next day." + "\n");
				} else if (days < 0) {
					textArea.append("Warning: "+ rent.getItem().getTitle()+ " is overdue." + "\n");
				} 
			}

		}

		if(user.getClass().getSimpleName().equals("Faculty") || user.getClass().getSimpleName().equals("Student")) {
			for (Course c: maintainCourse.courses) {
				if (name.equals(c.getCourseName())) {
					if ((c.getFacultyId()== user.getId() || user.getId() == c.getStudentId1()|| user.getId() == c.getStudentId3() || user.getId() == c.getStudentId3())&& LocalDate.now().isBefore(c.getEndDate())) {
						textArea.append("Course Title: "+ c.getCourseName()+ "\n");
						textArea.append("Course Start Date: "+ c.getStartDate()+ "\n");
						textArea.append("Course End Date: "+ c.getEndDate()+ "\n");

						if(user.getClass().getSimpleName().equals("Faculty")){
							if (c.getTextbookStatus().equals("new")) {
								textArea.append("Textbook asociated with this course: "+ c.getTextbook()+ "(A NEW EDITION IS AVAILABLE)"+ "\n");

							}
							else {
								textArea.append("Textbook asociated with this course: "+ c.getTextbook()+ "\n");

							}
						}
						else {
							textArea.append("You have been given virtual access to the textbook:"+ c.getTextbook()+ "\n");
							textArea.append("This access will be revoked when the course ends on: "+ c.getEndDate() + "\n");

						}

					}
				}
			}

			if(user.getClass().getSimpleName().equals("Faculty")) { 
			textArea.append("Below is a list of your past textbook titles and their availability:" + "\n");

			for (Course c: maintainCourse.courses) {


				if (c.getFacultyId()== user.getId()&& LocalDate.now().isAfter(c.getEndDate())) {
					if(c.isTextAvail()) {
						textArea.append(c.getTextbook()+ ": Sorry, but currently this textbook is not available. We will notify our management to help procure this textbook for you"+ "\n");
					}
					else if (c.getTextbookStatus().equals("new")) {
						textArea.append(c.getTextbook()+ ": A NEW EDITION IS AVAILABLE"+ "\n");

					}
					else {
						textArea.append(c.getTextbook()+ ": standard edition is available"+ "\n");

					}
				}


			}
			
		}

		}








		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

}
