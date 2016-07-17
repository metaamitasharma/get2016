package pf3quickSort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestQuickSort {
	quickSort obj = new quickSort();
	int[] demoArray = {2,5,8,9,10, 77, 55, 11};
	int[] exp = {2,5,8,9,10,11,55,77};


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
		assertArrayEquals(exp, obj.QuickSort_Recursive(demoArray,0,demoArray.length-1));
		obj.display(obj.QuickSort_Recursive(demoArray,0,demoArray.length-1));
	}

}
