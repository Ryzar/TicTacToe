package core;

/**
 * Representation of an Illegal move
 * @author Ryan Zarmbinski
 *
 */
public class IllegalMoveException extends Exception {
	public IllegalMoveException(String message) {
		super(message);
	}
}
