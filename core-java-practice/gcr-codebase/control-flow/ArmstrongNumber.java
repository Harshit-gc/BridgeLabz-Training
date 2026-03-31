// Program to check if a number is armstrong or not.
package control_flow;
import java.util.Scanner;

public class ArmstrongNumber{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sum = 0;
		int originalNumber = number;
		while(originalNumber>0) {
			int lastDigit = originalNumber%10;
			lastDigit = lastDigit*lastDigit*lastDigit;
			sum = sum+lastDigit;
			originalNumber = originalNumber/10;
		}
		if(number == sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not a Armstrong Number");
		}
		input.close();
	}
}