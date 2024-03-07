package structure;

import items.PhysicalItem;
import userTypes.*;
import java.util.Random;

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

	public int  validate() {
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1;

        return randomNumber;
	}
	

    public void consult(Faculty faculty) {
        // implementation here
    }

    public void addItem(PhysicalItem item) {
        // implementation here
    }

    public void enableItem(PhysicalItem item) {
        // implementation here
    }

    public void disableItem(PhysicalItem item) {
        // implementation here
    }
}
