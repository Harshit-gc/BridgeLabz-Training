// Program to find the factorial of a number entered by the user.
// Factorial of 5 = 1*2*3*4*5 = 120.
package control_flow;
import java.util.Scanner;

public class Factorial{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int factorial = 1;
		while(number>1) {
			factorial *= number--; // Factorial = Factorial*number;
		}
		System.out.println(factorial);
		input.close();
	}
}