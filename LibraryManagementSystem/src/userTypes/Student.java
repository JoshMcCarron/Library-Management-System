package userTypes;

import java.util.List;

import course.Course;
import structure.Management;
import textbook.Textbook;

public class Student extends User{
    private List<Course> courses;
    private List<Textbook> virtualTextbooks;
	public Student(String email, String password, String userType) throws Exception {
		// TODO Auto-generated constructor stub
		super(email, password, userType);
	}
	
	public Student(String email, String password, String userType, Management manager) throws Exception {
		// TODO Auto-generated constructor stub
		super(email, password, userType, manager);
	}
	public boolean getValidate() {
		return true;
	}
	
	public void accessVirtualCopy(Textbook textbook) {
		
	}


}
