package core;
import net.NetworkConnection;
/**
 * This class represents a player in the TicTacToe game
 * @author Ryan Zarmbinski
 *
 */
public class Player {
	private NetworkConnection connection;
	private String name;
	
	/**
	 * 
	 * @param name
	 * @param connection
	 */
	public Player(String name, NetworkConnection connection) {
		this.name = name;
		this.connection = connection;
	}
	
	/**
	 * Generates a String representation of this object
	 */
	public String toString() {
		return null;
	}
}
