package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JPanel;

import core.GameController;
import core.GameTile;

/**
 * 
 * @author Ryan Zarmbinski
 *
 */
@SuppressWarnings("serial")
public class GameTileView extends JComponent{
	private GameTile model;
	private boolean active;
	private BufferedImage IMAGE_X;
	private BufferedImage IMAGE_O;
	private JPanel myPanel;
	/**
	 * 
	 * @param model corresponding GameTile
	 */
	public GameTileView(GameTile model) {
		super();
		IMAGE_O = null;
		IMAGE_X = null;
		try {
			IMAGE_X = ImageIO.read(new File("X32.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.model = model;
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		myPanel = new JPanel();
		this.add(myPanel, BorderLayout.CENTER);
		active = true;
	}
	/**
	 * 
	 * @param controller central object containing all actionlisteners
	 */
	public void register(GameController controller) {
		this.addMouseListener(controller);
	}
	public GameTile getGameTileModel() {
		return model;
	}
	/**
	 * 
	 */
	public void updateContents() {
		updateContents(myPanel.getGraphics());
	}
	
	private void updateContents(Graphics g) {
		switch(model.getValue()) {
		case X: if(IMAGE_X != null)
					g.drawImage(IMAGE_X, 0, 0, null);
				break;
		case O: if(IMAGE_O != null)
					g.drawImage(IMAGE_O, 0, 0, null);
		default: g.clearRect(0, 0, 1000, 1000);
		}
	}
	public void paint(Graphics g) {
		updateContents(g);
	}
	public void update(Graphics g) {
		updateContents(g);
	}
	public boolean isActive() {
		return active;
	}
	public void activate() {
		active = true;
	}
	public void deactivate() {
		active = false;
	}
}
