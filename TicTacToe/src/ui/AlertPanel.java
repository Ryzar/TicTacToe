package ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Ryan Zarmbinski
 *
 */
public class AlertPanel extends JPanel{
	private JLabel text;
	private boolean visible;
	
	/**
	 * 
	 */
	public AlertPanel() {
		super();
		this.setBackground(Color.RED);
		text = new JLabel("");
		visible = false;
		add(text);
	}
	/**
	 * 
	 */
	public void setVisible(boolean visibility) {
		visible = visibility;
		this.setVisible(visible);
		this.update(getGraphics());
	}
	/**
	 * 
	 * @param text
	 */
	public void setText(String text) {
		this.text.setText(text);
		this.update(getGraphics());
	}
	/**
	 * 
	 */
	public void update(Graphics g) {
		paint(g);
	}
}
