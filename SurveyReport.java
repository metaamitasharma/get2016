import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class SurveyReport {
	
	int SINGAL_SELECT=1;
	int MULTI_SELECT=2;
	int TEXT_STRING=3;
	int TEXT_INTEGER=4;
	
	public void getResponcesReport(ArrayList<ArrayList<Question>> responses) throws IOException
	{
		int personCounter=1;
		String data="";
		for (ArrayList<Question> arrayList : responses) {
			//int quesCounter=1;
			Collections.sort(arrayList);
			for (Question question : arrayList) {
				data=data+"Person "+personCounter+" "+question.getQuesIndex()+" "+question.getStringAnswer()+"\n";
			}
			personCounter++;
		}
		writeToFile(data,"ReportB");
	}
	
	public void getSortedResponseReport(ArrayList<ArrayList<Question>> responses) throws IOException 
	{
		int personCounter=1;
		String data="";
		for (ArrayList<Question> arrayList : responses) {
			//int quesCounter=1;
			Collections.sort(arrayList);
			for (Question question : arrayList) {
				data=data+"Person "+personCounter+" "+question.getQuesIndex()+" "+question.getStringAnswer()+"\n";
			}
			personCounter++;
		}
		writeToFile(data,"SortedReport.txt");
	}
	
/*	public void getAnalysisOfResponse(ArrayList<ArrayList<Question>> responses) throws IOException {
		int QuestionCounter=0;
		String data="";
		
		
		ArrayList<String[]> Choices = new ArrayList<String[]>();
		
		ArrayList<Question> listOfQuestion = responses.get(0);
			for (Question question : listOfQuestion) {
				if(question.getQtype()==SINGAL_SELECT)
				{
					SingalChoiceQuestion singalQues= (SingalChoiceQuestion) question;
					Choices.add(singalQues.choices);
					QuestionCounter++;
				}
		}
		writeToFile(data,"ReportB");
	}*/
	
	public void writeToFile(String data,String filename) throws IOException {
		BufferedWriter bufferwriter= null;
		
		try {
			FileWriter filewritter= new FileWriter(filename);
			bufferwriter = new BufferedWriter(filewritter);
			bufferwriter.write(data);
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bufferwriter.flush();
		
	}
	

}
