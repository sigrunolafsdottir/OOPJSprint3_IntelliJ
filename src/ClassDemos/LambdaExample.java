package ClassDemos;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;


public class LambdaExample extends JFrame {
    JButton comp = new JButton("knapp");
    
    LambdaExample() {

        comp.addActionListener(l -> { if (true) comp.setText("tryckt");
                                        else comp.setText("hej"); });
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        this.add(p);
        p.add(comp);
        this.pack();
        this.setLocation(1000, 500);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        LambdaExample g = new LambdaExample();
        g.setVisible(true);
    }

}
