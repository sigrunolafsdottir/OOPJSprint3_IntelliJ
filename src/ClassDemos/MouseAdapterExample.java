package ClassDemos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MouseAdapterExample extends JFrame {
    JButton comp = new JButton("knapp");

	//added comment in GitHub

    MouseAdapterExample() {

	    MouseListener ma = new MouseAdapter(){
            public void mouseClicked(MouseEvent me) {
                comp.setText("klicked");
            }
        };

        //comp.addMouseListener(ma);
        JPanel p = new JPanel();
        comp.addMouseListener(ma);
        p.setLayout(new FlowLayout());
        this.add(p);
        p.add(comp);
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        MouseAdapterExample g = new MouseAdapterExample();
    }

}


