package constructors;

class Vehicle{
	
	// Instance variables
	private String ownerName;
	private String vehicleType;
	static int registrationFee; // Class Variable
	
	Vehicle(String ownerName, String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	// Instance Method to display Vehicle details
	void displayVehicleDetails() {
		System.out.println("Owner Name: "+ownerName);
		System.out.println("Vehicle Type: "+vehicleType);
		System.out.println("Registration Fee: "+registrationFee);
		
	}
	
	// Class Method to change the registration fees
	static void updateRegistartionFee(int fee) {
		registrationFee = fee;
	}
}

public class VehicleRegistration {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Rajat Bhargava", "Car");
		Vehicle vehicle2 = new Vehicle("Harsh Bhadauriya", "Bike");
		Vehicle.registrationFee = 500;
		System.out.println("Vehicle 1 Details");
		vehicle1.displayVehicleDetails();
		System.out.println("Vehicle 2 Details");
		vehicle2.displayVehicleDetails();
		Vehicle.updateRegistartionFee(1000);
		System.out.println("Vehicle 1 Details");
		vehicle1.displayVehicleDetails();
		System.out.println("Vehicle 2 Details");
		vehicle2.displayVehicleDetails();
	}

}
