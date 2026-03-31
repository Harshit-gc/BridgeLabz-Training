// Program To check the largest of three numbers.
package control_flow;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        if(num1>num2 && num1>num3){
            flag1 = true;
        }else if(num2>num3 && num2>num1){
            flag2 = true;
        }else{
            flag3 = true;
        }
        System.out.println("Is the first number the largest? "+flag1);
        System.out.println("Is the second number the largest? "+flag2);
        System.out.println("Is the third number the largest? "+flag3);
        input.close();
    }
}
