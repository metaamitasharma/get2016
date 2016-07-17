package pf1Assignment4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class pf1TestAssignment4 {
	pf1Assignment4 obj = new pf1Assignment4();
	int[] arrivalDemo = {1,5,15,25};
	int[] jobSizeDemo = {12,7,1,5};
	int[][] expected = {{1,1,12,1,12,0},{2,5,7,13,19,8},{3,15,1,20,20,5},{4,25,5,25,29,0}};
	int[] arrivalDemo1 = {15,5,1,25};
	int[] jobSizeDemo1 = {1,7,12,5};

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
		assertArrayEquals(expected, obj.FCFS(arrivalDemo, jobSizeDemo));
		//test for unsorted input
		assertArrayEquals(expected, obj.FCFS(arrivalDemo1, jobSizeDemo1)); 
		
		
	}

}
