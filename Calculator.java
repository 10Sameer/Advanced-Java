import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField display;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;

    public Calculator() {
        setTitle("Calculator");
        setSize(250, 350);  // Smaller size for a compact look
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        result = 0;
        lastCommand = "=";
        start = true;

        // Display Field (Smaller height)
        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 20));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        display.setPreferredSize(new Dimension(250, 40));
        add(display, BorderLayout.NORTH);

        // Button Panel (Compact layout)
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 3, 3)); 

        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", command);

        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);

        addButton("0", insert);
        addButton(".", insert);
        addButton("=", command);
        addButton("+", command);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.setFont(new Font("Arial", Font.BOLD, 16)); // Smaller font
        button.setFocusPainted(false);
        button.setBackground(Color.LIGHT_GRAY);
        button.setPreferredSize(new Dimension(50, 50)); // Smaller button size
        button.addActionListener(listener);
        panel.add(button);
    }

    private class InsertAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String input = event.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }

    private class CommandAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            if (start) {
                if (command.equals("-")) {
                    display.setText(command);
                    start = false;
                } else {
                    lastCommand = command;
                }
            } else {
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                start = true;
            }
        }
    }

    private void calculate(double x) {
        switch (lastCommand) {
            case "+" -> result += x;
            case "-" -> result -= x;
            case "*" -> result *= x;
            case "/" -> result /= x;
            case "=" -> result = x;
        }
        display.setText("" + result);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
