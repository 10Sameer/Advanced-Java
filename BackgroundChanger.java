import java.awt.*;  
import java.awt.event.*;  

public class BackgroundChanger extends Frame implements ActionListener {  
    Button btn;  

    BackgroundChanger() {  
        // Create Button
        btn = new Button("Change Color");  
        btn.setBounds(100, 100, 120, 50);  
        
        // Register Event Listener
        btn.addActionListener(this);  
        add(btn);  
        
        // Frame Settings
        setSize(400, 300);  
        setLayout(null);  
        setVisible(true);  
        
        // Close Window on Clicking 'X'
        addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
    }  

    public void actionPerformed(ActionEvent e) {  
        // Change Background Color Randomly on Click
        setBackground(new Color((int)(Math.random() * 0x1000000)));  
    }  

    public static void main(String[] args) {  
        new BackgroundChanger();  
    }  
}  
