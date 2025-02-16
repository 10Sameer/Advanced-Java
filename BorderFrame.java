import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

// A frame with radio buttons to pick a border style.
public class BorderFrame extends JFrame {
    private JPanel demoPanel;
    private JPanel buttonPanel;
    private ButtonGroup group;

    public BorderFrame() {
        demoPanel = new JPanel();
        buttonPanel = new JPanel();
        group = new ButtonGroup();

        // Add radio buttons with different border styles
        addRadioButton("Lowered Bevel", BorderFactory.createLoweredBevelBorder());
        addRadioButton("Raised Bevel", BorderFactory.createRaisedBevelBorder());
        addRadioButton("Etched", BorderFactory.createEtchedBorder());
        addRadioButton("Line", BorderFactory.createLineBorder(Color.BLUE));
        addRadioButton("Matte", BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLUE));
        addRadioButton("Empty", BorderFactory.createEmptyBorder());

        // Add titled border to the button panel
        Border etched = BorderFactory.createEtchedBorder();
        Border titled = BorderFactory.createTitledBorder(etched, "Border types");
        buttonPanel.setBorder(titled);

        setLayout(new GridLayout(2, 1));
        add(buttonPanel);
        add(demoPanel);

        // Set default border
        demoPanel.setBorder(BorderFactory.createLoweredBevelBorder());

        pack(); // Adjusts frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void addRadioButton(String buttonName, Border b) {
        JRadioButton button = new JRadioButton(buttonName);
        button.addActionListener(event -> {
            demoPanel.setBorder(b);
            demoPanel.repaint();
        });
        group.add(button);
        buttonPanel.add(button);

        // Set the first button as default selection
        if (group.getSelection() == null) {
            button.setSelected(true);
            demoPanel.setBorder(b);
        }
    }

    public static void main(String[] args) {
        new BorderFrame();
    }
}
