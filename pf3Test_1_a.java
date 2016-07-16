package pf3Assignment1_a;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.CORBA.ExceptionList;

public class pf3Test_1_a extends Exception{
	pf3_1_a obj = new pf3_1_a();

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
		assertEquals(0, obj.rem(2, 1));
		//assertEquals("parameter u hv passed is invalid for division", obj.rem(2, 0));
		assertEquals(1, obj.rem(100,3));
		
	}

}
