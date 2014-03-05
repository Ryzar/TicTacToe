package ui;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
	BufferedImage backgroundImage;
	public GamePanel(int width, int height, GameBoard board){
		super();
		setSize(width, height);
		setLayout(new GridLayout(3, 3, 0, 0));
		try{
			backgroundImage = ImageIO.read(new File("background.jpg"));
		}catch(IOException e){ 
			backgroundImage = null;
		}
		
		this.board = board;
		views = new GameTileView[3][3];
		for(int row = 0; row < views.length; row++) {
			for(int col = 0; col < views[row].length; col++) {
				views[row][col] = new GameTileView(row, col, this.board.getTile(row, col));
				this.add(views[row][col]);
			}
		}
		setVisible(true);
	}
	public void paint(Graphics g) {
		// Create the background image from attached file
		g.drawImage(backgroundImage, 0, 0, null);
		/* Draw each of the four lines for the gameboard */
		g.fillRect(215, 10, 20, 595);
		g.fillRect(390, 10, 20, 595);
		g.fillRect(10, 215, 595, 20);
		g.fillRect(10, 390, 595, 20);
	}
}
