package ui;

import java.awt.Graphics;
import java.net.URL;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import core.GameBoard;

/**
 * 
 * @author Ryan Zarmbinski
 *
 */
public class GamePanel extends JPanel{
	/**
	 * 
	 * @param backgroundImageURL
	 */
	private GameBoard board;
	public GamePanel(URL backgroundImageURL, int width, int height, GameBoard board) {
		super();
		setSize(width, height);
		JLabel background = new JLabel(new ImageIcon(backgroundImageURL));
		add(background);
		
		this.board = board;
	}
	
	public void paint(Graphics g) {
		
	}
}
