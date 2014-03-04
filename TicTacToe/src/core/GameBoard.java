package core;

import core.GameTile.GameTileConstant;

/**
 * Representation of the tic tac toe game board. Consists of a 3-by-3 grid of {@link GameTile}s,
 * and each time a value is changed, this class will check to see if a winner can be determined
 * @author Ryan Zarmbinski
 *
 */
public class GameBoard {
	private GameTile[][] tiles;
	private GameTileConstant winner;
	
	/**
	 * Creates a new blank game board
	 */
	public GameBoard() {
		tiles = new GameTile[3][3];
		for(int row = 0; row < tiles.length; row++) {
			for(int col = 0; col < tiles[row].length; col++) {
				tiles[row][col] = new GameTile(row, col);
			}
		}
	}
	
	/**
	 * Attempts to change a value on the game board as a result of a player's move
	 * @param state X's or O's, depending on the current active player
	 * @param row the row number of the game tile in question
	 * @param col the column number of the game tile in question
	 * @throws IllegalMoveException the active player tries to make an illegal move
	 */
	public void makeMove(GameTile.GameTileConstant state, int row, int col) throws IllegalMoveException{
		assert tiles[row][col] != null;
		
		if(tiles[row][col].getValue() != GameTile.GameTileConstant.BLANK) {
			throw new IllegalMoveException("Player cannot move here");
		}
		
		tiles[row][col].setValue(state);
		winner = getWinner();
	}
	
	/**
	 * Determines if the state of the game board is a winning one or not
	 * @return <code>true</code> if there is a winner, <code>false</code> otherwise
	 */
	public boolean isWinner() {
		return winner != GameTileConstant.BLANK;
	}
	
	/**
	 * Accessor method for a single GameTile in the 3-by-3 grid
	 * @param row row number of the tile
	 * @param col column number of the tile
	 * @return GameTile representation of the game tile requested
	 */
	public GameTile getTile(int row, int col) {
		return tiles[row][col];
	}
	
	/**
	 * Checks each of the 8 possible winning positions
	 * @return <code>true</code> if winning position, <code>false</code> otherwise
	 */
	public GameTileConstant getWinner() {
		/*
		 * check:
		 * + + +
		 * . . .
		 * . . .
		 */
		if(tiles[0][0].getValue() == tiles[0][1].getValue() && tiles[0][1].getValue() == tiles[0][2].getValue()) {
			return tiles[0][0].getValue();
		}
		/*
		 * check:
		 * . . .
		 * + + +
		 * . . .
		 */
		if(tiles[1][0].getValue() == tiles[1][1].getValue() && tiles[1][1].getValue() == tiles[1][2].getValue()) {
			return tiles[1][0].getValue();
		}
		/*
		 * check:
		 * . . .
		 * . . .
		 * + + +
		 */
		if(tiles[2][0].getValue() == tiles[2][1].getValue() && tiles[2][1].getValue() == tiles[2][2].getValue()) {
			return tiles[2][0].getValue();
		}
		/*
		 * check:
		 * + . .
		 * + . .
		 * + . .
		 */
		if(tiles[0][0].getValue() == tiles[1][0].getValue() && tiles[1][0].getValue() == tiles[2][0].getValue()) {
			return tiles[0][0].getValue();
		}
		/*
		 * check:
		 * . + .
		 * . + .
		 * . + .
		 */
		if(tiles[0][1].getValue() == tiles[1][1].getValue() && tiles[1][1].getValue() == tiles[2][1].getValue()) {
			return tiles[0][1].getValue();
		}
		/*
		 * check:
		 * . . +
		 * . . +
		 * . . +
		 */
		if(tiles[0][2].getValue() == tiles[1][2].getValue() && tiles[1][2].getValue() == tiles[2][2].getValue()) {
			return tiles[0][2].getValue();
		}
		/*
		 * check:
		 * + . .
		 * . + .
		 * . . +
		 */
		if(tiles[0][0].getValue() == tiles[1][1].getValue() && tiles[1][1].getValue() == tiles[2][2].getValue()) {
			return tiles[0][0].getValue();
		}
		/*
		 * check:
		 * . . +
		 * . + .
		 * + . .
		 */
		if(tiles[0][2].getValue() == tiles[1][1].getValue() && tiles[1][1].getValue() == tiles[2][0].getValue()) {
			return tiles[0][2].getValue();
		}
		return GameTileConstant.BLANK;
	}
}
