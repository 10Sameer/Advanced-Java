import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToggleButtonBackground {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Toggle Button Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a button
        JButton button = new JButton("Click Me");

        // Create a panel to change background color
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));

        // Counter for clicks
        final int[] clickCount = {0};

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount[0]++;

                if (clickCount[0] == 1) {
                    panel.setBackground(Color.RED);
                } else if (clickCount[0] == 2) {
                    panel.setBackground(Color.BLUE);
                } else if (clickCount[0] == 3) {
                    panel.setBackground(Color.GREEN);
                } else {
                    JOptionPane.showMessageDialog(frame, "Enough clicking!");
                    button.setEnabled(false); // Disable the button after third click
                }
            }
        });

        // Add components to the frame
        frame.add(button);
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
