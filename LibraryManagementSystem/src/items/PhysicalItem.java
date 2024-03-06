package items;

public abstract class PhysicalItem {
    private int numOfCopies;
    private String title;
    private int uniqueID;
    private String location;
    private boolean purchaseAvailability;
	
	public PhysicalItem(int copies, String title) {
		this.numOfCopies = copies;
		this.title = title;
	}
	public int getNumOfCopies() {
		return numOfCopies;
	}
	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
