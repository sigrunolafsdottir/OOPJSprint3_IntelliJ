package ClassDemos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


class AnonymousExample extends JFrame  {
    JButton comp = new JButton("knapp");
    JButton comp2 = new JButton("knapp2");
    
    AnonymousExample() {

        ActionListener button1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               comp.setText("tryckt 1");
            }
        };
/*
        ActionListener button2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                comp2.setText("tryckt 2");
            }
        };
        
        WindowListener  w = new WindowAdapter(){
            @Override
            public void windowClosed(WindowEvent we) {
                //spara ner till fil
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };*/
        
        comp.addActionListener(button1);
        comp2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                comp2.setText("tryckt 2");
            }
        });
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        this.add(p);
        p.add(comp);
        p.add(comp2);
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        AnonymousExample g = new AnonymousExample();
    }
}