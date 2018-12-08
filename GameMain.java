package sokoban;

public class GameMain {

	public static void main(String[] args) {
		World game;
		String s = "#######"+
				   "#     #"+
				   "##    #"+
				   "#     #"+
				   "#     #"+
				   "#######";
		
		game = new World(s, 7);
		
		game.draw();
	}

}
