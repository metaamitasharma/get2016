
public class SingalChoiceQuestion extends Question {
	
	int answerChoice;
	String[] choices; 
	
	public SingalChoiceQuestion(String index,String questionLine,String[] choice) {
		this.questionLine=questionLine;
		this.choices=choice;
		setQtype(SINGAL_SELECT);
		setQuesIndex(index);

	}
	
	public boolean isValidAns(int input)
	{
		if(input<choices.length&&input>=0)
		{
			return true;
		}
		else {
			return false;
		}			
	}
	
	public boolean setAnswerChoice(int input) {
		if(isValidAns(input))
		{
			answerChoice=input;
			setStringAnswer();
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Method to get saved choice
	 * @return int
	 */
	public int getAnswerChoice() {
		return answerChoice;
	}
	
	public String[] getChoices() {
		return choices;
	}
	
	public String getCompleteQues()
	{
		String out="";
		out=out+getQuesIndex()+" "+getQuestionLine()+"\n";
		for (String string : getChoices()) {
			out=out+string+"\n";
		}
		return out;
	}
	
	public void setStringAnswer()
	{
		stringAnswer=choices[answerChoice-1];
	}
	

}
