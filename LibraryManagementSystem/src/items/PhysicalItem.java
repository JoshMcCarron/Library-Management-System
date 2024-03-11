package items;

public abstract class PhysicalItem {
    private int numOfCopies;
    private String title;
    private static int lastId = 0;
    private int id;
    private String location;
    private boolean purchaseAvailability;
    private String author;
    private String itemType;
	
	public PhysicalItem(int id, String title, String author, String itemType, int numOfCopies, String location) {
		this.title = title;
		this.author = author;
		this.id = id;        
		this.numOfCopies= numOfCopies;
		this.itemType = itemType;
		lastId = id;
		this.location = location;
	}
	public PhysicalItem(String title, String author, String itemType) {
		this.title = title;
		this.author = author;
		this.id = ++lastId;        
		this.numOfCopies= 5;
		this.itemType = itemType;
		this.location = "UNKOWN";
	}
	
	
	
	
	
	public void decreaseCopies() {
		this.numOfCopies--;
	}
	
	public void increaseCopies() {
		this.numOfCopies++;
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
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
	@Override
	public String toString() {
		return "Item Details ["+this.itemType+": author=" + this.author + ", title=" + this.title + ",Num of Copies=" + this.numOfCopies + ", location=" + this.location +"]";
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
