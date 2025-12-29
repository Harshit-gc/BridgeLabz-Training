package extras;
import java.util.Scanner;

public class TemperatureConverter {
	
	public static double FtoC(double f) {
		return (f - 32) * (5.0 / 9.0);
	}

	public static double CtoF(double c) {
		return (c * (9.0 / 5.0)) + 32;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit: ");
		double f = input.nextDouble();
		System.out.println("Fahrenheit to celcius: " + FtoC(f));
		System.out.print("Enter temperature in celsius: ");
		double c = input.nextDouble();
		System.out.println("Celcius to Fahrenheit: " + CtoF(c));
		input.close();
	}
}
