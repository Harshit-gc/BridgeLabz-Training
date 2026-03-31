package constructors;

class CarRental{
	private String customerName;
	private int carModel;
	private int rentalDays;
	private int totalCost;
	
	// Parameterized Constructor to initialize rental details
	CarRental(String customerName, int carModel, int rentalDays){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
		this.totalCost = calculateCost(this.rentalDays);
	}
	
	// Method to calculate total Cost
	private int calculateCost(int days) {
		return days*50;
	}
	
	void display() {
		System.out.println("Customer Name: "+customerName);
		System.out.println("Car Model: "+carModel);
		System.out.println("Rental Days: "+rentalDays);
		System.out.println("Total Cost: "+totalCost);
	}
}

public class CarRentalSystem {
	public static void main(String[] args) {
		CarRental car1 = new CarRental("Kush", 2022, 5);
		CarRental car2 = new CarRental("Hrishabh", 2024, 4);
		System.out.println("Car 1 details");
		car1.display();
		System.out.println("Car 2 details");
		car2.display();
	}
}
