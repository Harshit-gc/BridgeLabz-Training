// Program to find the factorial of an integer 
// entered by the user using for loop.
package control_flow;
import java.util.Scanner;

public class FactorialUsingFor{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int factorial = 1;
		for(int i=0;i<number;i++){
			factorial*=number;
		}
		System.out.println(factorial);
		input.close();
	}
}