package sokoban;

import java.util.ArrayList;

import sokoban.GameTile.GameTiles;

public class GameField {
	//zweidimensionale Liste zum speichern des Levels
	private ArrayList<ArrayList<GameTile>> level;
	//Levelbreite
	private int levelWidth;
	
	public GameField(String levelString, int levelWidth) {
		createLevel(levelString, levelWidth);
	}
	
	void createLevel(String levelString, int levelWidth) {
		level = new ArrayList<>();
		this.levelWidth = levelWidth;
		int y = -1, x = 0;
		
		for(int i=0; x <= levelString.length()-1; i++) {
			//Wenn noch keine zeile (y) besteht oder levelbreite erreicht wurde
			//--> erzeuge neue Spalte
			if(i % levelWidth == 0 || i == 0) {
				y++;
				x = 0;
				level.add( new ArrayList<GameTile>());
			}
			level.get(y).add(new GameTile(x, y, GameTile.getTileObject("" + levelString.charAt(i))));
			x++;
		}
	}
	
	@Override
	public String toString() {
		String outputString = "";
		
		for(ArrayList<GameTile> outerIndex : level) {
			for(GameTile tile : outerIndex)
				outputString += tile.toString();
			
			outputString += "\n";
		}
		
		return outputString;
	}

}
