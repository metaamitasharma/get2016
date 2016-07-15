package pf1Assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testAssignment3 {
	assignment3 longest = new assignment3();
	int a[] = {1,3,4,5,6,7};
	int b[] = {1,2,1,3,4,5,6,7,3,6};
 
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
		assertArrayEquals(a,longest.longestSequence(b));
	}

}
