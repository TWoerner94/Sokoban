package sokoban;

public class GameTile {
	private int x, y;
	private GameTiles tile;
	
	public enum GameTiles {
		WALL("#"),
		EMPTY(" "),
		PLAYER("@");
		
		private final String tile;
		GameTiles(String c) {
			this.tile = c;
		}
		
		@Override
		public String toString() {
			return this.tile;
		}
	}
	
	@Override
	public String toString() {
		return this.tile.toString();
	}
	
	public GameTiles getTile() {
		return this.tile;
	}
	
	//Gibt das passende Tile zu einem String zurück
	public static GameTiles getTileObject(String s) {
		
		if( s.equals(GameTiles.WALL.toString()) )
			return GameTiles.WALL;
		
		return GameTiles.EMPTY;
	}
	
	public GameTile(int x, int y, GameTiles tile) {
		this.x = x;
		this.y = y;
		this.tile = tile;
	}

}
