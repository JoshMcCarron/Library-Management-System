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
	
	public PhysicalItem(String title, String author, String itemType, int numOfCopies) {
		this.title = title;
		this.author = author;
		this.id = ++lastId;        
		this.numOfCopies= numOfCopies;
		this.itemType = itemType;
	}
	public PhysicalItem(String title, String author, String itemType) {
		this.title = title;
		this.author = author;
		this.id = ++lastId;        
		this.numOfCopies= 5;
		this.itemType = itemType;
	}
	
	
	
	
	
	public void decreaseCopies() {
		this.numOfCopies--;
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
		return "Item Details ["+this.itemType+": author=" + this.author + ", title=" + this.title + ",Num of Copies=" + this.numOfCopies + "]";
	}
}
