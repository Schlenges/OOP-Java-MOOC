package clicker.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

import clicker.applicationlogic.Calculator;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public UserInterface(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BorderLayout layout = new BorderLayout();
        frame.setLayout(layout);

        JLabel label = new JLabel("0");
        JButton button = new JButton("Click!");

        button.addActionListener(new ClickListener(calculator, label));

        container.add(label);
        container.add(button, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
