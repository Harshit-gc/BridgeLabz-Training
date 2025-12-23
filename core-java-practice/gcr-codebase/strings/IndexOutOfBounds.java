package strings;
import java.util.Scanner;

public class IndexOutOfBounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();
        System.out.println("\nGenerating exception:");
        try {
            showException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred.");
        }
        handleException(text);
        input.close();
    }
    
    static void showException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception handled!");
        }
    }
}