package GUIDemo;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class JFrameDemo  extends JFrame{

    
    JFrameDemo() {
        //super();
       // JFrame jf = new JFrame();
        //jf.setTitle("En titel");
        setSize(500, 200);

         //jf.setLocation(100, 50);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        JFrameDemo g = new JFrameDemo();
    }
    
}
