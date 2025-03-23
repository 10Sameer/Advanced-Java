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
    static class Controller {
        private Model model;
        private View view;

        public Controller(Model model, View view) {
            this.model = model;
            this.view = view;

            // Add ActionListener to the button
            view.getButton().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    model.setLabelText("Hello How are you!");  // Update model's label text
                    view.updateLabelText(model.getLabelText());  // Update the view with the new text
                }
            });
        }
    }

    // Main Program: Creates and ties together the Model, View, and Controller
    public static void main(String[] args) {
        // Create the model (data)
        Model model = new Model();

        // Create the view (UI)
        View view = new View();

        // Create the controller to handle events and update the model and view
        Controller controller = new Controller(model, view);

        // Display the view (open the main window)
        view.getFrame().setVisible(true);
    }
}
