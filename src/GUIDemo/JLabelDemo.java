package GUIDemo;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JLabelDemo extends JFrame {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hej");
    
    JLabelDemo(){
        setLayout(new FlowLayout());
        add(panel);
        panel.add(label);
        setSize(300, 300);
        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        JLabelDemo g = new JLabelDemo();
    }
    
}
