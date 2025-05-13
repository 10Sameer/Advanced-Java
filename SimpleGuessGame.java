import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SimpleGuessGame extends JFrame {
    private int secretNumber;
    private JTextField guessField;
    private JLabel messageLabel;

    public SimpleGuessGame() {
        // Set up frame
        setTitle("Guess Game");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);
        setLocationRelativeTo(null); // Center on screen

        // Set background color
        getContentPane().setBackground(new Color(245, 255, 250)); // Minty fresh

        // Generate random number
        resetGame();

        // UI Components
        messageLabel = new JLabel("Guess between 1–100", SwingConstants.CENTER);
        guessField = new JTextField();
        JButton guessButton = new JButton("Guess");

        // Panel for input
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(guessField, BorderLayout.CENTER);
        inputPanel.add(guessButton, BorderLayout.EAST);

        // Add components
        add(messageLabel, BorderLayout.NORTH);
        add(inputPanel, BorderLayout.CENTER);


