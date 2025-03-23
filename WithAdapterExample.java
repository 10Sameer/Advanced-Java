import java.awt.*;  
import java.awt.event.*;  

public class WithAdapterExample extends Frame {  
    WithAdapterExample() {  
        addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {  
                System.out.println("Mouse Clicked!");  
            }  
        });  

        setSize(300, 200);  
        setLayout(null);  
        setVisible(true);  
    }  

    public static void main(String[] args) {  
        new WithAdapterExample();  
    }  
}
