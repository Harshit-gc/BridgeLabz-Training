package scenario_based;
import java.util.ArrayList;
import java.util.Scanner;

class BookShelf {
    private ArrayList<String> books;
    
    BookShelf() {
        books = new ArrayList<>();
    }

    public void addBook(String newBook) {
        books.add(newBook);
        int n = books.size();
        if (n <= 1) {
            System.out.println("Added \"" + newBook + "\".");
            return;
        }
        int i = n - 2;
        String key = books.get(n - 1);
        while (i >= 0 && books.get(i).compareToIgnoreCase(key) > 0) {
            books.set(i + 1, books.get(i));
            i = i - 1;
        }
        books.set(i + 1, key);
        System.out.println("Added \"" + newBook + "\" and sorted immediately.");
    }

    public void removeBook(int index) {
        if (index < 0 || index >= books.size()) {
            System.out.println("Invalid shelf index.");
            return;
        }
        System.out.println("Removed \"" + books.get(index) + "\".");
        books.remove(index);
    }

    public void displayShelf() {
        System.out.println("CURRENT SHELF");
        if (books.isEmpty()) {
            System.out.println("Empty Shelf");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }
}

public class SmartShelf {
    public static void main(String[] args) {
        BookShelf myShelf = new BookShelf();
        Scanner input = new Scanner(System.in);
        int choice, index;
        String title;

        System.out.println("SMARTSHELF: REAL-TIME SORTING");

        while (true) {
            System.out.println("\n1. Add Book (Auto-Sort)");
            System.out.println("2. Remove Book");
            System.out.println("3. View Shelf");
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
                    System.out.print("Enter Book Title: ");
                    title = input.nextLine();
                    myShelf.addBook(title);
                    break;
                case 2:
                    myShelf.displayShelf();
                    System.out.print("Enter number to remove: ");
                    if (input.hasNextInt()) {
                        index = input.nextInt();
                        myShelf.removeBook(index - 1);
                    } else {
                        input.nextLine();
                        System.out.println("Invalid input.");
                    }
                    break;
                case 3:
                    myShelf.displayShelf();
                    break;
                case 4:
                    System.out.println("Closing SmartShelf.");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}