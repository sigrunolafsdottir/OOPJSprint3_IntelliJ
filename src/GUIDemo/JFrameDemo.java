package GUIDemo;

import javax.swing.*;
import java.awt.*;


public class JFrameDemo extends JFrame{

    JPanel panel = new JPanel();
    JButton button = new JButton("Knapp");
    JLabel label = new JLabel("label");
    
    JFrameDemo() {
        //JFrame jf = new JFrame();
        //jf.setTitle("En titel");
        setSize(500, 200);
        panel.setBackground(Color.BLUE);
        add(panel);
        panel.add(button);
        panel.add(label);

         //jf.setLocation(100, 50);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        JFrameDemo g = new JFrameDemo();
    }
    
}
