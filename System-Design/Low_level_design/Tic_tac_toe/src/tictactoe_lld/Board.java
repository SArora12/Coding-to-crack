package tictactoe_lld;

import java.util.ArrayList;
import java.util.List;

public class Board {
	int size;
	PlayingPiece[][] board;
	
	Board(int size){
		this.size=size;
		board=new PlayingPiece[size][size];
	}
	
	public boolean addPiece(int row,int col, PlayingPiece piece) {
		if(board[row][col]!=null) {
			return false;
		}
		board[row][col]=piece;
		return true;
	}
	
	public List<Pair<Integer,Integer>> getFreeCells(){
		List<Pair<Integer,Integer>> freecells=new ArrayList<>();
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(board[i][j]==null) {
				Pair<Integer,Integer> rowCol=new Pair<>(i,j);
				freecells.add(rowCol);
			}}
		}
		return freecells;
			
	}
	
	public void displayBoard() {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(board[i][j]!=null) {
					System.out.print(board[i][j].type.name()+" ");
					
				}
				else {
					System.out.print(" " );
				}
				System.out.print("|");
			}
			System.out.println();
	}
		

}}
