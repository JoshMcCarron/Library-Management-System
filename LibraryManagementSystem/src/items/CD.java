package items;

public class CD extends PhysicalItem{

	public CD(String title, String author, String itemType) {
		super(title,author, itemType);
	}
	
	public CD(String title, String author, String itemType, int numOfCopies) {
		super(title,author, itemType, numOfCopies);
	}

}
