package tictactoe;

import javax.swing.JFrame;

public class TicTacToe {

	public static void main(String[] args)
	{
		 JFrame ticTacToe = new TicTacToeBoard();
	        ticTacToe.setTitle("TicTacToe Game");
	        ticTacToe.setSize(300,300);
	        ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        ticTacToe.setLocationRelativeTo(null);
	        ticTacToe.setVisible(true);

	}

}
