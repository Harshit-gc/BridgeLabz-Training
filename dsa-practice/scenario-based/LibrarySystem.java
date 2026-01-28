package scenario_based;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return title.equalsIgnoreCase(other.title) && author.equalsIgnoreCase(other.author);
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

class Library {
    private HashMap<String, LinkedList<Book>> shelf;

    Library() {
        shelf = new HashMap<>();
    }

    public void addBook(String genre, String title, String author) {
        shelf.putIfAbsent(genre, new LinkedList<>());
        LinkedList<Book> booksInGenre = shelf.get(genre);
        Book newBook = new Book(title, author);
        for (Book b : booksInGenre) {
            if (b.equals(newBook)) {
                System.out.println("Error: Book already exists in " + genre);
                return;
            }
        }

        booksInGenre.add(newBook);
        System.out.println("Added: " + newBook + " to [" + genre + "]");
    }

    public void borrowBook(String genre, String title) {
        if (!shelf.containsKey(genre)) {
            System.out.println("Error: Genre not found.");
            return;
        }

        LinkedList<Book> booksInGenre = shelf.get(genre);
        boolean found = false;
        Book toRemove = null;

        for (Book b : booksInGenre) {
            if (b.title.equalsIgnoreCase(title)) {
                toRemove = b;
                found = true;
                break;
            }
        }

        if (found) {
            booksInGenre.remove(toRemove);
            System.out.println("Borrowed (Removed): \"" + title + "\" from [" + genre + "]");
            
            if (booksInGenre.isEmpty()) {
                shelf.remove(genre);
            }
        } else {
            System.out.println("Error: Book not found in " + genre);
        }
    }

    public void displayCatalog() {
        System.out.println("LIBRARY CATALOG");
        if (shelf.isEmpty()) {
            System.out.println("Library is empty");
        } else {
            for (Map.Entry<String, LinkedList<Book>> entry : shelf.entrySet()) {
                System.out.println("Genre: " + entry.getKey());
                LinkedList<Book> books = entry.getValue();
                for (Book b : books) {
                    System.out.println("   - " + b);
                }
            }
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner input = new Scanner(System.in);
        int choice;
        String genre, title, author;
        System.out.println("BOOKSHELF");

        while (true) {
            System.out.println("1. Add Book (Return)");
            System.out.println("2. Borrow Book (Remove)");
            System.out.println("3. View Catalog");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine(); 
            } else {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Genre: ");
                    genre = input.nextLine();
                    System.out.print("Enter Title: ");
                    title = input.nextLine();
                    System.out.print("Enter Author: ");
                    author = input.nextLine();
                    library.addBook(genre, title, author);
                    break;
                case 2:
                    System.out.print("Enter Genre: ");
                    genre = input.nextLine();
                    System.out.print("Enter Title to borrow: ");
                    title = input.nextLine();
                    library.borrowBook(genre, title);
                    break;
                case 3:
                    library.displayCatalog();
                    break;
                case 4:
                    System.out.println("Closing Library System.");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}