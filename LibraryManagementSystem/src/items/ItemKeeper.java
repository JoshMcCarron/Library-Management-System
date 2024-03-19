package items;
//Part of Facade Pattern
public class ItemKeeper {
	private Book book;
	private Magazine magazine;
	private CD cd;
	
	public ItemKeeper() {
		
	}
	public Book createBook(String manageTitle, String manageAuthor) {
		// TODO Auto-generated method stub
		Book newBook = new Book(manageTitle, manageAuthor, "Book");
		return newBook;
	}
	public Magazine createMagazine(String manageTitle, String manageAuthor) {
		// TODO Auto-generated method stub
		Magazine newMagazine = new Magazine(manageTitle, manageAuthor, "Magazine");
		return newMagazine;

	}	
	
	public CD createCD(String manageTitle, String manageAuthor) {
		// TODO Auto-generated method stub
		CD newCD = new CD(manageTitle, manageAuthor, "CD");
		return newCD;

	}	

}
