package Nqueen;

//import pf4Assignment3.nQueens.position;

public class nQueens {
	public int[][] solutionNqueens(int n)
	{
		int[][] output =new int[n][2];
		boolean posibility = ifpossible(n,0,output);
		if(posibility)
		{
			return output;
		}
		else
		{
			return new int[0][0];
		}
		
		
	}
	 public void display(int[][] arr,int n)
	 {
		 System.out.println("queens' positions on "+n+"x"+n+" board are :");
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<2;j++)
			 {
				 if(j==0)
				 System.out.print("("+ arr[i][j]+" , ");
				 else
					 System.out.print(arr[i][j]+")");
			 }
			 System.out.print("\n");
			
		 }
	 }
	
	
	
	
	
	
	
	
	
	
	private boolean ifpossible(int n,int row,int[][] arr)
	{
		if(n==row)
		{
			return true;
		}
		int col;
		for(col=0;col<n;col++)
		{
			boolean safe = true;
			for(int queen=0;queen<row;queen++)
			{
				if(arr[queen][0]==row||arr[queen][1]==col||arr[queen][0]-arr[queen][1]==row-col||arr[queen][0]+arr[queen][1]==row+col)
				{
					safe = false;
					break;
				}
				
			}
			if(safe)
			{
				//arr[row]=new position(row,col);
				arr[row][0]=row;
				arr[row][1]=col;
			if(ifpossible(n,row+1,arr))
			{
				return true;
			}
			}
			
		}
		 return false;
		
	}


}
