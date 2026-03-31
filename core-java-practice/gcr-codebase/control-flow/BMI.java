// program to find the BMI of a person
package control_flow;
import java.util.Scanner;

public class BMI{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Weight (in kg): ");
		double weight = input.nextDouble();
		System.out.print("Enter Height (in cm): ");
		double height = input.nextDouble();
		height = height*0.01; // Height converted from cm to meter.
		double bmi = weight/(height*height);
		if(bmi >= 40.0) {
			System.out.println("BMI: "+bmi+" Status: Obese");
		}else if(bmi >= 25.0 && bmi <= 39.9) {
			System.out.println("BMI: "+bmi+" Status: Overweight");
		}else if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("BMI: "+bmi+" Status: Normal");
		}else if(bmi <= 18.4) {
			System.out.println("BMI: "+bmi+" Status: Underweight");
		}
		input.close();
	}
}