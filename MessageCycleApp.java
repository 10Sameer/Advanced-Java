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

       