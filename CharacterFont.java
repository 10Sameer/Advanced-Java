import javax.swing.*;
import java.awt.*;

public class CharacterFont extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Ensures proper rendering

        // Set the font (Font name, Style, Size)
        Font myFont = new Font("Serif", Font.BOLD, 50); 
        g.setFont(myFont);

        // Set the color
        g.setColor(Color.RED);

        // Draw the character
        g.drawString("A" ,100, 100); 
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Character in Font"); // Create a JFrame
        CharacterFont panel = new CharacterFont(); // Create an instance of the custom panel
        
        frame.add(panel); // Add panel to frame
        frame.setSize(400, 400); // Set frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        frame.setVisible(true); // Make frame visible
    }
}
