package pf3Assignment1_a;

import java.security.InvalidParameterException;

public class pf3_1_a{
	//remainder can be calculated by repeated subtraction 
	//subtraction is performed x/y times and gives  remainder as result
	int rem(int x, int y) throws InvalidParameterException

{
		//throws exception for divide by zero error and also if negative dividend
		if(x<0||y==0)
		{
			throw  new InvalidParameterException("parameter u hv passed is invalid for division");
		}
		if(x<y)                               //base condition
		{
			return x;
		}
		else
		{
			return rem(x-y,y);                   //recursive call
		}
  
	  
 }

}
