package core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui.GameModel;
import ui.GameTileView;
import ui.GameView;

/**
 * 
 * @author Zarmbinski
 *
 */
public class GameController implements ActionListener{
	private GameModel model;
	private GameView view;
	/**
	 * 
	 */
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() instanceof GameTileView) {
			
		}
	}
}
