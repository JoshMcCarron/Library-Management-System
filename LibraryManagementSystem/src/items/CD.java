package items;

public class CD extends PhysicalItem{

	public CD(String title, String author, String itemType) {
		super(title,author, itemType);
	}
	
	public CD(int id,String title, String author, String itemType, int numOfCopies, String location,String purchasable) {
		super(id,title,author, itemType, numOfCopies, location,purchasable);
	}

}
