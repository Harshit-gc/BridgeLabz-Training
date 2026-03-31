package arrays;
import java.util.*;

public class ReversedArray{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int temp = number;
        int count = 0;
        while (temp!=0) {
            count++;
            temp = temp/10;
        }
        int[] digits = new int[count];
        temp = number;
        for (int i=0; i<count; i++) {
            digits[i] = temp%10;
            temp = temp/10;
        }
        int[] reverseDigits = new int[count];
        for (int i=0; i<count; i++) {
            reverseDigits[i] = digits[count-1-i];
        }
        for (int i=0; i<count; i++) {
            System.out.print(reverseDigits[i]);
        }
        input.close();
	}
}