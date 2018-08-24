
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        frame.setLayout(layout);

        JTextField output = new JTextField("0");
        output.setEnabled(false);

        JTextField input = new JTextField();

        JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton reset = new JButton("Z");
        reset.setEnabled(false);

        ClickListener clickListener = new ClickListener(output, input, reset);

        add.addActionListener(clickListener);
        sub.addActionListener(clickListener);
        reset.addActionListener(clickListener);

        panel.add(add);
        panel.add(sub);
        panel.add(reset);

        container.add(output);
        container.add(input);
        container.add(panel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
