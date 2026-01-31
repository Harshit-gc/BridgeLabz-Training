package bridgelabz.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EvenTest {

	@ParameterizedTest
	@ValueSource(ints = {2,4,6,7,9})
	void isEventest(int num) {
		assertTrue(num%2 == 0);
	}

}
