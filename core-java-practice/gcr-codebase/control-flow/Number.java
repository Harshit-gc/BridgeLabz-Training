// Program to check whether a number is positive, negative, or zero.
package control_flow;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number==0){
            System.out.println("Zero");
        }else if (number>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
        input.close();
    }
}
