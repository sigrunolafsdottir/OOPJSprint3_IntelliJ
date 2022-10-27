package ClassDemos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


class MouseListenerExample2 extends JFrame implements MouseListener {
    JButton comp = new JButton("knapp");
    JLabel label = new JLabel("hej");

    MouseListenerExample2() {

       // MWListener l2 = new MWListener();
        comp.addMouseListener(this);
        label.addMouseListener(this);
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        this.add(p);
        p.add(comp);
        p.add(label);
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        MouseListenerExample2 g = new MouseListenerExample2();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        comp.setText("klick");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("godis");
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}


