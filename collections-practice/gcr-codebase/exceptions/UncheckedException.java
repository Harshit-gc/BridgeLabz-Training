package exceptions;
import java.util.*;

public class UncheckedException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter numerator: ");
			int a = input.nextInt();

			System.out.print("Enter denominator: ");
			int b = input.nextInt();

			int result = a / b;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		} catch (InputMismatchException e) {
			System.out.println("Please enter valid numeric values");
		} finally {
			input.close();
		}
	}
}
