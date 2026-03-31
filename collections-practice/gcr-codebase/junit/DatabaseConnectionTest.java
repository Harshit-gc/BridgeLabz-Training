package bridgelabz.junit;

import org.junit.jupiter.api.*;

class DatabaseConnectionTest {

	private DatabaseConnection db;
	
	@BeforeEach
	void setUp() {
		db = new DatabaseConnection();
		db.connect();
	}

	@AfterEach
	void tearDown() {
		db.disconnect();
		db = null;
	}

	@DisplayName("Test Case 1")
	@Test
	void test1() {
		System.out.println("Test Case 1");
	}

	@DisplayName("Test Case 2")
	@Test
	void test2() {
		System.out.println("Test Case 2");
	}
	
	@DisplayName("Test Case 3")
	@Test
	void test3() {
		System.out.println("Test Case 3");
	}
}
