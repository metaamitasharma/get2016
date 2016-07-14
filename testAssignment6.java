package pf1Assignment6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testAssignment6 {
	assignment6 obj = new assignment6();
	int a[]={1,3,7};
	int b[]={2,4,5,9};
	int d[]={1,2,3,4,5,7,9};
	int[] c = new int[a.length+b.length];

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
		assertArrayEquals(d,obj.join(a,a.length, b, b.length, c));
		
	}

}
