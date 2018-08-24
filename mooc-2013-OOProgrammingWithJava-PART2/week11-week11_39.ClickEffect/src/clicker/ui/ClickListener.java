package clicker.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

import clicker.applicationlogic.Calculator;

public class ClickListener implements ActionListener{

  private Calculator calculator;
  private JLabel label;

  public ClickListener(Calculator calculator, JLabel label){
    this.calculator = calculator;
    this.label = label;
  }

  @Override
  public void actionPerformed(ActionEvent event){
    calculator.increase();
    label.setText("" + calculator.giveValue());
  }
}