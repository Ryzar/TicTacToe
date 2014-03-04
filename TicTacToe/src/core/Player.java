package core;
import net.NetworkConnection;
import static core.GameTile.GameTileConstant;
/**
 * This class represents a player in the TicTacToe game
 * @author Ryan Zarmbinski
 *
 */
public class Player {
	@SuppressWarnings("unused")
	private NetworkConnection connection;
	private GameTileConstant role;
	private Move nextMove;
	
	/**
	 * Creates a new Player with a given GameTileConstant role ('X' or 'O'), and a 
	 * NetworkConnection
	 * @param role GameTileConstant representing the player's role ('X' or 'O')
	 * @param connection representation of the over-the-network connection
	 */
	public Player(GameTileConstant role, NetworkConnection connection) {
		this.role = role;
		this.connection = connection;
	}
	
	/**
	 * Sets up the next move to be made
	 * @param move representation of the move
	 */
	public void queueMove(Move move) {
		nextMove = move;
	}
	
	/**
	 * Accessor method for the role of this Player ('X' or 'O')
	 * @return GameTileConstant representation of this player's role
	 */
	public GameTileConstant getRole() {
		return role;
	}
	
	/**
	 * Generates a String representation of this object
	 */
	public String toString() {
		return null;
	}
	
	/**
	 * 
	 */
	public Move getNextMove() {
		if(nextMove != null) {
			Move temp = nextMove;
			nextMove = null;
			return temp;
		}
		return null;
	}
}
