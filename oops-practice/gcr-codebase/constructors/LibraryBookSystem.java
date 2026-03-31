package constructors;
import java.util.*;

class Book{
	String title;
	String author;
	float price;
	int id;
	boolean isAvailable;
	
	// Default Constructor
	Book(){
		title = "Let Us C";
		author = "Yashwant Kanetkar";
		price = 200.99f;
		id = 1;
		isAvailable = true;
	}
	
	// Parameterized Constructor
	Book(String title, String author, float price, int id, boolean isAvailable){
		this.title = title;
		this.author = author;
		this.price = price;
		this.id = id;
		this.isAvailable = isAvailable;
	}

	// Method to Borrow a Book
	void borrowBook() {
        if (this.isAvailable) {
            System.out.println("Success! You have borrowed: " + this.title);
            this.isAvailable = false;
        } else {
            System.out.println("Sorry, '" + this.title + "' is not currently available.");
        }
    }
}


public class LibraryBookSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Book book1 = new Book();
		Book book2 = new Book("The Psychology of Money","Morgan Housel ", 280.00f, 2, false);
		Book book3 = new Book("Train to Pakistan", "Khushwant Singh", 250.00f, 3, true);
		System.out.println("List of Books");
		System.out.println("Book Id: "+book1.id+" Book Name: "+book1.title+" Author Name: "+book1.author);
		System.out.println("Book Id: "+book2.id+" Book Name: "+book2.title+" Author Name: "+book2.author);
		System.out.println("Book Id: "+book3.id+" Book Name: "+book3.title+" Author Name: "+book3.author);
		System.out.print("Enter Book id of the book you want to borrow: ");
		int id = input.nextInt();
		switch (id) {
        case 1:
            book1.borrowBook();
            break;
        case 2:
            book2.borrowBook();
            break;
        case 3:
            book3.borrowBook();
            break;
        default:
            System.out.println("Invalid ID!");
		}
		input.close();
	}
}
