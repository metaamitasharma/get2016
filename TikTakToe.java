package OOPS3;

public class TikTakToe {
	/*
	 * main function
	 */
	public static void main(String args[]) {
		Player p[]=new Player[2];
		p[1]=new Player('*');
		p[2]=new Player('0');
		while(Turn.getturnCount()==9)      //to check whether 9 stages of grid is completed
		{
	p[Turn.getPlayerTurn()].makeMove();
	State.showgrid();
	if(RuleCheck.getwin()==true){          //any of the winning condition is fulfilled
		System.out.println("Win!!!");
		break;
	}
	Turn.setturnCount();
	Turn.setPlayerTurn();
	}
}
}