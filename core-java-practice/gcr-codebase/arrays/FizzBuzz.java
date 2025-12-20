package arrays;
import java.util.*;

public class FizzBuzz{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt(); 
		if(number>0) {
			String[] array = new String[number];
			int j = 0;
			for(int i=1; i<=number; i++ ) {
				if(i%3 == 0 && i%5 == 0) {
					array[j++] = "FizzBuzz"; 
				}else if(i%5 == 0) {
					array[j++] = "Buzz";
				}else if(i%3 == 0) {
					array[j++] = "Fizz";
				}else {
					array[j++] = String.valueOf(i);
				}
			}
			for(int i=0; i<array.length;i++) {
				System.out.println(array[i]);
			}
		}else {
			System.out.println("Enter Positive Number");
		}
		input.close();
	}
}