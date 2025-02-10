import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonFrame extends JFrame {
     public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new ButtonFrame();
            frame.setTitle("ButtonFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
    private JPanel buttonPanel;
    public static final int DEFAULT_WIDTH = 300 ;
    public static final int DEFAULT_HEIGHT = 300 ;
    
    public ButtonFrame(){
        setSize(DEFAULT_HEIGHT,DEFAULT_WIDTH);

        //create buttons
        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton pinkButton = new JButton("Pink");

        buttonPanel = new JPanel();

        // add buttons to panel
        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(pinkButton);

        add(buttonPanel);

        //create action buttons
        ColorAction yellowAction= new ColorAction(Color.YELLOW);
        ColorAction blueAction= new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);
        ColorAction greenAction = new ColorAction(Color.GREEN);
        ColorAction pinkAction = new ColorAction(Color.PINK);


        // assocate action with buttons
        yellowButton.addActionListener (yellowAction);
        blueButton.addActionListener (blueAction);
        redButton.addActionListener (redAction);
        greenButton.addActionListener (greenAction);
        pinkButton.addActionListener (pinkAction);
 }

 private class ColorAction implements ActionListener {
    private Color backgroundColor ;
    public ColorAction(Color c){
        backgroundColor = c;
    }
    
    public void actionPerformed(ActionEvent event){
        buttonPanel.setBackground(backgroundColor);
    }
 }
}


