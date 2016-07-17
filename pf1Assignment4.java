package pf1Assignment4;

public class pf1Assignment4 {
	int[][] FCFS(int[] arrival,int[] jobSize)
	{
		int n = arrival.length;
		
		    //sorting according to arrival time
		    //bubble sort
	
			int swap,swap1;
			for (int c = 0 ; c < ( n - 1 ); c++)
			  {
			    for (int d = 0 ; d < n - c - 1; d++)
			    {
			      if (arrival[d] > arrival[d+1]) /* For decreasing order use < */
			      {
			        swap       = arrival[d];
			        arrival[d]   = arrival[d+1];
			        arrival[d+1] = swap;
			        swap1       = jobSize[d];
			        jobSize[d]   = jobSize[d+1];
			        jobSize[d+1] = swap1;
			      }
			    }
			  }
			
		int[] startsAt = new int[n];
		int[] finishesAt = new int[n];
		int[] waitingTime = new int[n];
		startsAt[0]=1;                             
		
		//if arrives before ending previous job will start just after completing previous job
		//otherwise start just after it arrives
		for(int i= 1;i<n;i++)
		{
			if(jobSize[i-1]+startsAt[i-1]>arrival[i])
				startsAt[i] = jobSize[i-1]+startsAt[i-1];      
			else
				startsAt[i] = arrival[i];
		}
		//job finish time calculation
		for(int i= 0;i<n;i++)
		{
			finishesAt[i] = startsAt[i]+jobSize[i]-1;
			
		}
		//waiting time calculation
		for(int i= 0;i<n;i++)
		{
			waitingTime[i] = startsAt[i] - arrival[i];
		}
		
		//merging 1D arrays to a 2D array Output
		int[][] output = new int[n][6];
		
		for(int i= 0;i<n;i++)
		{
			output[i][0]= i+1;
			output[i][1]= arrival[i];
			output[i][2]= jobSize[i];
			output[i][3]= startsAt[i];
			output[i][4]= finishesAt[i];
			output[i][5]= waitingTime[i];
			
			
		}
		
		//displaying output
		System.out.println("S.No.\tArrival\tJobSize\tStart\tEnd\tWait");
		for(int i= 0;i<n;i++)
		{
			for(int j= 0;j<=5;j++)
			{
				System.out.print(output[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		return output;
		
	}

}
