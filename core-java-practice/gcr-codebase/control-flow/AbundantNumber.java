// program to check if a number is an Abundant Number.
package control_flow;
import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum > number) {
            System.out.println(number + " is an Abundant number");
        } else {
            System.out.println(number + " is not an Abundant number");
        }
        input.close();
    }
}
