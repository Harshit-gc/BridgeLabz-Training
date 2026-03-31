package scenario_based;
import java.util.Scanner;

public class MetroFareDeduction{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("...Welcome to Metro...");
		System.out.println("Charges per kilo meter = Rs 5");
		System.out.print("Enter Your Smart Card Balance: ");
		int cardBalance = input.nextInt();
		if(cardBalance < 5) {
			System.out.println("Not Sufficient Balance to Travel. \n Recharge Your Card.");
		}else {
			while(true) {
				System.out.print("Enter Distance you want to travel(in km) or \"-1\" to exit :");
				int distance = input.nextInt();
				int charges = distance*5;
				if(charges > cardBalance) {
					System.out.print("Not Sufficient Balance to Travel. \n Recharge Your Card.");
					break;
				}
				cardBalance = cardBalance-charges;
				System.out.println("Remaining Smart Card Balance: "+cardBalance);
			}
		}
		input.close();
	}
}