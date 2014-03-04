package core;

/**
 * Representation of one of the nine squares in a tic tac toe game
 * @author Ryan armbinski
 *
 */
public class GameTile {
	/**
	 * miniature enumeration created to represent the three possible states of a GameTile: </br>
	 * occupied with an X, occupied with an O, or unoccupied.
	 * @author Ryan Zarmbinski
	 *
	 */
	public static enum GameTileConstant {
		BLANK, X, O;
	}
	
	private GameTileConstant value;
	private int row;
	private int col;
	
	/**
	 * Creates a new GameTile object from a row and column coordinate
	 */
	public GameTile(int row, int col) {
		value = GameTileConstant.BLANK;
		this.row = row;
		this.col = col;
	}
	/**
	 * Changes the value of this GameTile in the case of a player's move
	 * @param state the new value of this GameTile
	 */
	public void setValue(GameTileConstant state) {
		value = state;
	}
	/**
	 * Accessor method for the value of this GameTile
	 * @return GameTileConstant representing the value of this GameTile
	 */
	public GameTileConstant getValue() {
		return value;
	}
	/**
	 * Accessor method for the location of this GameTile in the 3-by-3 GameBoard grid
	 * @return array containing the row and column of this GameTile respectively
	 * @see GameBoard
	 */
	public int[] getLocation() {
		return new int[]{row, col};
	}
}
