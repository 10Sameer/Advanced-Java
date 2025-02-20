package org.nuptse.gui.menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuFrame extends JFrame {

    class TestAction extends AbstractAction {
        public TestAction(String name) {
            super(name);
        }

        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println(getValue(Action.NAME) + " selected");
        }
    }

    public MenuFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new TestAction("New"));

        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new TestAction("CTRL O"));
        fileMenu.add(openItem);

        fileMenu.addSeparator();
        TestAction saveAction = new TestAction("Save");
        JMenuItem saveItem = new JMenuItem(saveAction);
        saveItem.setAccelerator(KeyStroke.getKeyStroke("CTRL S"));
        fileMenu.add(saveItem);

        ButtonGroup groupButton = new ButtonGroup();

        JRadioButtonMenuItem insertItem = new JRadioButtonMenuItem("Insert");
        insertItem.setSelected(true);
        JRadioButtonMenuItem overtypeItem = new JRadioButtonMenuItem("Overtype");

        groupButton.add(insertItem);
        groupButton.add(overtypeItem);

        fileMenu.add(insertItem);
        fileMenu.add(overtypeItem);

        // Demonstrate icons
        Action cutAction = new TestAction("Cut");
        cutAction.putValue(Action.SMALL_ICON, new ImageIcon("cut.gif"));
        Action copyAction = new TestAction("Copy");
        copyAction.putValue(Action.SMALL_ICON, new ImageIcon("copy.gif"));
        Action pasteAction = new TestAction("Paste");
        pasteAction.putValue(Action.SMALL_ICON, new ImageIcon("paste.gif"));

        JMenu editMenu = new JMenu("Edit");
        editMenu.add(cutAction);
        editMenu.add(copyAction);
        editMenu.add(pasteAction);

        // Add button
        JButton button = new JButton("Click Me");
        button.addActionListener(new TestAction("Button Clicked"));
        add(button, BorderLayout.SOUTH);

        // Demonstrate nested menu
        JMenu nestedMenu = new JMenu("Nested");
        nestedMenu.add(new TestAction("Nested Item 1"));
        nestedMenu.add(new TestAction("Nested Item 2"));
        fileMenu.add(nestedMenu);

        // You can add the mnemonic key to action
        fileMenu.setMnemonic(KeyEvent.VK_F);

        // Add all top menu bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setJMenuBar(menuBar);

        // Demonstrate popups
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(new TestAction("Popup Item 1"));
        popupMenu.add(new TestAction("Popup Item 2"));
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
}