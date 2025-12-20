// Program to print odd and even numbers between 1 to the number entered by the user.
package control_flow;
import java.util.Scanner;

public class PrintEvenOdd{
	// Method to check whether the number is even or odd.
	public static String isEven(int num) {
		if(num%2==0) {
			return "Even";
		}else {
			return "Odd";
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number>0) {
			for(int i=1;i<=number;i++) {
				System.out.println(i+" is "+ isEven(i));
			}
		}
		input.close();
	}
}