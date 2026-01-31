package bridgelabz.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class StringUtilsTest {
	
	private StringUtils string;

	@BeforeEach
	void setUp() {
		string = new StringUtils();
	}

	@AfterEach
	void tearDown() {
		string = null;
	}

	@Test
	void reverseTest() {
		String result = string.reverse("Hello");
		assertEquals("olleH", result);
	}

	@Test
	void isPalindromeTest() {
		boolean result = string.isPalindrome("madam");
		assertEquals(true, result);
	}
	
	@Test
	void toUpperCaseTest() {
		String result = string.toUpperCase("Hello");
		assertEquals("HELLO", result);
	}
}
