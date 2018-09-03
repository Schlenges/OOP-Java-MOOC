package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.game.WormGame;
import java.util.List;

public class DrawingBoard extends JPanel implements Updatable{

  private WormGame game;
  private int pieceLength;

  public DrawingBoard(WormGame game, int pieceLength){
    super();
    this.game = game;
    this.pieceLength = pieceLength;
  }

  @Override
  public void paintComponent(Graphics graphics){
    super.paintComponent(graphics);
    
    // paint worm
    List<Piece> wormPieces = game.getWorm().getPieces();

    graphics.setColor(Color.BLACK);

    for(Piece piece : wormPieces){
      graphics.fill3DRect(piece.getX()*pieceLength, piece.getY()*pieceLength, pieceLength, pieceLength, true);
    }

    // paint apple
    Piece apple = game.getApple();

    graphics.setColor(Color.RED);

    graphics.fillOval(apple.getX()*pieceLength, apple.getY()*pieceLength, pieceLength, pieceLength);
  }

  @Override
  public void update(){
    repaint();
  }
}