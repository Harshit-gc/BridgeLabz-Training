// Program to check if the first number is the smallest of the 3 numbers or not.
package control_flow;
import java.util.Scanner;

public class FirstSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt(); 
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        input.close();
    }
}
