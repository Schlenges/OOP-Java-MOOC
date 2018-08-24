package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ActionEventListener implements ActionListener{

  private JTextField text;
  private JLabel label;
  
  public ActionEventListener(JTextField text, JLabel label){
    this.text = text;
    this.label = label;
  }

  @Override
  public void actionPerformed(ActionEvent event){
    label.setText(text.getText());
    text.setText("");
  }

}