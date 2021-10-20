package GUIDemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swapper2 extends JFrame implements ActionListener {

    //Byter text på knapparna

    JPanel panel = new JPanel();
    JButton button1 = new JButton ("1");
    JButton button2 = new JButton ("2");
    JButton swapper = new JButton("swap");

    public Swapper2(){

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
        Swapper2 g = new Swapper2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (((JButton)panel.getComponent(0)).getText().equals("1") ){
            ((JButton)panel.getComponent(0)).setText("2");
            ((JButton)panel.getComponent(1)).setText("1");
        }
        else if (((JButton)panel.getComponent(0)).getText().equals("2")  ){
            ((JButton)panel.getComponent(0)).setText("1");
            ((JButton)panel.getComponent(1)).setText("2");
        }
    }
}
