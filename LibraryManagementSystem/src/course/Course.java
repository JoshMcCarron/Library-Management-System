package course;

import java.time.LocalDate;
import java.util.List;

import textbook.Textbook;
import userTypes.User;

public class Course {
	private int courseId;
	private int facultyId;
	private int studentId1;
	private int studentId2;
	private int studentId3;
	private String textbook;
	private String textbookStatus;
	private LocalDate startDate;
	private LocalDate endDate;
	private String courseName;
	


	public Course(int courseId, int facultyId, int studentId1, int studentId2, int studentId3, String textbook, String textbookStatus, LocalDate startDate, LocalDate endDate, String courseName) {
		this.courseId = courseId;
		this.facultyId=facultyId;
		this.studentId1=studentId1;
		this.studentId2=studentId1;
		this.studentId3=studentId1;
		this.textbook = textbook;
		this.textbookStatus = textbookStatus;
		this.startDate = startDate;
		this.endDate = endDate;
		this.courseName = courseName;

	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public int getStudentId1() {
		return studentId1;
	}

	public void setStudentId1(int studentIdl) {
		this.studentId1 = studentIdl;
	}

	public int getStudentId2() {
		return studentId2;
	}

	public void setStudentId2(int studentId2) {
		this.studentId2 = studentId2;
	}

	public int getStudentId3() {
		return studentId3;
	}

	public void setStudentId3(int studentId3) {
		this.studentId3 = studentId3;
	}

	public String getTextbook() {
		return textbook;
	}

	public void setTextbook(String textbook) {
		this.textbook = textbook;
	}

	public String getTextbookStatus() {
		return textbookStatus;
	}

	public void setTextbookStatus(String textbookStatus) {
		this.textbookStatus = textbookStatus;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return this.getCourseName() + ": "+ this.getTextbook() +", start date: "+this.getStartDate() + ", end date: "+this.getEndDate();
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
//    public void accessVirtualText(Textbook textbook) {
	//        // implementation here
//    }
