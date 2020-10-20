package ClassDemos;

import javax.swing.*;
import java.awt.*;

public class CheckBoxDemo extends JFrame {
    JPanel panel = new JPanel();
    JCheckBox c1 = new JCheckBox("gul", false);
    JCheckBox c2 = new JCheckBox("blå", false);
    JCheckBox c3 = new JCheckBox("röd", false);


    public CheckBoxDemo(){

        this.add(panel);
        panel.add(c1);
        panel.add(c2);
        panel.add(c3);

        c1.addActionListener(ae -> { if (c1.isSelected() && c2.isSelected() && c3.isSelected()) panel.setBackground(new Color(210, 105, 30));
                                    else if (c1.isSelected() && c2.isSelected()) panel.setBackground(Color.GREEN);
                                    else if (c1.isSelected() && c3.isSelected()) panel.setBackground(Color.ORANGE);


                                    System.out.println("gula");});


        c2.addActionListener(ae -> panel.setBackground(Color.BLUE));
        c3.addActionListener(ae -> panel.setBackground(Color.RED));


        this.pack();
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        CheckBoxDemo cd = new CheckBoxDemo();
    }

}
