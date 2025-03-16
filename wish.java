import javax.swing.*;
import java.awt.event.*;

public class wish {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Message App");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

   
        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);
        label.setBounds(50, 50, 300, 50);
        frame.add(label);

       
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("So I wish you to be successful and happy");
            }
        });

        
        frame.setVisible(true);
    }
}
