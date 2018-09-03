package wormgame.gui;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import wormgame.Direction;
import wormgame.domain.Worm;

public class KeyboardListener implements KeyListener{

  private Worm worm;

  public KeyboardListener(Worm worm){
    this.worm = worm;
  }

  @Override
  public void keyPressed(KeyEvent e){

    Direction direction = worm.getDirection();

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
    }

    worm.setDirection(direction);
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }

  @Override
  public void keyTyped(KeyEvent ke) {
  }
}