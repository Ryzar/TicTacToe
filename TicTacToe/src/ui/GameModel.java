package ui;
import core.GameBoard;
import core.IllegalMoveException;
import core.Move;
import core.Player;

import java.util.Random;

/**
 * Representation of a new game of tic tac toe. Designed to be run in a Thread
 * @author Ryan Zarmbinski
 */
public class GameModel implements Runnable{
	private Player player1;
	private Player player2;
	private GameBoard board;
	private Player activePlayer;
	
	/**
	 * Creates a new object from two player representations
	 * @param player1 the first player of this game
	 * @param player2 the second player of this game
	 */
	public GameModel(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		board = new GameBoard();
	}

	/**
	 * Accessor method for the game board
	 * @return
	 */
	public GameBoard getBoard() {
		return board;
	}

	/**
	 * Accessor method that retrieves the player whose turn it is.
	 * @return the current active player
	 */
	public Player getActivePlayer() {
		return activePlayer;
	}

	/**
	 * Switches the active players
	 */
	public void switchPlayers() {
		assert activePlayer != null;
		if(activePlayer.equals(player1)) {
			activePlayer = player2;
		}
		activePlayer = player1;
	}
	public Player[] getPlayers() {
		return new Player[]{player1, player2};
	}
	/**
	 * 
	 */
	public void run() {
		Random r = new Random(System.nanoTime());
		activePlayer = r.nextBoolean() ? player1 : player2;
		
		while(true) {
			Move currentMove = null;
			while(currentMove == null) {
				currentMove = activePlayer.getNextMove();
			}
			try {
				board.makeMove(activePlayer.getRole(), currentMove.getLocation()[0], currentMove.getLocation()[1]);
			} catch (IllegalMoveException e) {
				//Illegal move has been made. handle it here
			}
			switchPlayers();
		}
	}
}
