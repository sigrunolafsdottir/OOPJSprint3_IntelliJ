package GUIDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swapper1 extends JFrame implements ActionListener {

    //Byter faktiskt knapparna

    JPanel panel = new JPanel();
    JButton button1 = new JButton ("1");
    JButton button2 = new JButton ("2");
    JButton swapper = new JButton("swap");

    public Swapper1(){

        swapper.addActionListener(this);
        add(panel);
        panel.add(button1);
        panel.add(button2);
        panel.add(swapper);

        pack();

        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args){
        Swapper1 g = new Swapper1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (panel.getComponent(0) == button1 ){
            panel.removeAll();
            panel.add(button2, 0);
            panel.add(button1, 1);
            panel.add(swapper, 2);
            panel.revalidate();
        }
        else if (panel.getComponent(0) == button2 ){
            panel.removeAll();
            panel.add(button1, 0);
            panel.add(button2, 1);
            panel.add(swapper, 2);
            panel.revalidate();
        }
    }
}
