package bridgelabz.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CalculatorTest {

	private Calculator calc;
	
	@BeforeEach
	void setUp() {
		calc = new Calculator();
		
	}
	
	@AfterEach
	void tearDown() {
		calc = null;
	}
	
	@DisplayName("Add Test Case")
	@Test
	void addTest() {
		int result = calc.add(10, 20);
		assertEquals(30, result, "Test Failed");
	}
	
	@DisplayName("Subtract Test Case")
	@Test
	void subtractTest() {
		int result = calc.subtract(20, 10);
		assertEquals(10, result, "Test Failed");
	}
	
	@DisplayName("Multiply Test Case")
	@Test
	void multiplyTest() {
		int result = calc.multiply(20, 10);
		assertEquals(200, result, "Test Failed");
	}
	
	@DisplayName("Divide Test Case")
	@Test
	void divideTest() {
		int result = calc.divide(20, 10);
		assertEquals(2, result, "Test Failed");
	}

	@DisplayName("Exception Test Case")
	@Test
	void exceptionTest() {
		assertThrows(ArithmeticException.class, () ->{
			calc.divide(10, 0);
		}); 
	}
}
