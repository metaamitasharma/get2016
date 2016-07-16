package pf3assignment2_b;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PF3Test2_b {
	pf3_2_b obj = new pf3_2_b();
	int[] demoArray = {2,5,8,9,10, 55, 77};

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
		assertEquals(-1,obj.binSearch(demoArray, 88,0,demoArray.length-1));
		assertEquals(7,obj.binSearch(demoArray, 77,0,demoArray.length-1));
		
	}

}
