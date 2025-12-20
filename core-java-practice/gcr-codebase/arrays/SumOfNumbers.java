package arrays;
import java.util.Scanner;

public class SumOfNumbers{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		double total = 0.0;
		int i = 0; // index variable;
		while(true) {
			if(i>=10) {
				break;
			}else {
				double number = input.nextDouble();
				if(number <= 0.0) {
					break;
				}
				numbers[i] = number;
				i++;
			}
		}
		for(int j=0; j<numbers.length; j++) {
			total = total+numbers[j];
		}
		System.out.println("Sum Of all the numbers are "+total);
		input.close();
	}
}