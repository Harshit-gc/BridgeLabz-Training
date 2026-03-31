package arrays;
import java.util.*;

public class ZaraSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int EMPLOYEES = 10;
        double[] salary = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
      
        for (int i=0; i<EMPLOYEES; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Enter salary: ");
            salary[i] = input.nextDouble();
            System.out.print("Enter years of service: ");
            yearsOfService[i] = input.nextDouble();
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Salary must be positive and years of service cannot be negative.");
                i--;
                continue;
            }
        }
        for (int i=0; i<EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total Old Salary of all Employees: " + totalOldSalary);
        System.out.println("Total Bonus Paid by Zara: " + totalBonus);
        System.out.println("Total New Salary of all Employees: " + totalNewSalary);
        input.close();
    }
}
