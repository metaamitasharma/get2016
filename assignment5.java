package pf1Assignment5;

public class assignment5 {
	//to find whether given array is in ascending order
	//this returns 1 if is in ascending order otherwise 0
	int ifAscending(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>a[i+1])
			{
				return 0;
			}
		}
		return 1;
	}
	//returns 1 if array is in descending order otherwise 0
	int ifDescending(int b[])
	{
		for(int i=0;i<b.length;i++)
		{
			if(b[i]<b[i+1])
			{
				return 0; 
			}
		}
		return 1;
	}
	//to find whether array is sorted or not
	//1=ascending, 2=descending, 0=unsorted
	int isArraySorted(int input[])
	{
	 if(ifAscending(input)==1)
	 {
		 return 1;
	 }
	 else if(ifDescending(input)==1)
	 {
		 return 2;
	 }
	 else
	 {
		 return 0;
	 }
	}
	//to print msg according to value returned by above method
	void msg(int output)
	{
	switch(output)
	{
	case 1:
		System.out.println("array is sorted in ascending order");
		break;
	case 2:
		System.out.println("array is sorted in descending order");
		break;
	case 0:
		System.out.println("array is unsorted");
		break;
	}
	}
	

}
