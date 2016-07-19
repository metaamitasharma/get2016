package towerOfHanoi;
//import java.math.*;

public class towerOfHanoi {
	 int i=0;
	 int n=3;
	/*int pow(int x,int y)         //power function
	{                            //returns x^y
		int ans=1;

		for(int j=0;j<y;j++)
		{
			ans=ans*x;
		}
		return ans;
	}*/
	
	public void display(String[][] arr,int n)     //to display on console
	{
		for(int cnt=0;cnt<Math.pow(2,n)-1;cnt++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(output[cnt][j]);
				if(j==0)
				{
					System.out.print("\tto\t");
				}
				
			}
			System.out.print("\n");
		}	
	}
	
	String[][] output= new String[(int) ((Math.pow(2, n))-1)][2];
	
	//recursive method for moving n discs from source to 
	//target peg with the help of auxiliary peg
	 public String[][] TOH(int n,String source,String aux,String target)
	{   
	    if(n==1)                                 //base condition
		{
		output[i][0]=source;
		output[i][1]=target;
		i++;
	
		}
		else
		{
			TOH(n-1,source,target,aux);          //recursive call
			output[i][0]=source;
			output[i][1]=target;
			i++;
			TOH(n-1,aux,source,target);          //recursive call
		}

	 
		return output;
		
	}
}

