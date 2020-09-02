package ClassDemos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class AnonymousExample2 {
    JButton comp = new JButton();
    
    AnonymousExample2() {
        comp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Do stuff
            }
        });
    }
}
