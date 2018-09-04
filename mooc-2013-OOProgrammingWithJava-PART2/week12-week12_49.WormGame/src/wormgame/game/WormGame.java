package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.gui.Updatable;
import wormgame.domain.*;

public class WormGame extends Timer implements ActionListener{

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);

        createWorm();
        createApple();
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void createWorm(){
        worm = new Worm(width/2, height/2, Direction.DOWN);
    }

    public Worm getWorm(){
        return worm;
    }

    public void setWorm(Worm worm){
        this.worm = worm;
    }

    public Apple getApple(){
        return apple;
    }

    public void setApple(Apple apple){
        this.apple = apple;
    }

    private void createApple(){
        while(true){
            Random random = new Random();
            apple = new Apple(random.nextInt(width), random.nextInt(height));
            if (!worm.runsInto(apple)) {
                break;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) { // listens to the sent action events by Swing's Timer
        if(!continues){
            return;
        }

        worm.move();

        if(worm.runsInto(apple)){
            worm.grow();
            createApple();
        }

        if(worm.runsIntoItself() || runsIntoBorder()){
            continues = false;
        }

        updatable.update(); // Drawing Board repaint method
        setDelay(1000 / worm.getLength()); // worm speed

    }

    public void reset(){
        createWorm();
        createApple();
        continues = true;
    }

    private boolean runsIntoBorder(){
        Piece headPiece = worm.getHeadPiece();

        if(headPiece.getX() > width || headPiece.getX() < 0 || headPiece.getY() > height || headPiece.getY() < 0){
            return true;
        }

        return false;
    }

}
