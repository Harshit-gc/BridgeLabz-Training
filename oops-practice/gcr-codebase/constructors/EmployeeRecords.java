package constructors;

class Employee{
	
	public int employeeID;
	protected String department;
	private long salary;
	
	Employee(int employeeID, String department, long salary){
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}
	
	public long getSalary() {
		return this.salary;
	}
	
	public void setSalary(long salary) {
		this.salary = salary;
	}
}

class Manager extends Employee{
	
	Manager(int employeeID, String department, long salary){
		super(employeeID, department, salary);
	}
	
	void displayEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("Employee ID: "+employeeID); // Accessing employeeID in subclass
		System.out.println("Department: "+department); // Accessing Protected Member Directly in subclass
		System.out.println("Salary: "+getSalary());
	}
}

public class EmployeeRecords {

	public static void main(String[] args) {
		Manager emp1 = new Manager(123, "Sales", 20000);
		emp1.displayEmployeeDetails();
		emp1.setSalary(25000); // Modifying salary using public method
		System.out.println("After Updating Salary");
		emp1.displayEmployeeDetails();
	}

}
