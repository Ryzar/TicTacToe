package core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import ui.GameModel;
import ui.GameTileView;
import ui.GameView;

/**
 * Registers all action listeners for the elements of this game
 * @author Zarmbinski
 *
 */
public class GameController implements ActionListener, MouseListener{
	private GameModel model;
	private GameView view;
	/**
	 * Creates a new object from a model and view
	 * @param model 
	 * @param view 
	 */
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() instanceof GameTileView) {
			GameTileView view = (GameTileView)e.getSource();
			if(view.isActive()) {
				//TODO this is just a dummy operation to show the functionality
				GameTile tileModel = view.getGameTileModel();
				tileModel.setValue(GameTile.GameTileConstant.X);
				view.updateContents();
				System.out.println("Tile value changed at (" + tileModel.getLocation()[0] + ", " + tileModel.getLocation()[1] + ")");
				/*
				   The following is a possible future function of this method:
				
				tileModel.setValue(model.getActivePlayer().getRole());
				view.updateContents();
				model.getActivePlayer().queueMove(new Move(model.getActivePlayer(), tileModel.getLocation()));*/
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
