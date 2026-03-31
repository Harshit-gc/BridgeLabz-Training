package scenario_based;
import java.util.Scanner;

public class ElectionBoothManager{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		System.out.println("Welcome To Pooling Booth Station");
		while(true) {
			System.out.print("Enter Age to continue or Enter \"exit\" to stop the pooling: ");
			String text = input.next();
			if(text.equalsIgnoreCase("exit")) {
				break;
			}
			int age = Integer.parseInt(text);
			if(age >= 18) {
				System.out.println("Eligible to vote");
			}else {
				System.out.println("Not Eligible to vote");
			}
			System.out.print("For Candidate 1 (BJP) \"Press 1\", For Candidate 2 (CONGRESS) \"Press 2\", For Candidate 3 (AAP) \"Press 3\": ");
			int vote = input.nextInt();
			if(vote == 1) {
				count1++;
			}else if(vote == 2) {
				count2++;
			}else {
				count3++;
			}
			
		}
		System.out.println("Total Number Of Votes: "+(count1+count2+count3));
		System.out.println("For Candidate 1 (BJP) votes are: "+count1);
		System.out.println("For Candidate 2 (CONGRESS) votes are: "+count2);
		System.out.println("For Candidate 3 (AAP) votes are: "+count3);
		input.close();
		
	}
}