package ui;
import core.Player;

/**
 * 
 * @author Ryan Zarmbinski
 *
 */
public class GameModel {
	private Player player1;
	private Player player2;
	
	/**
	 * 
	 * @param player1
	 * @param player2
	 */
	public GameModel(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
}
