package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Representation of the alert box at the bottom of the window. This box will be used to
 * alert the user of the current state of the network connection, an illegal move, or if
 * it is simply the other player's turn.
 * @author Ryan Zarmbinski
 *
 */
@SuppressWarnings("serial")
public class AlertPanel extends JPanel{
	private JLabel text;
	
	/**
	 * Creates a new, blank, invisible alert panel
	 */
	public AlertPanel() {
		super();
		this.setBackground(Color.RED);
		this.setForeground(Color.WHITE);
		this.setLayout(new BorderLayout());
		text = new JLabel("");
		add(text, BorderLayout.WEST);
		setVisible(false);
	}
	/**
	 * Updates the text of this panel to reflect the new state that must be conveyed to the user
	 * @param text message text to be displayed
	 */
	public void setText(String text) {
		this.text.setText(text);
		if(!this.isVisible()) {
			this.setVisible(true);
		}
		this.update(getGraphics());
	}
	
	public void update(Graphics g) {
		paint(g);
	}
}
