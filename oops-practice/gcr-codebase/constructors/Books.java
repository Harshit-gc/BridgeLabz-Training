package constructors;

class Book{
	private String title;
	private String author;
	private float price;
	
	// Default Constructor
	Book(){
		title = "Let Us C";
		author = "Yashwant Kanetkar";
		price = 200.99f;
	}
	
	// Parameterized Constructor
	Book(String title, String author, float price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void displaydetails() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
}

public class Books {

	public static void main(String[] args) {
		Book book1 = new Book(); 
		Book book2 = new Book("The Psychology of Money","Morgan Housel ", 280.00f);
		System.out.println("Book 1 Details");
		book1.displaydetails();
		System.out.println("Book 2 Details");
		book2.displaydetails();
	}
}
