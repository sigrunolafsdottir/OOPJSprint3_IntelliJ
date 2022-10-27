package LiveDemo_Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {

    JLabel l;

    public MyActionListener(DemoPP d){
        this.l=d.l;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        l.setText("Button pressed");
    }
}
