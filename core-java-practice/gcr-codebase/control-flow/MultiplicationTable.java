//  Program to find the multiplication table of a number entered by the user from 6 to 9.
package control_flow;
import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(number+" * "+i+" = "+number*i);
		}
		input.close();
	}
}