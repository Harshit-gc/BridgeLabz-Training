package arrays;
import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int[] multiplication = new int[10];
		int count = 1;
		for(int i=0; i<multiplication.length; i++,count++) {
			multiplication[i] = number*count;
		}
		count = 1;
		for(int i=0; i<multiplication.length; i++, count++) {
			System.out.println(number+" * "+count+" = "+multiplication[i]);
		}
		input.close();
	}
}