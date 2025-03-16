import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class wish {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Message App");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

   
        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);
        label.setBounds(50, 50, 300, 50);
        label.setBorder(new LineBorder(Color.BLACK, 2));
        frame.add(label);

       
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("<html><div style='text-align: center;'>So I wish you to be<br>successful and happy</div></html>");
                label.setBorder(new LineBorder(Color.RED, 2)); 
            }
        });

        
        frame.setVisible(true);
    }
}
