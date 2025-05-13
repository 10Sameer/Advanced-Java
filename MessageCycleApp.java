import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MessageCycleApp {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Message Cycle");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set background color
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 228, 225)); // Light pink
        panel.setLayout(new BorderLayout());

        // Create label
        JLabel messageLabel = new JLabel("Click the button!", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(messageLabel, BorderLayout.CENTER);

        // Create button
        JButton button = new JButton("Click Me");
        button.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(button, BorderLayout.SOUTH);

        // Add action listener with click counter
     