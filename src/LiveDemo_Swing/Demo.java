package LiveDemo_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Demo extends JFrame implements ActionListener {

    JPanel jp = new JPanel();
    JLabel l = new JLabel("Välkomna till mitt program");
    JButton b = new JButton("Tryck här");
    JButton b1 = new JButton("Knapp 1");
    JButton b2 = new JButton("Knapp 2");

    JPanel np = new JPanel();


    public Demo(){

        jp.setLayout(new BorderLayout());
        b1.addActionListener(this);
        b2.addActionListener(this);

        add(jp);
        jp.add(l);
        jp.add(np, BorderLayout.NORTH);
        np.add(b);
        np.add(b1);
        np.add(b2);

        //setSize(500, 500);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            l.setText("Button 1");
        }
        else if(e.getSource() == b2){
            l.setText("Button 2");
        }
    }
}
