// program to find the sum until the user enters 0 or a negative number 
// using while loop and break statement
package control_flow;
import java.util.Scanner;

public class SumOfNumberUsingBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double number = input.nextDouble();
        while(true){
            if(number<=0){
                break;
            }
            total+=number;
            number = input.nextDouble();
        }
        System.out.println(total);
        input.close();
    }
}
