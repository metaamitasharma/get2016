package OOPs_2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Survey extends ReadWriteTextFile
{

	
	String[][] responses = new String[10][5];
	
	 
	
		
		public void getResponse(int q,int cnt)
		{
			Scanner input = new Scanner(System.in);
			responses[cnt][q]=input.next();
			
		}
		
		 public   void reportA()
		 {
			 
			 int[][] RatingReport = new int[4][2];
			 for(int r=1;r< 5;r++)
			 {
				String  S=Integer.toString(r);
				 int total= nRates(S,responses);
				 RatingReport[r][0]=r;
				 RatingReport[r][1]=(total/responses.length)*100;
				 display(RatingReport);
			 }
			 
		 }
		
		 public  int nRates(String s,String[][] response)
		 {
			 int total=0;
			 for(int i=0;i<response.length;i++) 
			 {
				 if(response[i][0]==s)
					 total++;
					 
			 }
			 return total;
		 }
	 public  void display (int[][] arr)
	 { 
		 System.out.println("Report A : Overall Rating");
		 for(int i=0;i<arr.length;i++) 
		 {
			 for(int j=0;j<arr.length;j++)
			 {
				 System.out.println(arr[i][j]+"\t");
			 }
			 System.out.println("\n");
		 }
	 }

	
}

/*public static  void main (String[] args) 
{
	
	Survey obj = new Survey();
	 File testFile = new File("/download/Questions.txt");
	// File fout = new File("/Users/admin/workspace/output.txt");
	 File surveyData = new File("E:/download/Report.txt");
	 System.out.println("enter no of candidates");
	 Scanner input = new Scanner(System.in);
	 int n = input.nextInt();
	String[] Questions = obj.getContents(testFile);
	System.out.println("survey guidlines :\n Survey will have number of questions. answer question one by one"
			+ "All questions are mandatory to answer.\n");
	
	
	for(int cnt =0;cnt<n;cnt++)
	{
		System.out.println("candidate "+(cnt+1)+" :");
	for(int p=0;p<5;p++)
	{
	System.out.println(Questions[p]);
	getResponse(p+1);
	}
	}
	
	obj.reportA();
}	*/	
