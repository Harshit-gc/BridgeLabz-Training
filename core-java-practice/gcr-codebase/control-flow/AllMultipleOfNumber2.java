// program to find all the multiples of a number taken as user input below 100 using while loop.
package control_flow;
import java.util.Scanner;

public class AllMultipleOfNumber2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number>0 && number <101) {
			int i = 100;
			while(i>0) {
				if(number%i == 0) {
					System.out.print(i+" ");
				}
				i--;
			}
		}else {
			System.out.println("Enter Positive Number Less than 100");
		}
		input.close();
	}
	
}