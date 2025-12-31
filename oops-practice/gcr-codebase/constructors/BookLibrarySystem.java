package constructors;

class Book{
	
	public int ISBN;
	protected String title;
	private String author;
	
	Book(int ISBN, String title, String author){
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	
	// Getter for Author
	public String getAuthor() {
		return this.author;
	}
	
	// Setter for Author
	public void setAuthor(String author) {
		this.author = author;
	}
}

class EBook extends Book{
	
	EBook(int ISBN, String title, String author){
		super(ISBN, title, author);
	}
	
	void displayBookDetails() {
		System.out.println("BOOK DETAILS");
		System.out.println("ISBN: "+ISBN); // Accessing Public Member Directly in subclass
		System.out.println("Title: "+title); // Accessing Protected Member Directly in subclass
		System.out.println("Author: "+getAuthor());
	}
}

public class BookLibrarySystem {

	public static void main(String[] args) {
		EBook book1 = new EBook(978, "The Great Gatsby", "F. Scott");
		System.out.println(book1.title+" author: "+book1.getAuthor());
		book1.displayBookDetails();
		book1.setAuthor("Robin Sharma");
		System.out.println("After Updating Author");
		System.out.println(book1.title+" author: "+book1.getAuthor());
		book1.displayBookDetails();
	}

}
