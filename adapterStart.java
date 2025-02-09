import java.awt.*;
import java.awt.event.*;

class Terminator extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.out.println("Window is closing");
        System.exit(0);
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window is iconifies");
        System.exit(0);
    }
}

public class adapterStart {
    public static void main(String[] args) {
        Frame frame = new Frame("Window Adapter");
        frame.setSize(400, 300);
        frame.addWindowListener(new Terminator()); 
        frame.setVisible(true);
    }
}


