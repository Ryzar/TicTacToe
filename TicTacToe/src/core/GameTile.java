package core;

/**
 * Representation of one of the nine squares in a tic tac toe game
 * @author Zarmbinski
 *
 */
public class GameTile {
	/**
	 * 
	 * @author Ryan Zarmbinski
	 *
	 */
	public static enum GameTileConstant {
		BLANK, X, O;
	}
	
	private GameTileConstant value;
	
	/**
	 * 
	 */
	public GameTile() {
		value = GameTileConstant.BLANK;
	}
	/**
	 * 
	 * @param state
	 */
	public void setValue(GameTileConstant state) {
		value = state;
	}
	/**
	 * 
	 * @return
	 */
	public GameTileConstant getValue() {
		return value;
	}
}
