package bridgelabz.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.concurrent.TimeUnit;

class PerformanceTestingTest {
	
	private PerformanceTesting test;
	
	@BeforeEach
	void setup() {
		test = new PerformanceTesting();
	}
	@Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fails if execution > 2 seconds
    void longRunningTaskTest() throws InterruptedException {
        String result = test.longRunningTask();
        assertEquals("Task Complete", result);
    }

}
