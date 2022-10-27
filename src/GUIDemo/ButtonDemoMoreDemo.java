package GUIDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemoMoreDemo extends JFrame implements ActionListener{

    JLabel label = new JLabel("Hej");
    JButton button = new JButton("Tryck här");
    JButton button2 = new JButton("Eller här");


    ButtonDemoMoreDemo(){
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        button.addActionListener(this);
        button2.addActionListener(this);
        this.add(p);
        p.add(label);
        p.add(button);
        p.add(button2);
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            if (label.getText().equalsIgnoreCase("Hej")){
                label.setText("Hopp");
            }
            else{
                label.setText("Hej");
            }
        }
        else if(e.getSource() == button2){
            label.setForeground(Color.CYAN);
        }

    }
    
    public static void main(String[] args){
        ButtonDemoMoreDemo g = new ButtonDemoMoreDemo();
    }
    
    
    
}
