package structure;

import userTypes.*;

public class Management {
	private static Management singleManageTeam;
	private Management() {
		
	}
	public static Management getManagement() {
		if (singleManageTeam == null) {
			singleManageTeam = new Management();
		}
		return singleManageTeam;
	}

	public boolean validate(User user) {
		System.out.println(user.getEmail()+ " you have successfully been validated and registered as a user of our system");
		return true;
	}
}
