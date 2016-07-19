package towerOfHanoi;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTOH {
	towerOfHanoi obj = new towerOfHanoi();
	String[][] exp = {{"A","C"},{"A","B"},{"C","B"},{"A","C"},{"B","A"},{"B","C"},{"A","C"}};

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertArrayEquals(exp,obj.TOH(3, "A", "B", "C"));
		obj.display(exp,3);
	}

}
