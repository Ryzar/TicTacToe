package core;

/**
 * Representation of a player's Move. Contains information about the parent player as well
 * as the location of the move. Objects made from this class are to be used to transport this
 * information such that it may be used to update the state of the GameBoard as well as the
 * game itself.
 * @author Ryan Zarmbinski
 *
 */
public class Move {
	private Player parent;
	private int[] location;
	
	/**
	 * Creates a new Move object from a parent Player and a location coordinate
	 * @param parent the player from whom this move is created
	 * @param location the row and column of the GameTile changed in this move
	 */
	public Move(Player parent, int[] location) {
		this.parent = parent;
		assert location.length == 2;
		this.location = location;
	}
	
	/**
	 * Accessor method for the location of this move
	 * @return the coordinates of the move
	 */
	public int[] getLocation() {
		return location;
	}
	
	/**
	 * Accessor method for the parent of this move
	 * @return the parent Player of this move
	 */
	public Player getParent() {
		return parent;
	}
}
