package pf3assignment2_a;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class pf3Test_2_a {
	pf3_2_a obj = new pf3_2_a();
    int[] demoArray1 = {2,5,8,9,10, 77, 55};
    int[] demoArray2 = {2,5,8,9,10, 77, 55,11};
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
		assertEquals(-1,obj.linSearch(demoArray1, 88, 0));
		assertEquals(6,obj.linSearch(demoArray2, 77, 0));
	}

}
