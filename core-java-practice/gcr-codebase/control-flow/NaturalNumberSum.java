// program to check for the Natural Number and write the sum of n natural numbers.
package control_flow;
import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number>=0){
            int sum = number*(number+1)/2; // Formula to calculate the sum of n natural numbers is n*(n+1)/2.
            System.out.println("The sum of "+number+" natural numbers is "+sum);
        }else{
            System.out.println("The number "+number+" is not a natural number");
        }
        input.close();
    }
}
