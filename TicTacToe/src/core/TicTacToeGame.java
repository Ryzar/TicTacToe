package core;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import ui.GameModel;
import ui.GameView;
import net.NetworkConnection;

/**
 * 
 * @author Ryan Zarmbinski
 *
 */
public class TicTacToeGame {
	public static void main(String[] args) {
		Player player1, player2;
		GameModel model;
		GameView view;
		GameController controller;
		
		player1 = new Player("Player 1", NetworkConnection.PLAYER1_CONNECTION);
		player2 = new Player("Player 2", NetworkConnection.PLAYER2_CONNECTION);
		
		model = new GameModel(player1, player2);
		view = new GameView();
		controller = new GameController();
		
	}
}
