import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MVCExample {

    // Model: Represents the data
    static class Model {
        private String labelText = "Initial Text";

        public String getLabelText() {
            return labelText;
        }

        public void setLabelText(String newText) {
            labelText = newText;
        }
    }

    // View: Represents the UI elements (button and label)
    static class View {
        private JFrame frame;
        private JButton button;
        private JLabel label;

        public View() {
            frame = new JFrame("MVC Example");
            button = new JButton("Change Text");
            label = new JLabel("Initial Text");

            frame.setLayout(new FlowLayout());
            frame.add(label);
            frame.add(button);
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public JFrame getFrame() {
            return frame;
        }

        public JButton getButton() {
            return button;
        }

        public JLabel getLabel() {
            return label;
        }

        public void updateLabelText(String text) {
            label.setText(text);
        }
    }

    // Controller: Handles user input (button click) and updates the model and view
