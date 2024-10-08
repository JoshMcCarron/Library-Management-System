package items;
//abstract class for handling each item in the system
public abstract class PhysicalItem {
	private int numOfCopies;
	private String title;
	private static int lastId = 0;
	private int id;
	private String location;
	private String author;
	private String itemType;
	private String purchasable;

	//constructor for creating item objects from the item csv file
	public PhysicalItem(int id, String title, String author, String itemType, int numOfCopies, String location, String purchasable) {
		this.title = title;
		this.author = author;
		this.id = id;        
		this.numOfCopies= numOfCopies;
		this.itemType = itemType;
		lastId = id;
		this.location = location;
		this.purchasable= purchasable;
	}
	//constructor for creating new item objects
	public PhysicalItem(String title, String author, String itemType) {
		this.title = title;
		this.author = author;
		this.id = ++lastId;        
		this.numOfCopies= 20;
		this.itemType = itemType;
		this.location = "UNKOWN";
	}

	//called when item is rented/returned
	public void decreaseCopies() {
		this.numOfCopies--;
	}

	public void increaseCopies() {
		this.numOfCopies++;
	}
	
	//getters and setters
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

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPurchasable() {
		return purchasable;
	}
	public void setPurchasable(String purchasable) {
		this.purchasable = purchasable;
	}

}
