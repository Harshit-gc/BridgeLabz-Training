package exceptions;
import java.util.*;

public class ThrowVsThrows {
	static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
		if (amount < 0 || rate < 0) {
			throw new IllegalArgumentException("Invalid input");
		}
		return (amount * rate * years) / 100;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter amount: ");
			double amount = input.nextDouble();

			System.out.print("Enter rate: ");
			double rate = input.nextDouble();

			System.out.print("Enter years: ");
			int years = input.nextInt();

			double interest = calculateInterest(amount, rate, years);
			System.out.println("Calculated Interest: " + interest);
			input.close();
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input: Amount and rate must be positive");
		}
	}
}
