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
	/**
	 * Creates a new GamePanel object from a width and height as well as a GameBoard object
	 * @param width the distance from the left
	 * @param height the distance from the bottom
	 * @param board the GameBoard object that is associated with this GamePanel
	 */
	public GamePanel(int width, int height, GameBoard board){
		super();
		setSize(width, height);
		setLayout(new GridLayout(3, 3, 20, 20));
		try{
			backgroundImage = ImageIO.read(new File("background.jpg"));
		}catch(IOException e){ 
			backgroundImage = null;
		}
		
		this.board = board;
		views = new GameTileView[3][3];
		for(int row = 0; row < views.length; row++) {
			for(int col = 0; col < views[row].length; col++) {
				views[row][col] = new GameTileView(this.board.getTile(row, col));
				this.add(views[row][col]);
			}
		}
		setVisible(true);
	}
	/**
	 * draws the tic-tac-toe cross
	 */
	public void paint(Graphics g) {
		// Create the background image from attached file
		g.drawImage(backgroundImage, 0, 0, null);
		/* Draw each of the four lines for the gameboard */
		g.fillRect(195, 10, 20, 605);
		g.fillRect(400, 10, 20, 595);
		g.fillRect(10, 195, 595, 20);
		g.fillRect(10, 400, 595, 20);
		for(int row = 0; row < views.length; row++) {
			for(int col = 0; col < views[row].length; col++) {
				views[row][col].updateContents();
			}
		}
	}
	/**
	 * Accessor method for the GameTileView objects associated with this panel
	 * @return matrix of GameTileView objects
	 */
	public GameTileView[][] getGameTileViews() {
		return views;
	}
}
