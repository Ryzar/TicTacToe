package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import core.GameBoard;

/**
 * This class creates the main section of the game window. This is where all of the action
 * aside from the alert box happens.
 * @author Ryan Zarmbinski
 *
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel{
	/**
	 * 
	 * @param backgroundImageURL
	 */
	private GameBoard board;
	private GameTileView[][] views;
	public GamePanel(URL backgroundImageURL, int width, int height, GameBoard board) {
		super();
		setSize(width, height);
		setBackground(Color.WHITE);
		setLayout(new GridLayout(3, 3, 10, 10));
		JLabel background = null;
		if(backgroundImageURL != null) {
			background = new JLabel(new ImageIcon(backgroundImageURL));
			add(background);
		}
		
		this.board = board;
		views = new GameTileView[3][3];
		for(int row = 0; row < views.length; row++) {
			for(int col = 0; col < views[row].length; col++) {
				views[row][col] = new GameTileView(row, col, this.board.getTile(row, col));
				this.add(views[row][col]);
			}
		}
	}
}
