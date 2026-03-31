//  program to check if a number taken from the user is a Harshad Number.
package control_flow;
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number");
        } else {
            System.out.println(number + " is not a Harshad number");
        }
        input.close();
    }
}
