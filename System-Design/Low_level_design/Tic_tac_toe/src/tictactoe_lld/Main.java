package tictactoe_lld;

public class Main {
public static void main(String args[]) {
	TicTacToeGame game=new TicTacToeGame();
	game.initializeGame();
	System.out.println(game.startGame());
	
}
}
