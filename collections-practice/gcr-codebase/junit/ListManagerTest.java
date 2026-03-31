package bridgelabz.junit;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.*;

class ListManagerTest {

	private ListManager listManager;
	private ArrayList<Integer> list;
	
	@BeforeEach
	void setUp() {
		listManager = new ListManager();
		list = new ArrayList<>();
	}

	@Test
	void addElementTest() {
		listManager.addElement(list, 10);
		assertEquals(1, list.size());
		assertEquals(10, list.get(0));
	}
	
	@Test
	void removeElementTest() {
		listManager.addElement(list, 10);
		listManager.addElement(list, 20);
		listManager.addElement(list, 30);
		listManager.removeElement(list, 20);
		assertEquals(2, list.size());
		assertFalse(list.contains(20));
	}
	
	@Test
	void getSizeTest() {
		listManager.addElement(list, 10);
		listManager.addElement(list, 20);
		listManager.addElement(list, 30);
		int result = listManager.getSize(list);
		assertEquals(3, result);
	}

}
