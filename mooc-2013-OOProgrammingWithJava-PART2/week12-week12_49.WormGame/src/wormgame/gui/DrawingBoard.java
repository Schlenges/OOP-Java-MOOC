package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.game.WormGame;
import java.util.List;

public class DrawingBoard extends JPanel implements Updatable{

  private WormGame game;
  private int length;

  public DrawingBoard(WormGame game, int length){
    this.game = game;
    this.length = length;
  }

  @Override
  public void paintComponent(Graphics graphics){
    super.paintComponent(graphics);
    
    graphics.setColor(Color.BLACK);
    for(Piece piece : game.getWorm().getPieces()){
      graphics.fill3DRect(piece.getX() * length, piece.getY() * length, length, length, true);
    }

    graphics.setColor(Color.RED);
    Apple apple = game.getApple();
    graphics.fillOval(apple.getX() * length, apple.getY() * length, length, length);
  }

  @Override
  public void update(){
    repaint();
  }
}