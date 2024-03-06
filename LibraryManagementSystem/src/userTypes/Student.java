package userTypes;

import java.util.List;

import course.Course;
import textbook.Textbook;

public class Student extends User{
    private List<Course> courses;
    private List<Textbook> virtualTextbooks;
	public Student(String email, String password) {
		// TODO Auto-generated constructor stub
		super(email, password);
	}
	public boolean getValidate() {
		return true;
	}
	
	public void accessVirtualCopy(Textbook textbook) {
		
	}


}
