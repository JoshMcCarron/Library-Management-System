package userTypes;


import structure.Management;

public class Faculty extends User{
	public Faculty(int id,String email, String password, String userType) throws Exception {
		// TODO Auto-generated constructor stub
		super(id, email, password, userType);
	}
	public Faculty(String email, String password, String userType, Management manager) throws Exception {
		// TODO Auto-generated constructor stub
		super(email, password, userType, manager);
	}


}
