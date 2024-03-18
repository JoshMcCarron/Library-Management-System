package userTypes;

import java.util.List;

import course.Course;
import structure.Management;
import textbook.Textbook;

public class Faculty extends User{
	protected boolean validate = true;
    private List<Course> courses;
    private List<Textbook> textbooks;
    private Management manager;
	public Faculty(int id,String email, String password, String userType) throws Exception {
		// TODO Auto-generated constructor stub
		super(id, email, password, userType);
	}
	public Faculty(String email, String password, String userType, Management manager) throws Exception {
		// TODO Auto-generated constructor stub
		super(email, password, userType, manager);
	}
	public boolean getValidate() {
		return true;
	}
	
	public Course trackCourses(Faculty faculty) {
		return null;
        // implementation here
    }

    public String trackTextbooks(Faculty faculty) {
		return null;
        // implementation here
    }

    public String offerNotification(Faculty faculty) {
		return null;
        // implementation here
    }

    public void notifyManagement(Management manager, List<Textbook> textbooks, Textbook textNotAvail) {
        // implementation here
    }
}
