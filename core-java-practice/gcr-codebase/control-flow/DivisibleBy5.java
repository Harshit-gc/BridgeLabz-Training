// Code to check that the number is divisible by 5 or not.
package control_flow;
import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.print("Is the number "+num+" divisible by 5? ");
        if(num%5==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        input.close();
    }
}
