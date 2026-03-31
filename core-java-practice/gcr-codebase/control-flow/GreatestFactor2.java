//  program to print the greatest factor of a number beside itself using a while loop.
package control_flow;
import java.util.Scanner;

public class GreatestFactor2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int greatestFactor = 1;
		int i = number-1;
		while(i>0) {
			if(number%i == 0 ) {
				greatestFactor = i;
				break;
			}
			i--;
		}
		System.out.println(greatestFactor);
		input.close();
	}
}