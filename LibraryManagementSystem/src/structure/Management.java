package structure;

import items.PhysicalItem;
import userTypes.*;
import java.util.Random;

public class Management {
	private static Management singleManageTeam;
	private final String managerCode = "1357";
	private Management() {
		
	}
	public static Management getManagement() {
		if (singleManageTeam == null) {
			singleManageTeam = new Management();
		}
		return singleManageTeam;
	}

	public int  validate() {
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1;

        return randomNumber;
	}
	

    public void consult(Faculty faculty) {
        // implementation here
    }

//    public int addItem() {
//
//    }
    
	public int simulateRequest() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(10) + 1;
		return randomNumber;		
	}



    public void disableItem(PhysicalItem item) {
        // implementation here
    }
	public String getManagerCode() {
		return managerCode;
	}
}
