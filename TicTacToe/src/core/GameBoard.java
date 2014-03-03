package core;

/**
 * 
 * @author Ryan Zarmbinski
 *
 */
public class GameBoard {
	private GameTile[][] tiles;
	private boolean gameWon;
	
	/**
	 * 
	 */
	public GameBoard() {
		tiles = new GameTile[3][3];
		for(int row = 0; row < tiles.length; row++) {
			for(int col = 0; col < tiles[row].length; col++) {
				tiles[row][col] = new GameTile();
			}
		}
	}
	
	/**
	 * 
	 * @param state
	 * @param row
	 * @param col
	 * @throws IllegalMoveException
	 */
	public void makeMove(GameTile.GameTileConstant state, int row, int col) throws IllegalMoveException{
		assert tiles[row][col] != null;
		
		if(tiles[row][col].getValue() != GameTile.GameTileConstant.BLANK) {
			throw new IllegalMoveException("Player cannot move here");
		}
		
		tiles[row][col].setValue(state);
		gameWon = isWinner();
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isWinner() {
		return false;
	}
}
