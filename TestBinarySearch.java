package DS_7;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class TestBinarySearch {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		int input[]={1,2,2,3,4,5,5};
		BinarySearch_7 bs=new BinarySearch_7();
		int data=2;
		int output=1;

		assertEquals(output, bs.doBinarySearch(input, 0, input.length-1, data));

	}

}
