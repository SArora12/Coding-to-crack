package tictactoe_lld;

public class Player {
	String name;
	PlayingPiece piece;
	Player(String name,PlayingPiece piece){
		this.name=name;
		this.piece=piece;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPiece(PlayingPiece piece) {
		this.piece=piece;
	}
	public PlayingPiece getPiece() {
		return piece;
	}
}
