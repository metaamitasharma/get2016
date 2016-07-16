package pf3assignment1_c;

import java.security.InvalidParameterException;

public class pf3_1_c {
	
	int largestDigit(int x,int max)       //note : pass max=0 as parameter always
	{
	if (x<0)
	{
		throw new InvalidParameterException("parameter u hv passed is invalid");
	}
	else
	{
		if(x==0)
		{
			return max;                   //base condition
		}
		else
		{
		 if(max<x%10)
		 {
			 max=x%10;
		 }
		 return largestDigit(x/10,max);     //recursive call 
		}
	}
	}
}
