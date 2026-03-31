// Program to find the bonus of employees based on their years of service.
// A bonus of 5% to employees whose year of service is more than 5 years.
package control_flow;
import java.util.Scanner;

public class SalaryBonus{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float salary = input.nextFloat();
		int experience = input.nextInt();
		if(experience>5) {
			salary = (salary*0.05f)+salary;
		}
		System.out.println(salary);
		input.close();
	}
}