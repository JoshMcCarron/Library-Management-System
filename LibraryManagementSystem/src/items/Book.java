package items;

public class Book extends PhysicalItem{
	public Book(String title, String author, String itemType) {
		super(title,author, itemType);
	}
	
	public Book(String title, String author, String itemType, int numOfCopies) {
		super(title,author, itemType, numOfCopies);
	}
}
