package ClassDemos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MouseAdapterExample extends JFrame {
    JButton comp = new JButton("knapp");
    JButton b2 = new JButton("en till knapp i testbranchen");
    JLabel label = new JLabel("conflict");
    JButton b3 = new JButton("konflikt i master");


    MouseAdapterExample() {


	    MouseListener ma = new MouseAdapter(){
            public void mouseClicked(MouseEvent me) {
                comp.setText("klick master again");
            }
        };


        //comp.addMouseListener(ma);
        JPanel p = new JPanel();
        p.addMouseListener(ma);
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


