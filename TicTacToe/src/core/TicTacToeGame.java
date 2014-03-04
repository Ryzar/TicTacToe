package core;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import ui.GameModel;
import ui.GameView;
import net.NetworkConnection;
import static core.GameTile.GameTileConstant;

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
		
		player1 = new Player(GameTileConstant.X, NetworkConnection.PLAYER1_CONNECTION);
		player2 = new Player(GameTileConstant.O, NetworkConnection.PLAYER2_CONNECTION);
		
		model = new GameModel(player1, player2);
		view = new GameView(model);
		controller = new GameController(model, view);
		
		//Thread gameThread = new Thread(model);
		//gameThread.start();
	}
}
