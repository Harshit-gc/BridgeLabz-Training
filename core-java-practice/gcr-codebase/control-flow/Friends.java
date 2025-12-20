package control_flow;
import java.util.Scanner;

public class Friends{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ageAmar = input.nextInt();
	    int ageAkbar = input.nextInt();
	    int ageAnthony = input.nextInt();
	    float heightAmar = input.nextFloat();
	    float heightAkbar = input.nextFloat();
	    float heightAnthony = input.nextFloat();
	    if(ageAmar<ageAkbar && ageAmar<ageAnthony) {
	    	System.out.println("Amar is Youngest.");
	    }else if(ageAkbar<ageAnthony && ageAkbar<ageAmar) {
	    	System.out.println("Akbar is Youngest");
	    }else {
	    	System.out.println("Anthony is Youngest");
	    }
	    if(heightAmar>heightAkbar && heightAmar>heightAnthony) {
	    	System.out.println("Amar is Tallest.");
	    }else if(heightAkbar>heightAnthony && heightAkbar>heightAmar) {
	    	System.out.println("Akbar is Tallest");
	    }else {
	    	System.out.println("Anthony is Tallest");
	    }
	    input.close();
	}
}