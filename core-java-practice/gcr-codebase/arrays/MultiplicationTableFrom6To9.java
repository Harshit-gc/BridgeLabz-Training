package arrays;
import java.util.Scanner;

public class MultiplicationTableFrom6To9{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int[] multiplication = new int[4];
		int count = 6;
		for(int i=0; i<multiplication.length; i++,count++) {
			multiplication[i] = number*count;
		}
		count = 6;
		for(int i=0; i<multiplication.length; i++, count++) {
			System.out.println(number+" * "+count+" = "+multiplication[i]);
		}
		input.close();
	}
}