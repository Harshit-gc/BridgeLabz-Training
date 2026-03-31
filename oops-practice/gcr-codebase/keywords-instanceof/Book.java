package keywords_instanceof;

public class Book {
	
	private static String libraryName = "Egmore Library"; // Static Variable
	private String title;
	private String author;
	private final String isbn; // Final keyword
	
	// this keyword to intialize the values in constructor.
	Book(String title, String author, String isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public void displayBookDetails() {
		// instanceof operartor
		if(this instanceof Book) {
			System.out.println("Title: "+title);
			System.out.println("Author: "+author);
			System.out.println("ISBN: "+isbn);
		}else {
			System.err.println("Book details not found");
		}
	}
	
	// Static method to display library name
	public static void dispalyLibraryName() {
		System.out.println("Library Name: "+libraryName);
	}

	public static void main(String[] args) {
		Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
		Book.dispalyLibraryName();
		book1.displayBookDetails();
	}
}
