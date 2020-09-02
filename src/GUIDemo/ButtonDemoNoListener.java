package GUIDemo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonDemoNoListener extends JFrame {
    
    JLabel label = new JLabel("Hej");
    JButton button = new JButton("Tryck här");
    
    ButtonDemoNoListener(){
        JPanel p = new JPanel();
        this.add(p);
        p.add(label);
        p.add(button);
        button.setOpaque(true);
        button.setBackground(Color.yellow);
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        ButtonDemoNoListener g = new ButtonDemoNoListener();
    }
    
    
    
}
