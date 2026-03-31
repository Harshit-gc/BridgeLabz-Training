package scenario_based.future_logistics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter transport detail");
		String s = input.nextLine();
		GoodsTransport gt = Utility.parseDetails(s);
		if (gt == null) {
			input.close();
			return;
		}
		System.out.println("Transporter id : " + gt.getTransportId());
		System.out.println("Date of transport : " + gt.getTransportDate());
		System.out.println("Rating of the transport : " + gt.getTransportRating());
		System.out.println("Vehicle for transport : " + gt.vehicleSelection());
		System.out.println("Total charge : " + gt.calculateTotalCharge());
		input.close();
	}
}
