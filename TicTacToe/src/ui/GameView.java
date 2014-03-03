package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Ryan Zarmbinski
 *
 */
public class GameView extends JFrame{
	private GamePanel gamePanel;
	private JLabel backgroundImage;
	private AlertPanel alertPanel;
	private boolean connected;
	/**
	 * Initialize all elements of the main window and panels, invisible to start with,
	 * become visible when two players are connected
	 */
	public GameView() {
		super("TicTacToe");
		connected = false;
		setVisible(connected);
		setLayout(new BorderLayout());
		gamePanel = new GamePanel(getClass().getResource("background.jpg"), 615, 615);
		
		alertPanel = new AlertPanel();
		add(alertPanel, BorderLayout.SOUTH);
		
	}
	/**
	 * 
	 * @param g
	 */
	public void paint(Graphics g) {
		
	}
}
