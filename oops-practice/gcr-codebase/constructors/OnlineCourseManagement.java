package constructors;

class Course{
	
	// Instance Variables
	private String courseName;
	private int duration;
	private float fee;
	static String instituteName; // Class Variable
	
	Course(String courseName, int duration, float fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	// Instance method to display course details
	void displayCourseDetails() {
		System.out.println("Course Name: "+courseName);
		System.out.println("Duration: "+duration+" years.");
		System.out.println("Fees: Rs"+fee+" Lakhs");
		System.out.println("Institute Name: "+instituteName);
	}
	
	// Class method to modify the institue name
	static void updateInstitueName(String name) {
		instituteName = name;
	}
	
}

public class OnlineCourseManagement {

	public static void main(String[] args) {
		Course course1 = new Course("B.Tech", 4, 8.50f);
		Course course2 = new Course("BCA", 3, 4.25f);
		Course.instituteName = "GLA University";
		System.out.println("Course 1 Details");
		course1.displayCourseDetails();
		System.out.println("Course 2 Details");
		course2.displayCourseDetails();
		Course.updateInstitueName("Gla University Mathura");
		System.out.println("Course 1 Details");
		course1.displayCourseDetails();
		System.out.println("Course 2 Details");
		course2.displayCourseDetails();
	}

}
