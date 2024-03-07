package course;

import java.util.List;

import textbook.Textbook;
import userTypes.User;

public class Course {
    private int courseCode;
    private int duration;
    private String courseName;
    private User professor;
    private List<User> classList;
    private List<String> textbooks;

    public void accessVirtualText(Textbook textbook) {
        // implementation here
    }
}