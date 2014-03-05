package ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

import core.GameController;
import core.GameTile;

/**
 * 
 * @author Ryan Zarmbinski
 *
 */
@SuppressWarnings("serial")
public class GameTileView extends JButton{
	private GameTile model;
	private JLabel contents;
	private final JLabel CONTENTS_X = new JLabel("X");//new JLabel(new ImageIcon(getClass().getResource("X32.png")));
	private final JLabel CONTENTS_O = new JLabel("O");//new JLabel(new ImageIcon(getClass().getResource("O32.png")));
	private final JLabel CONTENTS_BLANK = new JLabel();
	private boolean active;
	/**
	 * 
	 * @param model corresponding GameTile
	 */
	public GameTileView(int width, int height, GameTile model) {
		super();
		this.setSize(width, height);
		this.model = model;
		contents = CONTENTS_BLANK;
		setText("gametile");
		this.setLayout(new BorderLayout());
		this.add(contents, BorderLayout.CENTER);
		this.setVisible(true);
		active = true;
	}
	/**
	 * 
	 * @param controller central object containing all actionlisteners
	 */
	public void register(GameController controller) {
		this.addActionListener(controller);
	}
	public GameTile getGameTileModel() {
		return model;
	}
	/**
	 * 
	 */
	public void updateContents() {
		switch(model.getValue()) {
		case X: contents = CONTENTS_X;break;
		case O: contents = CONTENTS_O;break;
		case BLANK: contents = CONTENTS_BLANK;
		}
		if(contents == null) {
			contents = new JLabel("ERROR: can't find resource");
		}
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
