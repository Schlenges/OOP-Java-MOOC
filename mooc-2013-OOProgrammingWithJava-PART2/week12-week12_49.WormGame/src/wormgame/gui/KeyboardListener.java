package wormgame.gui;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import wormgame.Direction;
import wormgame.domain.Worm;
import wormgame.game.WormGame;

public class KeyboardListener implements KeyListener{

  private WormGame game;

  public KeyboardListener(WormGame game){
    this.game = game;
  }

  @Override
  public void keyPressed(KeyEvent e){

    Direction direction = game.getWorm().getDirection();

    switch(e.getKeyCode()){
      case KeyEvent.VK_LEFT:
        direction = Direction.LEFT;
        break;
      case KeyEvent.VK_RIGHT:
        direction = Direction.RIGHT;
        break;
      case KeyEvent.VK_UP:
        direction = Direction.UP;
        break;
      case KeyEvent.VK_DOWN:
        direction = Direction.DOWN;
        break;
      case KeyEvent.VK_SPACE:
        game.reset();
        break;
    }

    game.getWorm().setDirection(direction);
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }

  @Override
  public void keyTyped(KeyEvent ke) {
  }
}