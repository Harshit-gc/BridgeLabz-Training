package keywords_instanceof;

public class Patient {
	
	private static String hospitalName = "City Hospital"; // Static Variable
	private static int totalPatients;
	private String name;
	private int age;
	private String ailment;
	private final String patientID; // Final Keyword
	
	// this keyword to intialize the values in constructor.
	Patient(String name, int age, String ailment, String patientId){
		this.name = name;
		this.age = age;
		this.ailment = ailment;
		this.patientID = patientId;
		totalPatients++;
	}
	
	public void displayPatientDetails() {
		// instanceof Operator
		if(this instanceof Patient) {
			System.out.println("Hospital Name: "+hospitalName);
			System.out.println("Patient ID: "+patientID);
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
			System.out.println("Ailment: "+ailment);
		}else {
			System.err.println("Patient details not found");
		}
	}
	
	// Static method to get total number of Patients
	public static void displayTotalPatients() {
		System.out.println("Total Patients Admitted: "+totalPatients);
	}

	public static void main(String[] args) {
		Patient p1 = new Patient("Lathika", 30, "Flu", "P001");
		Patient p2 = new Patient("Lidiya", 45, "Fracture", "P002");
		Patient.displayTotalPatients();
		p1.displayPatientDetails();
		p2.displayPatientDetails();
	}

}
