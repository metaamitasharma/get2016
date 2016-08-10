package DS_assignment_8;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
 /*
  * Problem 2
  * Class IntelligentSorting, which takes input from user and provide a sorted list
  * Here User could choose if he want to go with Comparison Sorting Or Linear Sorting
  */

public class IntelligentSorting {

	public int[] inputArray;
	int size;                            //length of input array
	int maxDigits;                       //no of digits in largest element
	HashMap<Integer, LinkedList<Integer>> bucket = new HashMap<Integer, LinkedList<Integer>>();
	
	//default constructor
    public IntelligentSorting() {

	}

    //takes input from user
	public void takeInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of elements ");
		size = scan.nextInt();
		inputArray = new int[size];
		System.out.println("enter elements");
		for (int i = 0; i < size; i++) {
			inputArray[i] = scan.nextInt();

		}
	}

	
	//Partition returns correct index of pivot element
	public int Partition(int left, int right) {
		int pivot = inputArray[left];            // I'm taking first element as pivot
		while (true)                             // and finding its right position
		{                                        // in sorted ascending array
			while (inputArray[left] < pivot)
				left++;

			while (inputArray[right] > pivot)
				right--;

			if (left < right) {
				int temp = inputArray[right];
				inputArray[right] = inputArray[left];
				inputArray[left] = temp;
			} else {
				return right;
			}
		}
	}

	public void  QuickSort_Recursive(int left, int right) {

		if (left < right) // base condition
		{
			int pivIndex = Partition(left, right);

			if (pivIndex > 1)
				QuickSort_Recursive(left, pivIndex - 1); // recursive call

			if (pivIndex + 1 < right)
				QuickSort_Recursive(pivIndex + 1, right); // recursive call
		}

		
	}

	//bubble sorting will be performed as comparison sort
	//when elements are not greater than 10
	public void bubbleSort() {
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					int swap = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = swap;
				}
			}
		}
		 System.out.println("bubble sorted Array ");
			for (int m = 0; m < size; m++) {
				System.out.print(inputArray[m]+"  ");
			}
	}

	//counting sorting technique is being applied under linear sorting
	//no element have more than 2 digits
	public void countingSort() {
		int max = 0;
		for (int i = 0; i < size; i++) {
			if (inputArray[i] > max) {            //finding largest element
				max = inputArray[i];
			}
		}

		int[] counting = new int[max + 1];        //array with length equals to largest element

		for (int i = 0; i < size; i++) {

			counting[inputArray[i]]++;        //counting at index = element is being increased by one
		}

		//adding elements from counting to inputarray
		for (int i = 0; i < max + 1; i++) {
			while (counting[i] > 0) {
				System.out.println(i);
				counting[i]--;
			}
		}
		 System.out.println("counting sorted Array ");
			for (int m = 0; m < size; m++) {
				System.out.print(inputArray[m]+"  ");
			}
	}
	
	//to find digits in largest element
	//used in redix sort
	public void FindMaxDigits()
	{
		int max = 0;
	    maxDigits = 0;
		for (int i = 0; i < size; i++) {
			if (max < inputArray[i]) {
				max = inputArray[i];
			}
		}
		while (max != 0) {
			maxDigits++;
			max /= 10;
		}
		
	}

	public void radixSort() {
		
		int rdx = 1;      
		for (int itr = 0; itr < maxDigits; itr++,rdx *= 10) {
		//	bucket = new HashMap<Integer, LinkedList<Integer>>();
		bucket.clear();
			for (int i = 0; i < 10; i++) {
				
				LinkedList<Integer> list = new LinkedList<Integer>();
				for (int j = 0; j < size; j++) {

					if ((inputArray[j] / rdx) % 10 == i) {
						list.add(inputArray[j]);     //adding element with corresponding radix same as key element
					}
				}

				if (!list.isEmpty()) {
					bucket.put(i, list);
				}
			}
			int cnt = 0;
			//taking elements back in input array after each iteration
			inputArray = new int[size];
			for (int k = 0; k < 10; k++) {
				if (bucket.containsKey(k)) {
					while (!bucket.get(k).isEmpty()) {
						inputArray[cnt] = bucket.get(k).removeFirst();
						cnt++;
					}
				}
			}
			
		}
        System.out.println("Redix sorted Array ");
		for (int m = 0; m < size; m++) {
			System.out.print(inputArray[m]+"  ");
		}

	}
	public static void main(String args[]) {
		IntelligentSorting obj = new IntelligentSorting();
		obj.takeInput();
		obj.FindMaxDigits();
		System.out.println("enter your choice for sorting type  1)Comparison Sorting  2)Linear Sorting");
		Scanner sc = new Scanner(System.in);
		int sortchoice=sc.nextInt();
		switch(sortchoice)
		{
		case 1:
			if(obj.size<=10)
				obj.bubbleSort();
			else
				obj.QuickSort_Recursive( 0, obj.size-1);
			 System.out.println("Quick sorted Array ");
				for (int m = 0; m < obj.size; m++) {
					System.out.print(obj.inputArray[m]+"  ");
				}
			break;
		case 2:
			
			if(obj.maxDigits<=2)
				obj.countingSort();
			else
				obj.radixSort();
			break;
			default :
				System.out.println("wrong entry");
				break;
		}
		
	}

}
