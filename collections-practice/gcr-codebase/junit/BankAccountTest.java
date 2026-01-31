package bridgelabz.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

	private BankAccount account;

	@BeforeEach
	void setUp() {
		account = new BankAccount(100.0);
	}

	@Test
	void testDeposit() {
		account.deposit(50.0);
		assertEquals(150.0, account.getBalance(), 0.001, "Balance should increase by deposit amount");
	}

	@Test
	void testWithdrawSuccess() {
		account.withdraw(40.0);
		assertEquals(60.0, account.getBalance(), 0.001, "Balance should decrease by withdraw amount");
	}

	@Test
	void testWithdrawInsufficientFunds() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			account.withdraw(200.0);
		});
		assertEquals("Insufficient funds", exception.getMessage());
	}
}
