package pf3assignment2_b;

import java.security.InvalidParameterException;

public class pf3_2_b extends assignment5 {

	//binary search
	//method returns position of target element in given array arr otherwise returns -1
	
	
	int binSearch(int arr[], int target, int first , int last)
	{
		//to check whether the array arr is sorted or not
		//as binary search can be implemented only on sorted array 
		
		assignment5 obj = new assignment5();
		if(obj.isArraySorted(arr)==0)       //isArraySorted method is called from class assignment5
		{
		throw  new InvalidParameterException("Binary search cannot be implement on unsorted array");
			
		}
		
		
		
        int mid = (first + last)/2;
		if(first>last)                        //base condition
		{
			System.out.println("element " + target + " doesn't exist");
			return -1;
		}
		else if(arr[mid]==target)             //base condition
		{
			System.out.println("element " + target + " found at position : " + (mid+1));
			return mid+1;
		}
		else
		{
			if(((isArraySorted(arr)==1)&&arr[mid]<target)||(isArraySorted(arr)==2)&&arr[mid]>target)
			{
				return binSearch(arr,target,mid+1,last);      //recursive call
			}
			else
			{
				return binSearch(arr,target,first,mid-1);       //recursive call
			}
		}
	}
}
