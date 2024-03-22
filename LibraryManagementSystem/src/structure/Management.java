package structure;

import java.util.Random;
//this class if for creating a single Manager to manage the entire system (Singleton)
public class Management {
	private static Management singleManageTeam;
	private final String managerCode = "1357";
	private Management() {
		
	}
	//singleton constructor
	public static Management getManagement() {
		if (singleManageTeam == null) {
			singleManageTeam = new Management();
		}
		return singleManageTeam;
	}
	
	//randomizer for validating users or not
	public int  validate() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        return randomNumber;
	}
	  
	public int simulateRequest() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(10) + 1;
		return randomNumber;		
	}

	public String getManagerCode() {
		return managerCode;
	}
}
