package ClassDemos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


class MouseListenerExample extends JFrame {
    JButton comp = new JButton("knapp");

    MouseListenerExample() {

        class MWListener implements MouseListener{

            @Override
            public void mouseClicked(MouseEvent me) {
                    comp.setText("klick");
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
	    }

        MWListener l2 = new MWListener();
        comp.addMouseListener(l2);

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        this.add(p);
        p.add(comp);
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        MouseListenerExample g = new MouseListenerExample();
    }

}


