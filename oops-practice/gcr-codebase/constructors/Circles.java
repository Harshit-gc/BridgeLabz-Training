package constructors;
import java.util.*;

class Circle{
	
	private double radius;
	
	// Default Constructor calling Parametrized Constructor using this
	Circle(){
		this(2.0); // Constructor Chaining
		System.out.println("Call for Constructor Chaining Done ");
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	void display() {
		System.out.println(radius);
	}
}

public class Circles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle rad1 = new Circle();
		System.out.print("Enter Radius: ");
		double rad = input.nextDouble();
		Circle rad2 = new Circle(rad);
		System.out.print("Radius 1: ");
		rad1.display();
		System.out.print("Radius 2: ");
		rad2.display();
		input.close();
	}

}
