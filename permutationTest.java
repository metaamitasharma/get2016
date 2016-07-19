package permutation;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class permutationTest {
	Permutation obj = new Permutation();
	
	char[] charArray = {'a','b','c'};
	

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
		ArrayList<String> exp = new ArrayList<String>();
		exp.add("bca");
		exp.add("cba");
		exp.add("cab");
		exp.add("acb");
		exp.add("bac");
		exp.add("abc");
		boolean B = exp.containsAll(obj.findpermutation(charArray, 3));
		assertTrue(B==true);
		
	}

}
