package items;

public class Magazine extends PhysicalItem{

	public Magazine(String title, String author, String itemType) {
		super(title,author,itemType);
	}
	
	public Magazine(int id,String title, String author, String itemType, int numOfCopies, String location,String purchasable) {
		super(id, title,author, itemType, numOfCopies, location, purchasable);
	}

}
