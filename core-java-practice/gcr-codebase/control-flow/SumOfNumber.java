//  program to find the sum of numbers until the user enters 0
package control_flow;
import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double number = input.nextDouble();
        while(number!=0){
            total+=number;
            number = input.nextDouble();
        }
        System.out.println(total);     
        input.close();
    }
}
