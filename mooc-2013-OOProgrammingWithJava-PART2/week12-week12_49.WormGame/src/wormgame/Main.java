package wormgame;

import javax.swing.SwingUtilities;
import wormgame.gui.UserInterface;
import wormgame.domain.Worm;
import wormgame.game.WormGame;

public class Main {

    public static void main(String[] args) {
        WormGame game = new WormGame(6, 3);
        System.out.println(game.getApple());
    }
}
