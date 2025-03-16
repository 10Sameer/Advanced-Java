import java.awt.event.*;
import javax.swing.*;

public class MenuFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    private Action saveAction;
    private Action saveasAction;
    private JCheckBoxMenuItem readonlyItem;
    private JPopupMenu popup;

    class TestAction extends AbstractAction {
        public TestAction(String name) {
            super(name);
        }

        public void actionPerformed(ActionEvent event) {
            System.out.println(getValue(Action.NAME) + " selected");
        }
    }

    public MenuFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("Menu Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar(); // Create the menu bar

        // Create "File" menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');  // Allows Alt + F to open the "File" menu
        fileMenu.add(new TestAction("New"));

        // Demonstrate accelerators
        JMenuItem openItem = fileMenu.add(new TestAction("Open"));
        openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        fileMenu.addSeparator();

        saveAction = new TestAction("Save");
        JMenuItem saveItem = fileMenu.add(saveAction);
        saveItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));

        saveasAction = new TestAction("Save As");
        fileMenu.add(saveasAction);
        fileMenu.addSeparator();

        fileMenu.add(new AbstractAction("Exit") {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        // Create "Edit" menu
        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic('E');  // Allows Alt + E to open the "Edit" menu

        Action cutAction = new TestAction("Cut");
        cutAction.putValue(Action.SMALL_ICON, new ImageIcon("cut.gif"));

        Action copyAction = new TestAction("Copy");
        copyAction.putValue(Action.SMALL_ICON, new ImageIcon("copy.gif"));

        Action pasteAction = new TestAction("Paste");
        pasteAction.putValue(Action.SMALL_ICON, new ImageIcon("paste.gif"));

        editMenu.add(cutAction);
        editMenu.add(copyAction);
        editMenu.add(pasteAction);

        // Create "Options" submenu inside "Edit"
        JMenu optionMenu = new JMenu("Options");
        readonlyItem = new JCheckBoxMenuItem("Read-only");

        readonlyItem.addActionListener(event -> {
            boolean saveOk = !readonlyItem.isSelected();
            saveAction.setEnabled(saveOk);
            saveasAction.setEnabled(saveOk);
        });

        ButtonGroup group = new ButtonGroup();
        JRadioButtonMenuItem insertItem = new JRadioButtonMenuItem("Insert", true);
        JRadioButtonMenuItem overtypeItem = new JRadioButtonMenuItem("Overtype");

        group.add(insertItem);
        group.add(overtypeItem);

        optionMenu.add(readonlyItem);
        optionMenu.addSeparator();
        optionMenu.add(insertItem);
        optionMenu.add(overtypeItem);

        editMenu.addSeparator();
        editMenu.add(optionMenu);

        // Create "Help" menu
        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic('H');  // Allows Alt + H to open the "Help" menu

        JMenuItem indexItem = new JMenuItem("Index");
        indexItem.setMnemonic('I');
        helpMenu.add(indexItem);

        Action aboutAction = new TestAction("About");
        aboutAction.putValue(Action.MNEMONIC_KEY, KeyEvent.VK_A);
        helpMenu.add(aboutAction);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuFrame frame = new MenuFrame();
            frame.setVisible(true);
        });
    }
}

// Try pressing Alt + F to open the "File" menu
// Try pressing Alt + E to open the "Edit" menu
// Try pressing Alt + H to open the "Help" menu




