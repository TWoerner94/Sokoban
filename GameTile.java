package sokoban;

public class GameTile{
	private int x, y;
	private TilesEnum tile;

	public enum TilesEnum {
		WALL("#"),
		EMPTY(" "),
		PLAYER("@");
		
		private final String tile;
		TilesEnum(String c) {
			this.tile = c;
		}
		
		@Override
		public String toString() {
			return this.tile;
		}
		
		public static TilesEnum getTile(char c) {
			switch(c) {
			case '@': return PLAYER;
			case ' ': return EMPTY;
			case '#': return WALL;
			default:  return EMPTY;
			}
		}
	}
	
	public GameTile(int x, int y, TilesEnum tile) {
		this.tile = tile;
		this.x = x;
		this.y = y;
	}
	
	public GameTile(TilesEnum tile) {
		this.tile = tile;
	}
	
	@Override
	public String toString() {
		return this.tile.toString();
	}
	
	public TilesEnum getTile() {
		return this.tile;
	}
	

}
