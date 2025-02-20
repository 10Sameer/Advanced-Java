import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropdownExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Dropdown Menu Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a label
        JLabel label = new JLabel("Select an option:");

        // Create a dropdown menu (ComboBox)
        String[] options = {"Manchester United", "Man city", "Messi", "Barcelona"};
        JComboBox<String> dropdown = new JComboBox<>(options);

        // Create a button
        JButton button = new JButton("Show Selection");

        // Create an action listener for the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) dropdown.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "You selected: " + selectedItem);
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(dropdown);
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
