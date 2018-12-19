package sokoban;

import java.util.ArrayList;

import sokoban.GameTile.TilesEnum;


public class GameField {
	//zweidimensionale Liste zum speichern des Levels
	private ArrayList<ArrayList<GameTile>> level;
	//Levelbreite
	private int levelWidth;
	private boolean playerSet = false;
	
	
	public GameField(String levelString, int levelWidth) {
		createLevel(levelString, levelWidth);
	}
	
	void createLevel(String levelString, int levelWidth) {
		level = new ArrayList<>();
		this.levelWidth = levelWidth;
		int y = -1, x = 0;
		TilesEnum currentTile;
		
		for(int i=0; i <= levelString.length()-1; i++) {
			//Wenn noch keine zeile (y) besteht oder levelbreite erreicht wurde
			//--> erzeuge neue Spalte
			if(i % levelWidth == 0 || i == 0) {
				y++;
				x = 0;
				level.add( new ArrayList<GameTile>());
			}
			
			//aktuelles Feld auslesen
			currentTile = TilesEnum.getTile(levelString.charAt(i));
			//wenn spieler und spieler noch nicht gesetzt
			if( !playerSet && currentTile == TilesEnum.PLAYER ) {
				level.get(y).add(new Player(x, y));
			}else {
				level.get(y).add(new GameTile(currentTile));
				//level.get(y).add(new GameTile(x, y, currentTile));
			}
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
