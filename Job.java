package DSassignment4;

/**
 * class Job defines a job 
 * every job has its profile and priority based on profile 
 */

public class Job {
	

	public int priority;
	public String profile;
	 
	//copy constructor
	public Job(Job job)
	{
		this.priority=job.priority;
		this.profile=job.profile;
	}
	
	//constructor takes profile and sets priority accordingly 
	public Job(String pro)
	{
		this.profile = pro;
		this.priority = this.setPriority(this);
	}
	  
	
	//two parameter constructor
	public Job(int P,String pro)
	{
		this.priority= P;
		this.profile = pro;
	}
	
	//method to set priority according to profile
	public int setPriority(Job job)
	{
		switch(job.profile)
		{
		case "chair":
			job.priority = 4;
			
			break;
		case "professor":
			job.priority= 3;
			break;
		case "graduate student":
			job.priority= 2;
			break;
		case "under graduate student":
			job.priority= 1;
			break;
			default :
				job.priority= -1;
				break;
		}
		return job.priority;
	}
	
	
	
	
}
