package arrays;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int[] digits = new int[count];
        temp = number;
        for (int i=0; i<count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        int[] frequency = new int[10];
        for (int i=0; i<count; i++) {
            frequency[digits[i]]++;
        }
        for (int i=0; i<10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit "+i+" occurs "+frequency[i]+" times");
            }
        }
        input.close();
    }
}
