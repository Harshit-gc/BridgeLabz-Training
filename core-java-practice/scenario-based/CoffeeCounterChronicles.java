// Ravi runs a cafe. Each customer orders different coffee types with quantities.
// Asks for coffee type (switch), Calculates total bill (price * quantity), Adds GST using arithmetic operators
// Used while to continue for the next customer and stop the loop when "exit" is typed.

package scenario_based;
import java.util.Scanner;

public class CoffeeCounterChronicles{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price = 0.0;
		double grandTotal = 0.0;
		while(true) {
			System.out.print("Enter Coffee Type (espresso, latte, cappuccino) and enter 'exit' to quit. ");
			String coffeeType = input.next().toLowerCase();
			
			if(coffeeType.equals("exit")) {
				System.out.println("Thanks");
				break;
			}
			
			switch(coffeeType){
				case "espresso":
					price = 45.0;
					break;
				case "latte":
					price = 55.0;
					break;
				case "cappuccino":
					price = 65.0;
					break;
				default:
					System.out.println("Coffe Not avialable");
					continue;
			}
			System.out.print("Quantity: ");
			int quantity = input.nextInt();
			input.nextLine();
			price = price*quantity;
			double totalBill = (price*1.18)+price;
			grandTotal = grandTotal+totalBill;
			System.out.println("Total Bill: "+grandTotal);
		}
		input.close();
	}
}