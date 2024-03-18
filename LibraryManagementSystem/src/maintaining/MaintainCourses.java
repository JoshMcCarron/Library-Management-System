//I am not sure if this will be needed, but I added it in case
//Textbooks will be a part of each course so it will not have it's own maintain class
package maintaining;

import java.time.LocalDate;
import java.util.ArrayList;

import com.csvreader.CsvReader;



import course.Course;


public class MaintainCourses {
	public ArrayList<Course> courses = new ArrayList<Course>();
	public String path;




	public void load(String path) throws Exception{
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();

		while(reader.readRecord()){
			int param1 = Integer.parseInt(reader.get("courseId")); 
			int param2 = Integer.parseInt(reader.get("facultyId")); 
			int param3 = Integer.parseInt(reader.get("studentId1")); 
			int param4 = Integer.parseInt(reader.get("studentId2")); 
			int param5 = Integer.parseInt(reader.get("studentId3")); 
			String param6 = null; reader.get("textbook");
			String param7 = reader.get("textbookStatus");
			LocalDate date1 = LocalDate.parse(reader.get("startDate")); 
			LocalDate date2 = LocalDate.parse(reader.get("endDate"));
			String param10 = reader.get("courseName");

			if (!reader.get("textbook").isEmpty()) {
				param6 = reader.get("textbook");
			}
			

			Course course= new Course(param1, param2, param3, param4, param5, param6, param7,date1, date2, param10);
			courses.add(course);
		}

	}

}
