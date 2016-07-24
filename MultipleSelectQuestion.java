
public class MultipleSelectQuestion extends Question {
	
	int[] answerChoice;
	String[] choices; 

	public MultipleSelectQuestion(String index,String questionLine,String[] choice) {
		
		this.questionLine=questionLine;
		this.choices=choice;
		setQtype(MULTI_SELECT);
		setQuesIndex(index);
	}
	
	public boolean isValidAns(int input)
	{
		if(input<=choices.length&&input>0)
		{
			return true;
		}
		else {
			return false;
		}			
	}
	
	public boolean setAnswerChoices(int[] input) {
		
		for (int i : input) {
			if(!isValidAns(i))
			{
				return false;
			}
		}
		answerChoice=new int[input.length];
		for (int i = 0; i < input.length; i++) {
			answerChoice[i]=input[i];
		}
		
		setStringAnswer();
		return true;
	}
	
	public int[] getAnswerChoice() {
		return answerChoice;
	}
	
	public String[] getChoices() {
		return choices;
	}
	
	public String getCompleteQues()
	{
		String out="";
		out=out+getQuesIndex()+" "+getQuestionLine()+"\n";
		for (String string : getChoices()) 
		{
			out=out+string+"\n";
		}
		return out;
	}
	
	private void setStringAnswer()
	{
		for (int i = 0; i < answerChoice.length; i++) {
			if(stringAnswer==null)
				stringAnswer="";
			stringAnswer =stringAnswer+" "+ choices[answerChoice[i]-1]+" ";
		}
	}

}
