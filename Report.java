package OOPs_2;

import java.io.File;
import java.util.Scanner;

public class Report {
	
	public static  void main (String[] args) 
	{
		
		Survey obj = new Survey();
		 File testFile = new File("E:/download/Questions.txt");
		// File fout = new File("/Users/admin/workspace/output.txt");
		 File surveyData = new File("E:/download/Report.txt");
		 System.out.println("enter no of candidates");
		 Scanner input = new Scanner(System.in);
		 int n = input.nextInt();
		String[] Questions = obj.getContents(testFile);
		System.out.println("survey guidlines :\n Survey will have number of questions. answer question one by one"
				+ "All questions are mandatory to answer.\n");
		
		int cnt;
		int Q;
		for( cnt =0;cnt<n;cnt++)
		{
			System.out.println("candidate "+(cnt+1)+" :");
		for( Q=0;Q<5;Q++)
		{
		System.out.println(Questions[Q]);
		obj.getResponse(Q,cnt);
		}
		}
		
		obj.reportA();
	}		

}
