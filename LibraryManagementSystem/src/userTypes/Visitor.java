package userTypes;

import structure.Management;

public class Visitor extends User{

	public Visitor(String email, String password, String userType) throws Exception {
		super(email, password, userType);
		// TODO Auto-generated constructor stub
	}
	
	public Visitor(String email, String password, String userType, Management manager) throws Exception {
		// TODO Auto-generated constructor stub
		super(email, password, userType, manager);
	}

}
