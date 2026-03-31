package arrays;
import java.util.Scanner;

public class OddEven{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number>0){
			int[] even = new int[number/2 + 1];
			int[] odd = new int[number/2 + 1];
			int i = 0; // Index variable for even number
			int j = 0; // Index variable for odd number
			for(int k=1; k<=number; k++) {
				if(k%2 == 0) {
					even[i++] = k;
				}else {
					odd[j++] = k;
				}	
			}
			System.out.println("Even Numbers:");
			for(int x=0 ; x<i ; x++) {
				System.out.print(even[x]+" ");
			}
			System.out.println();
			System.out.println("Odd Numbers:");
			for(int y=0 ; y<j ; y++) {
				System.out.print(odd[y]+" ");
			}
		}else {
			System.out.println("Error");
		}
		input.close();
	}
}