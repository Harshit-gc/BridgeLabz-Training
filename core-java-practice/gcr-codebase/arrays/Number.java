package arrays;
import java.util.Scanner;

public class Number{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == 0) {
				System.out.println(numbers[i]+" is zero");
			}else if(numbers[i] < 0) {
				System.out.println(numbers[i]+" is a negative number");
			}else {
				if(numbers[i]%2 == 0) {
					System.out.println(numbers[i]+" is a positive even number");
				}else {
					System.out.println(numbers[i]+" is a positive odd number");
				}
			}
		}
		if(numbers[0] == numbers[numbers.length-1]) {
			System.out.println("First and last numbers are Equal");
		}else if(numbers[0] > numbers[numbers.length-1]) {
			System.out.println("First number is greater than last number");
		}else {
			System.out.println("First number is less than last number.");
		}
		input.close();
	}
}