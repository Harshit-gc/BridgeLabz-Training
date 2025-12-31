package constructors;

class BankAccount{
	
	public int accountNumber;
	protected String accountHolder;
	private double balance;
	
	BankAccount(int accountNumber, String accountHolder, double balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
}

class SavingsAccount extends BankAccount{
	
	SavingsAccount(int accountNumber, String accountHolder, double balance){
		super(accountNumber, accountHolder, balance);
	}
	
	void displayInformation() {
		System.out.println("Account Details");
		System.out.println("Account Number: "+accountNumber); // Accessing Public Member in subclass
		System.out.println("Account Holder: "+accountHolder); // Accessing Protected Member Directly in subclass
		System.out.println("Balance: "+getBalance());
	}
}

public class BankAccountManagement {

	public static void main(String[] args) {
		SavingsAccount account1 = new SavingsAccount(1234, "Anuj Udaywal", 56000);
		account1.displayInformation();
		System.out.println("Account Balance before withdraw 5000: "+account1.getBalance()); // Accessing Balance using public method
		account1.setBalance(51000); // Modifying Balance using public method
		System.out.println("Account Balance before withdraw 5000: "+account1.getBalance());
		account1.displayInformation();
	}
}
