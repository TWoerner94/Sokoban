package sokoban;

public class Display {
	GameField gf;
	public Display(GameField gf) {
		this.gf = gf;
	}
	
	public void drawField() {
		gf.toString();
	}
}
