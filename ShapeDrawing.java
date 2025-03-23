import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class ShapeDrawing extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  
        Graphics2D g2 = (Graphics2D) g;  
        
        // Set color and draw shapes
        g2.setColor(Color.RED);
        g2.fillRect(50, 50, 100, 50);  // Filled Rectangle
        
        g2.setColor(Color.BLUE);
        g2.drawOval(200, 50, 100, 100);  // Circle (Oval with equal width & height)
        
        g2.setColor(Color.GREEN);
        g2.fillRoundRect(50, 150, 100, 50, 20, 20);  // Rounded Rectangle
        
        g2.setColor(Color.MAGENTA);
        g2.draw(new Line2D.Double(200, 150, 300, 200));  // Line
        
        g2.setColor(Color.ORANGE);
        g2.fill(new Ellipse2D.Double(50, 250, 100, 50));  // Ellipse
        
        g2.setColor(Color.BLACK);
        g2.draw(new Arc2D.Double(200, 250, 100, 50, 0, 180, Arc2D.OPEN));  // Arc
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Shape Drawing");  
        ShapeDrawing panel = new ShapeDrawing();  
        
        frame.add(panel);  
        frame.setSize(400, 400);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }
}
