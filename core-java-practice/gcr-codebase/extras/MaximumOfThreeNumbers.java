package extras;
import java.util.Scanner;

public class MaximumOfThreeNumbers {
	
	public static int takeInput(String prompt) {
		Scanner input = new Scanner(System.in);
		System.out.print(prompt);
		return input.nextInt();
	}

	public static int findMaximum(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		int num1 = takeInput("Enter first number: ");
		int num2 = takeInput("Enter second number: ");
		int num3 = takeInput("Enter third number: ");
		int max = findMaximum(num1, num2, num3);
		System.out.println("Maximum number is: " + max);
	}
}
