import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;
import java.lang.NumberFormatException;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ClickListener implements ActionListener{
  private JTextField input;
  private JTextField output;
  private JButton reset;
  private Calculator calculator;

  public ClickListener(JTextField output, JTextField input, JButton reset){
    this.input = input;
    this.output = output;
    this.reset = reset;
    this.calculator = new Calculator();
  }

  @Override
  public void actionPerformed(ActionEvent event){
    int n = 0;

    try{
      n = Integer.parseInt(input.getText());
    } catch(NumberFormatException e){}

    if(event.getActionCommand().equals("+")){
      calculator.add(n);
    } else if(event.getActionCommand().equals("-")){
      calculator.subtract(n);
    } else if(event.getActionCommand().equals("Z")){
      calculator.reset();
    }

    input.setText("");
    output.setText("" + calculator.getValue());
    
    if(calculator.getValue() == 0){
      reset.setEnabled(false);
    } else {
        reset.setEnabled(true);
    }

  }
}