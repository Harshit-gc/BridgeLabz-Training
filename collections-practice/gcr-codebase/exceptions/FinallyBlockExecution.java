package exceptions;
import java.util.Scanner;

public class FinallyBlockExecution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter first number: ");
			int a = input.nextInt();

			System.out.print("Enter second number: ");
			int b = input.nextInt();

			int result = a / b;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		} finally {
			System.out.println("Operation completed");
			input.close();
		}
	}
}
