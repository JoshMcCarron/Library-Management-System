package userTypes;

import structure.Management;


public class Student extends User{

	public Student(int id,String email, String password, String userType) throws Exception {
		// TODO Auto-generated constructor stub
		super(id,email, password, userType);
	}
	
	public Student(String email, String password, String userType, Management manager) throws Exception {
		// TODO Auto-generated constructor stub
		super(email, password, userType, manager);
	}
	public boolean getValidate() {
		return true;
	}



}
