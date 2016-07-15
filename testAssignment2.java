package pf1Assignment2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testAssignment2 {
	assignment2 obj = new assignment2();
	int[] a={2,4,6,8,2,5,8,1,5,6,3,4,2,4,1};
	int[] b={2,4,6,8,5,1,3};

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
		assertArrayEquals(b,obj.removeDuplicates(a));
	}

}
