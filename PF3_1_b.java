package pf3Assignment1_b;

import java.security.InvalidParameterException;

public class PF3_1_b {
	int gcd(int x, int y)
	{
		if(x<0||y<0)
		{ 
			//invalid GCD method for negative parameters
			throw new InvalidParameterException("parameter u hv passed is invalid for calculating GCD");
		}
		else if(x>y)
		{
			return gcd(y,x);
		}
		else
		{ 
			//base condition
			if(x==y)
				return x;
			else 
				return gcd(y-x,x);           //recursive call
		}
	}

}
