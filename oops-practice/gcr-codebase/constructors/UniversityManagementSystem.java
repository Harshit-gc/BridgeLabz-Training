package constructors;

class Student{
	
	public int rollNumber;
	protected String name;
	private float CGPA;
	
	Student(int rollNumber, String name, float CGPA){
		this.rollNumber = rollNumber;
		this.name = name;
		this.CGPA = CGPA;
	}

	public float getCGPA() {
		return this.CGPA; 
	}
	
	public void setCGPA(float CGPA) {
		this.CGPA = CGPA;
	}
}

class PostgraduateStudent extends Student{
	
	PostgraduateStudent(int rollNumber, String name, float CGPA){
		super(rollNumber, name, CGPA);
	}
	
	void displayStudentDetails(){
		System.out.println("Student Details");
        System.out.println("Roll No: " + rollNumber); 
        System.out.println("Name: " + name); // Accessing Protected Member Directly in subclass
        System.out.println("CGPA: " + getCGPA()); // Accessing CGPA using public method
	}
}

public class UniversityManagementSystem {

	public static void main(String[] args) {
		PostgraduateStudent pg = new PostgraduateStudent(24, "Anuj", 7.51f);
		System.out.println("Student CGPA: "+pg.getCGPA()); // Accessing CGPA using public method
		pg.setCGPA(7.48f); // Modifying CGPA using public method
		System.out.println("Student CGPA(After Updating): "+pg.getCGPA());
		pg.displayStudentDetails();
	}
}
