package pf3assignment1_c;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class pf3Test1_c {
	pf3_1_c obj = new pf3_1_c();

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
		assertEquals(2, obj.largestDigit(2,0));
		assertEquals(9, obj.largestDigit(1496,0));
		assertEquals(4, obj.largestDigit(444,0));
		
	}

}
