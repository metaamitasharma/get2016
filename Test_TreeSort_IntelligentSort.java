package DS_assignment_8;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_TreeSort_IntelligentSort {
	int[] unsortedArray = {2,20,4,12,4,14,25,4,20};
	int[] sortedArray = {2,4,4,4,12,14,20,20,25};
	

	@Test
	public void test() {
		
		IntelligentSorting intelligentSort = new IntelligentSorting();
		//testing counting sort
		assertArrayEquals(sortedArray,intelligentSort.countingSort(unsortedArray, unsortedArray.length));
		
	}

}
