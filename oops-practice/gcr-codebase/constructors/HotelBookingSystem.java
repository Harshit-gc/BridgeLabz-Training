package constructors;

class HotelBooking{
	
	private String guestName;
	private String roomType;
	private int nights;
	
	// Default Constructor
	HotelBooking(){
		guestName = "Anuj Udaywal";
		roomType = "Suite";
		nights = 2;
	}
	
	// Parametrized Constructor
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	// Copy Constructor
	HotelBooking(HotelBooking Booking){
		this.guestName = Booking.guestName;
		this.roomType = Booking.roomType;
		this.nights = Booking.nights;
	}
	
	void display() {
		System.out.println("Guest Name: "+guestName);
		System.out.println("Room Type: "+roomType);
		System.out.println("Total Nights: "+nights);
	}
}

public class HotelBookingSystem {

	public static void main(String[] args) {
		HotelBooking booking1 = new HotelBooking();
		HotelBooking booking2 = new HotelBooking("Rajat Bhargava", "Delux Room", 2);
		HotelBooking booking3 = new HotelBooking(booking2);
		System.out.println("Booking 1 details");
		booking1.display();
		System.out.println("Booking 2 details");
		booking2.display();
		System.out.println("Booking 3 details");
		booking3.display();
	}
}
