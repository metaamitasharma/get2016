package pf2Assignment1;

public class assignment1 {
	int n;
	String spaces(int row,int n)          //method which returns spaces in a row
	{                                     //as a string
		String sp = "";                   // for row=1: ____
		for(int i=1;i<=n-row;i++)
		{
			sp+=" ";
		}
		return sp;
	}
	
	String number(int row,int n)          //method returns number string
	{   int j,k;                          //example for row=5: 123454321
		String num = "";
		for(j=1;j<=row;j++)
		{
			num+=j;
		}
		for(k=row-1;k>=1;k--)
		{
			num+=k;
		}
			return num;
	}
	//to print pattern as array of strings
	String[] pattern(int n)
	{ 

		String[] output = new String[2*n-1];
		for( int cnt=1;cnt<=n;cnt++)
		{
			String space = spaces(cnt,n);
			String number = number(cnt,n); 
			output[cnt-1] = space + number;
		}
		for(int r=n-1;r>=1;r--)
		{
			String space = spaces(r,n);
			String number = number(r,n); 
			output[(2*n)-r-1] = space + number;
		}
		return output;
	}

}
