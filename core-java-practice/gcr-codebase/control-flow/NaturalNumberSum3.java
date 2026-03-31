// program to find the sum of n natural numbers using 
// for loop compare the result with the formulae n*(n+1)/2. 
package control_flow;
import java.util.Scanner;

public class NaturalNumberSum3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number>=0){
            int sum1 = number*(number+1)/2;
            int sum2 = 0;
            for(int i=number;i>0;i--) {
            	sum2+=i;
            }
            if(sum1==sum2){
                System.out.println("Computations Correct.");
            }
        }else{
            System.out.println("Not a natural number.");
        }
        input.close();
	}
}