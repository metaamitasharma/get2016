package Nqueen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testNqueens {
	nQueens obj = new nQueens();
	int[][] exp = {{0,1},{1,3},{2,0},{3,2}};

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
		assertArrayEquals(exp, obj.solutionNqueens(4));
		obj.display(exp, 4);
	}

}
