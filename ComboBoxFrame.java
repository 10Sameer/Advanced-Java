
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ComboBoxFrame extends JFrame{
    private JComboBox<String> faceCombo;
    private JLabel label;
    private static final int DEFAULT_SIZE = 24;
    public ComboBoxFrame(){
    label = new JLabel("The quick brown fox jumps over the lazy dog. ");
    label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
    add(label, BorderLayout.CENTER);
    faceCombo = new JComboBox<>();
    faceCombo.addItem("Serif");
    faceCombo.addItem("SansSerif");
    faceCombo.addItem("Monospaced");
    faceCombo.addItem("Dialog");
    faceCombo.addItem("DialogInput");
    // the combo box listener changes the label font to the selected face name
    faceCombo.addActionListener(event ->
    label.setFont(
    new Font(faceCombo.getItemAt(faceCombo.getSelectedIndex()),
     Font.PLAIN, DEFAULT_SIZE)));
    // add combo box to a panel at the frame's southern border
    JPanel comboPanel = new JPanel ();
     comboPanel .add(faceCombo);
     add(comboPanel, BorderLayout. SOUTH);
    pack();
    }
   
}
