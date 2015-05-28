package simpleslickgame;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class SimpleSlickGame extends StateBasedGame {
	
	public SimpleSlickGame(String gamename) {
		super(gamename);
	}

	public static void main(String[] args) {
		try {
			AppGameContainer appgc;
			appgc = new AppGameContainer(new SimpleSlickGame("Simple Slick Game"));
			appgc.setTargetFrameRate(60);
			appgc.setAlwaysRender(true);
			appgc.setMaximumLogicUpdateInterval(60);
			appgc.setVSync(true);
			appgc.setDisplayMode(640, 480, false);
			appgc.start();
		} catch (SlickException ex) {
			Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		this.addState(new HelloWorld(0));
	}
}
