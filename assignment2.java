package pf1Assignment2;

public class assignment2 {
	//method to check whether element a exists in given array b or not
	//returns 1 if exists already otherwise 0
	int ifAxist(int a,int b[])
	{
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==a)
			{
				return 1;
			}
		}
		return 0;
	}	
		
		int[] removeDuplicates(int input[])
		{
			int length=0;//length stores current length of new array with no repeated elements
			int[] out = new int[input.length];
			for(int j=0;j<input.length;j++)
			{
				//if element of input array not exist then add it to array OUT 
				//which is array with no repeative element
				if(ifAxist(input[j],out)==0)
					{
					  out[length++]=input[j];   
					}
			}	
		
		
		
		int[] finalOut = new int[length];
		for(int i=0;i<length;i++)
		{
			finalOut[i]=out[i];
		}
		
		return finalOut;
	}

}
