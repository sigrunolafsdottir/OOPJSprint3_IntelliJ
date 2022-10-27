package LiveDemo_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DemoPP extends JFrame  {

    JPanel jp = new JPanel();
    JLabel l = new JLabel("Välkomna till mitt program");
    JButton b = new JButton("Tryck här");
    JButton b2 = new JButton("Tryck här2");
    JPanel sp = new JPanel();

    public DemoPP(){

        class MyInnerActionListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("Button pressed");
            }
        }

        ActionListener al = new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                l.setText("Button pressed in anonym class");
            }
        };

        jp.setLayout(new BorderLayout());
        sp.setLayout(new GridLayout(1,3));
        add(jp);
        jp.add(sp, BorderLayout.SOUTH);
        jp.add(l, BorderLayout.NORTH);

        sp.add(b);
        sp.add(b2);

        //MyInnerActionListener mal = new MyInnerActionListener() ;
        //b.addActionListener(al);
        b.addActionListener(e -> {l.setText("Button pressed in lambda");});

        b2.addActionListener(e -> {l.setText("Button2 pressed ");});



        //setSize(500, 500);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        DemoPP d = new DemoPP();
    }



}
