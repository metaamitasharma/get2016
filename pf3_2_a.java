package pf3assignment2_a;

public class pf3_2_a {
	
	
	//linear search
	//method searches for target in given array arr 
	//index should be 0 initially
	
	
	int linSearch(int[] arr, int target, int index)
	{
		if(index>=arr.length||arr.length==0)      //base condition
		{
			System.out.println("element " + target + " doesn't exist");
			return -1;
			
		}
		else
		{
			if(arr[index]==target)                  //base condition
					{
				     System.out.println("element " + target + " found at position" + (index+1));
				     return index+1;
					}
			else
			       {
				     return linSearch(arr,target,++index);      //recursive call
			       }
		}
	}

}
