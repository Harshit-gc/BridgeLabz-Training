package arrays;
import java.util.Scanner;

public class VotingEligibility{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] studentsAge = new int[10];
		for(int i=0; i<studentsAge.length; i++) {
			studentsAge[i] = input.nextInt();
		}
		for(int i=0; i<studentsAge.length; i++) {
			if(studentsAge[i]<0) {
				System.out.println("Invalid Age");
			}else if(studentsAge[i]>=18) {
				System.out.println("The student with the age "+studentsAge[i]+" can vote.");
			}else {
				System.out.println("The student with the age "+studentsAge[i]+" cannot vote.");
			}
		}
		input.close();
	}
}