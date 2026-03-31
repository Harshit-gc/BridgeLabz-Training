// Maya, a fitness coach, wants to record the BMI of her clients.
// Ask for height and weight and Use formula BMI = weight / (height * height).

package scenario_based;
import java.util.Scanner;

public class MayaBMITracker{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Weight (in kg): ");
		double weight = input.nextDouble();
		System.out.print("Enter Height (in cm): ");
		double height = input.nextDouble();
		height = height*0.01; // Height converted from cm to meter.
		double bmi = weight/(height*height);
		if(bmi >= 25.0) {
			System.out.println("BMI: "+bmi+" Status: Overweight");
		}else if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("BMI: "+bmi+" Status: Normal");
		}else {
			System.out.println("BMI: "+bmi+" Status: Underweight");
		}
		input.close();
	}
}