//  program to print the greatest factor of a number beside itself using a for loop.
package control_flow;
import java.util.Scanner;

public class GreatestFactor{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int greatestFactor = 1;
		for(int i = number-1; i>0 ; i--) {
			if(number%i == 0 ) {
				greatestFactor = i;
				break;
			}
		}
		System.out.println(greatestFactor);
		input.close();
	}
}