package CountButtonDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CountButtonDemo extends JFrame implements ActionListener {

    CountButton cb = new CountButton(0);
    JPanel p = new JPanel();
    
    public CountButtonDemo(){
        cb.addActionListener(this);
        add(p);
        p.add(cb);
        
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        CountButtonDemo b = new CountButtonDemo();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        cb.plusOne();
    }
    
}
