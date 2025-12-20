// program to count the number of digits in an integer.
package control_flow;
import java.util.Scanner;

public class CountOfDigits{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int count = 0;
		while(number>0) {
			count = count+1;
			number = number/10;
		}
		System.out.println("Count Of digits in the number is "+count);
		input.close();
	}
}