package ClassDemos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;


public class LambdaExample extends JFrame {
    JButton comp = new JButton("knapp1");
    JButton comp2 = new JButton("knapp2");

    LambdaExample() {

        comp.addActionListener(l -> comp.setText("hej"));

        comp2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (true) comp.setText("tryckt");
                else comp2.setText("hej"); }

        });
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        this.add(p);
        p.add(comp);
        p.add(comp2);
        this.pack();
        this.setLocation(1000, 500);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        LambdaExample g = new LambdaExample();
        g.setVisible(true);
    }

}
