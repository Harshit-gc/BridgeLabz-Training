package strings;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeating(String text) {
    	// Loop to find the frequency of each character in the string.
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }
        // Loop to find the first non-repeating character.
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; 
            }
        }
        
        return '0'; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char result = findFirstNonRepeating(str);
        if (result != '0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        input.close();
    }
}