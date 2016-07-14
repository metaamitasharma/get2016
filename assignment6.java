package pf1Assignment6;

public class assignment6 {
	int[] join(int a[],int asize, int b[],int bsize, int c[])
	{
		int i=0,j=0;
		for(int k=0;k<(asize+bsize);k++)
		{
			if(i>=asize)
			{
				c[k] = b[j++];
			}
			else if(j>=bsize)
			{
				c[k] = a[i++];
			}
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
