package items;

public class Magazine extends PhysicalItem{

	public Magazine(String title, String author, String itemType) {
		super(title,author,itemType);
	}
	
	public Magazine(String title, String author, String itemType, int numOfCopies) {
		super(title,author, itemType, numOfCopies);
	}

}
