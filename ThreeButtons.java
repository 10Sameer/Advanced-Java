
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreeButtons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Background change");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));                                 
         // panel.setLayout(new FlowLayout());
        
        JButton button1 = new JButton("Red");
        JButton button2 = new JButton("Green");
        JButton button3 = new JButton("Blue");
        JButton button4 = new JButton("Pink");
        JButton button5 = new JButton("Yellow");

        
        button1.addActionListener(new ColorAction(panel, Color.RED));
        button2.addActionListener(new ColorAction(panel, Color.GREEN));
        button3.addActionListener(new ColorAction(panel, Color.BLUE));
        button3.addActionListener(new ColorAction(panel, Color.PINK));
        button3.addActionListener(new ColorAction(panel, Color.YELLOW));
        
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);

        
        frame.add(panel);
        frame.setVisible(true);
    }
}

class ColorAction implements ActionListener {
    private JPanel panel;
    private Color backgroundColor;
    
    public ColorAction(JPanel panel, Color c) {
        this.panel = panel;
        backgroundColor = c;
    }
    
    public void actionPerformed(ActionEvent event) {
        panel.setBackground(backgroundColor);
    }
}
