package DSassignment4;


import java.util.Scanner;
/* 
 * DS_assignment 4
 * PROBLEM 1
 * class to handle the jobs sent to the admin department's printer
 *  using Heap data structure techniques
 */

public class Admin{
	
	int heapSize=0;
	public Job[] jobHeap = new Job[100];          //heap of jobs
	int largest = 0;
	
	/*
	 * method to enter a new job profile from user
	 */
	public void insertnewJob()
	{
		
		System.out.println("Enter job profile \n chair , professor , graduate student, under graduate student");
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
              if(str.equalsIgnoreCase("chair")||str.equalsIgnoreCase("professor")||str.equalsIgnoreCase("graduate student")||str.equalsIgnoreCase("under graduate student"))
               {
        	Job newjob=new Job(str);           //constructor of Job class creates new job with profile str
                Insert(newjob);                     //new job is being added to heap
               }
             else
              {
              System.out.println("enter right profile");
              insertnewJob();
              }
	}	
		
	
    /*
     * method inserts new job to the heap according
     *  to its priority applying heapify process
     */
	public void Insert(Job job){
		
		jobHeap[heapSize] = job;
		for(int i=heapSize/2;i>=0;i--)     //we are applying heapify to all nonleaf nodes 
		{                                  //nonleaf starts from N/2, N->heapsize
		heapify(i);
		
		}
		heapSize++;
	}
	
	/*
	 * heapify is process to maintain heap property
	 *    i->parent , L->left child,R-> right child 
	 */
	public void heapify(int i)
	{
		
		int L=2*i+1;
		int R = 2*i+2;
		
		//finding largest among parent i.e i and its L and R children
		
		if(L<=heapSize && jobHeap[L].priority>jobHeap[i].priority)
		{
			 largest = L;
			
		}
		else
		{
			largest = i;
		}
		if(R<=heapSize && jobHeap[R].priority>jobHeap[largest].priority)
		{
			largest = R;
		}
		
		//after comparing parent with L and R children if parent is not largest
		//then swap largest with parent
		if(largest!=i)
		{
			Job swap = new Job(jobHeap[i]);
			
			jobHeap[i]=jobHeap[largest];
			jobHeap[largest] = swap;
		}
		
	}
	
   /*
    * Displays jobs in decreasing priority order
    */
	
	public void displayJobInPriorityOrder()
	{
		for(int cnt =0;cnt<heapSize;cnt++)
		{
		System.out.println(jobHeap[cnt].profile);
		}
	}
	
	
	
	public static void main(String args[])
	{
		int jobCount =0;
		Scanner sc = new Scanner(System.in);
	
		Admin admin = new Admin();
		int exit = 1;
		while(exit==1)
		{
		admin.insertnewJob();
		System.out.println("enter 0 for exit or 1 for continue");
		exit = sc.nextInt();
	    jobCount++;
		}
		
		admin.displayJobInPriorityOrder();
	}
}
