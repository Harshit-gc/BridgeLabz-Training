// program to find the power of a number using while loop.
package control_flow;
import java.util.Scanner;

public class PowerOfNumber2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int power = input.nextInt();
		int result = 1;
		if(number>0 && power>0) {
			int i=1;
			while(i<=power) {
				result*=number;
				i++;
			}
			System.out.println(result);
		}else {
			System.out.println("Enter Number Greater than 0.");
		}
		input.close();
	}
}