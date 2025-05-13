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

