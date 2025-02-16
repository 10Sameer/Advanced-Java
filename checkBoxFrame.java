import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Frame with a sample text label and checkboxes for selecting font attributes.
 */
public class checkBoxFrame extends JFrame {
    private JLabel label;
    private JCheckBox bold;
    private JCheckBox italic;
    private static final int FONTSIZE = 24;

    public checkBoxFrame() {
        // Set frame title
        setTitle("Checkbox Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Add the sample text label
        label = new JLabel("The quick brown fox jumps over the lazy dog.");
        label.setFont(new Font("Serif", Font.BOLD, FONTSIZE));
        add(label, BorderLayout.CENTER);
        
        // This listener to set the Attributes 
        ActionListener listener = event -> {
            int mode = 0;
            if (bold.isSelected()) mode += Font.BOLD;
            if (italic.isSelected()) mode += Font.ITALIC;
            label.setFont(new Font("Serif", mode, FONTSIZE));
        };
        
        // Add the checkboxes
        JPanel buttonPanel = new JPanel();
        bold = new JCheckBox("Bold");
        bold.addActionListener(listener);
        bold.setSelected(true);
        buttonPanel.add(bold);
        
        italic = new JCheckBox("Italic");
        italic.addActionListener(listener);
        buttonPanel.add(italic);
        
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(checkBoxFrame::new);
    }
}
