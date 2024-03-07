package maintaining;

import java.io.FileWriter;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import userTypes.*;

public class MaintainUser {
	public ArrayList<User> users = new ArrayList<User>();
	public String path;

	public void load(String path) throws Exception{
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();

		while(reader.readRecord()){
		    String userType = reader.get("userType");
		    User user;

		    switch(userType) {
		        case "Student":
		            user = new Student(path, path, path);
		            break;
		        case "Faculty":
		            user = new Faculty(path, path, path);
		            break;
		        case "Non-Faculty":
		            user = new NonFaculty(path, path, path);
		            break;
		        case "Visitor":
		            user = new Visitor(path, path, path);
		            break;
		        default:
		            throw new IllegalArgumentException("Invalid user type: " + userType);
		    }

		    user.setId(Integer.parseInt(reader.get("id")));
		    user.setEmail(reader.get("email"));
		    user.setPassword(reader.get("password"));
		    user.setUserType(userType);
		    users.add(user);
		}
	}

	public void update(String path) throws Exception{
		try {		
			CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
			csvOutput.write("id");
			csvOutput.write("email");
			csvOutput.write("password");
			csvOutput.write("userType");
			csvOutput.endRecord();

			for(User u: users){
				if (u.getId() >= 0) { // Only write to CSV if user was successfully created
					csvOutput.write(Integer.toString(u.getId()));
					csvOutput.write(u.getEmail());
					csvOutput.write(u.getPassword());
					csvOutput.write(u.getUserType());
					csvOutput.endRecord();
				}
			}
			csvOutput.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}