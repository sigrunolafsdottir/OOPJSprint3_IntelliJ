package GUIDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonDemo extends JFrame implements ActionListener{
    
    JLabel label = new JLabel("Hej");
    JButton button = new JButton("Tryck här");
    
    ButtonDemo(){
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        button.addActionListener(this);
        this.add(p);
        p.add(label);
        p.add(button);
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if (label.getText().equalsIgnoreCase("Hej")){
            label.setText("Hopp");
        }
        else{
            label.setText("Hej");
        }
    }
    
    public static void main(String[] args){
        ButtonDemo g = new ButtonDemo();
    }
    
    
    
}
