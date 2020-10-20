package LiveDemo2020;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LiveDemo implements ActionListener {

    JPanel panel = new JPanel();
    JPanel northpanel = new JPanel();
    JPanel southpanel = new JPanel();
    JPanel westpanel = new JPanel();
    JButton button1 = new JButton("Press me 1");
    JButton button2 = new JButton("Press me 2 aaaaaaaaaaaa");
    JButton button3 = new JButton("Press me 3");
    JButton button4 = new JButton("Press me 4");
    JButton button6 = new JButton("Press me 5");
    JButton button5 = new JButton("Press me 5");
    JLabel label1 = new JLabel("Jag är en text");
    JLabel label2 = new JLabel("Jag är också en text");
    JLabel label3 = new JLabel("Jag är också en text");
    JTextField text = new JTextField(50);

    LiveDemo(){
        //alternativt kan man låta denna klass extenda JFrameDemo
        //Då behövs inget JFrame-objekt och istf. "jf." används "this."

        JFrame jf = new JFrame();
        jf.add(panel);
        panel.setLayout(new BorderLayout());
        westpanel.setLayout(new GridLayout(3,1));
        panel.add(northpanel, BorderLayout.NORTH);
        panel.add(southpanel, BorderLayout.SOUTH);
        panel.add(westpanel, BorderLayout.WEST);
        northpanel.add(button1);
        northpanel.add(button2);
        northpanel.add(button3);
        northpanel.add(button4);

        southpanel.add(button5);
        southpanel.add(button6);
        southpanel.add(text);

        westpanel.add(label1);
        westpanel.add(label2);
        westpanel.add(label3);

        button1.addActionListener(this);
        button2.addActionListener(this);
        text.addActionListener(this);

        jf.setTitle("En titel");
       // jf.setSize(500, 200);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        LiveDemo g = new LiveDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            label1.setText("Button 1 pressed");
            text.setText("Button 1 pressed");
        }
        else if (e.getSource() == button2){
            label1.setText("Button 2 pressed");
            System.out.println(text.getText());
        }
        else if (e.getSource() == text){
            System.out.println("actionevent from JTextField");
        }
    }
}
