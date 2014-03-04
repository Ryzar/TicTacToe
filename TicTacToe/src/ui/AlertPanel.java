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
public class AlertPanel extends JPanel{
	private JLabel text;
	private boolean visible;
	
	/**
	 * Creates a new, blank, invisible alert panel
	 */
	public AlertPanel() {
		super();
		this.setBackground(Color.RED);
		this.setForeground(Color.WHITE);
		this.setLayout(new BorderLayout());
		text = new JLabel("");
		setVisible(false);
		add(text, BorderLayout.WEST);
	}
	public void setVisible(boolean visibility) {
		visible = visibility;
		super.setVisible(visibility);
		this.update(getGraphics());
	}
	/**
	 * Updates the text of this panel to reflect the new state that must be conveyed to the user
	 * @param text message text to be displayed
	 */
	public void setText(String text) {
		this.text.setText(text);
		this.update(getGraphics());
	}
	public void update(Graphics g) {
		paint(g);
	}
}
