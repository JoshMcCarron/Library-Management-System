package items;

public class Book extends PhysicalItem{
	public Book(String title, String author, String itemType) {
		super(title,author, itemType);
	}
	
	public Book(int id,String title, String author, String itemType, int numOfCopies, String location, String purchasable) {
		super(id, title,author, itemType, numOfCopies, location,purchasable);
	}
}
