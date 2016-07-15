package pf1Assignment6;

public class assignment6 {
	//asize=size of a,bsize=size of b
	int[] join(int a[],int asize, int b[],int bsize, int c[])
	{
		//i=index for array a, j= index for b,k=index for c
		int i=0,j=0;
		for(int k=0;k<(asize+bsize);k++)
		{
			if(i>=asize)//after merging all elements in a directly add array b to c
			{
				c[k] = b[j++];
			}
			else if(j>=bsize)//after merging all elements in b directly add array a to c
			{
				c[k] = a[i++];
			}
			//check first elements of arrays a & b 
			//add smaller element to array c and increment corresponding index
			else
			{
				if(a[i]<b[j])
				{
					c[k]=a[i++];
				}
				else
				{
					c[k]=b[j++];
				}
			}
		}
		return c;
	}

}
