import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballDropdown {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Football Dropdown");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a label
        JLabel label = new JLabel("Select a team or player:");

        // Create a dropdown menu (ComboBox)
        String[] options = {"Manchester United", "Man City", "Messi", "Barca"};
        JComboBox<String> dropdown = new JComboBox<>(options);

        // Create a result label
        JLabel resultLabel = new JLabel("");

        // Create an action listener for the dropdown
        dropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) dropdown.getSelectedItem();
                
                // Change result label based on selection
                switch (selectedItem) {
                    case "Manchester United":
                        resultLabel.setText("The Best Team. The Legend! 🔴⚽");
                        break;
                    case "Man City":
                        resultLabel.setText("Soo good enough! 🔵🏆");
                        break;
                    case "Messi":
                        resultLabel.setText("The Best Player of the Universe... The GOAT! 🐐⚽");
                        break;
                    case "Barca":
                        resultLabel.setText("Better than Var Madrid! 🔴🔵✨");
                        break;
                }
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(dropdown);
        frame.add(resultLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
