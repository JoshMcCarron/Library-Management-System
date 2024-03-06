package course;

import java.util.List;

import textbook.Textbook;
import userTypes.Faculty;
import userTypes.Student;

public class Course {
    private int courseCode;
    private int duration;
    private String courseName;
    private Faculty professor;
    private List<Student> classList;
    private List<String> textbooks;

    public void accessVirtualText(Textbook textbook) {
        // implementation here
    }
}