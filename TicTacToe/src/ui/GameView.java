package ui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.JFrame;

import core.GameController;

/**
 * 
 * @author Ryan Zarmbinski
 *
 */
@SuppressWarnings("serial")
public class GameView extends JFrame{
	private GamePanel gamePanel;
	private AlertPanel alertPanel;
	private boolean connected;
	/**
	 * Initialize all elements of the main window and panels, invisible to start with,
	 * become visible when two players are connected
	 */
	public GameView(GameModel model) {
		super("TicTacToe");
		connected = true;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(615, 615);
		setResizable(false);
		setLayout(new BorderLayout());
		setVisible(connected);
		gamePanel = new GamePanel(615, 615, model.getBoard());
		add(gamePanel, BorderLayout.CENTER);
		
		alertPanel = new AlertPanel();
		add(alertPanel, BorderLayout.SOUTH);
		
		alertPanel.setText("ERROR: network unplugged");
		alertPanel.setVisible(true);
		
	}
	/**
	 * 
	 * @return
	 */
	public AlertPanel getAlertPanel() {
		return alertPanel;
	}
	public void update(Graphics g) {
		gamePanel.repaint();
	}
	/**
	 * 
	 */
	public void register(GameController controller) {
		GameTileView[][] tileViews = gamePanel.getGameTileViews();
		for(int x = 0; x < tileViews.length; x++) {
			for(int y = 0; y < tileViews[x].length; y++) {
				tileViews[x][y].addMouseListener(controller);
			}
		}
	}
}
