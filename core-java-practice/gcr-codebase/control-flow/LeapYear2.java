// LeapYear program that takes a year as input and outputs the Year is a Leap Year or 
// not a Leap Year Using single if statement using logical operators.
package control_flow;
import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if((year % 4 == 0 || year % 100 != 0) && (year % 400 == 0)) {
        	System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
        input.close();
    }
}
