package simpleslickgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class HelloWorld extends BasicGameState {

	private int stateId = 0;
    private String text = "Hello World!\nMy name is Zoeira\nPress Space";
    private String currentText = "";
    private int count = 0;
    private int index = 0;
    private boolean space = false;
	
    public HelloWorld(int state) {
    	this.stateId = state;
    }
    
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString(currentText, 40, 40);
		
		if (space) {
			g.drawString("A nota de cálculo ainda não saiu porra.", 100, 100);
		}
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		Input input = gc.getInput();
		
		if(count < 30) {
            count += delta;
        } else {
            count = 0;
            if(index < text.length()) {
                currentText += text.charAt(index++);
            }
        }
		
		if (input.isKeyPressed(Input.KEY_SPACE)) {
			space = true;
		}
		
	}

	@Override
	public int getID() {
		return this.stateId;
	}

}
