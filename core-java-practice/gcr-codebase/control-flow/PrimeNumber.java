// Program to check if the given number is a prime number or not
package control_flow;
import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
        if( num == 2 ){
            System.out.println("Prime");
        }
        else{
            boolean isprime = true;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isprime = false;
                }   
            }
            if(isprime==true){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
        }
        input.close();
	}
}