package pf2Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testAssignment1 {
	assignment1 obj = new assignment1();
	String[] exp = {"    1","   121","  12321"," 1234321", "123454321"," 1234321","  12321","   121","    1"};

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
		assertArrayEquals(exp, obj.pattern(5));
		
         assertEquals("    ",obj.spaces(1,5));
		 assertEquals("   ",obj.spaces(2,5));
		 assertEquals("  ",obj.spaces(3,5));
		 assertEquals(" ",obj.spaces(4,5));
		 assertEquals("",obj.spaces(5,5));
		 assertEquals("1",obj.number(1, 5));
		 assertEquals("121",obj.number(2, 5));
		 assertEquals("12321",obj.number(3, 5));
		 assertEquals("1234321",obj.number(4, 5));
		 assertEquals("123454321",obj.number(5, 5));
	}

}
