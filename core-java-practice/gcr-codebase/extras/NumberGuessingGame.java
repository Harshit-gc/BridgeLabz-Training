package extras;
import java.util.Scanner;

public class NumberGuessingGame {
	
	public static int generateGuess(int low, int high) {
		return low + (int) (Math.random() * (high - low + 1));
	}

	public static String getFeedback(Scanner sc) {
		System.out.print("Is the guess high, low, or correct? ");
		return sc.next().toLowerCase();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int low = 1;
		int high = 100;
		boolean guessedCorrectly = false;
		System.out.println("Think of a number between 1 and 100.");
		System.out.println("I will try to guess it!");
		System.out.println("Press any key to proceed");
		String s = input.next();
		while (!guessedCorrectly) {
			int guess = generateGuess(low, high);
			System.out.println("My guess is: " + guess);
			String feedback = getFeedback(input);
			if (feedback.equals("low")) {
				low = guess + 1;
			} else if (feedback.equals("high")) {
				high = guess - 1;
			} else if (feedback.equals("correct")) {
				System.out.println("Guessed your number correctly ");
				guessedCorrectly = true;
			} else {
				System.out.println("Invalid input. Please enter high, low, or correct.");
			}
		}
		input.close();
	}
}
