
public class NumberQuestion extends Question {

	int answer;
	
	public NumberQuestion(String index,String questionLine) {
		this.questionLine=questionLine;
		setQtype(TEXT_INTEGER);
		setQuesIndex(index);
	}
	
	public int getAnswer() {
		return answer;
	}
	
	public void setAnswer(int answer) {
		this.answer = answer;
		stringAnswer = String.valueOf(answer);
	}
	
	public String getCompleteQues()
	{
		String out="";
		out=out+getQuesIndex()+" "+getQuestionLine()+"\n";
		return out;
	}
}
