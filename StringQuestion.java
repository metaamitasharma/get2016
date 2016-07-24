
public class StringQuestion extends Question {

	String answer;
	
	public StringQuestion(String index,String questionLine) {
		this.questionLine=questionLine;
		setQtype(TEXT_STRING);
		setQuesIndex(index);

	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
		stringAnswer=answer;
	}
	
	public String getCompleteQues()
	{
		String out="";
		out=out+getQuesIndex()+" "+getQuestionLine()+"\n";
		return out;
	}
	
}
