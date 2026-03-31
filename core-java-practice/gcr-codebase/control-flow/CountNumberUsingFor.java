// program to count down the number from the user input 
// value to 1 using a while loop for a rocket launch
package control_flow;
import java.util.Scanner;

public class CountNumberUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i=number;i>0;i--){
            System.out.println(i);
        }
        input.close();
    }    
}
