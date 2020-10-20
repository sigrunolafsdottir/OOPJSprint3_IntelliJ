package GUIDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxLiveDemo extends JFrame implements ActionListener {

    JPanel jp = new JPanel();
    JCheckBox red;
    JCheckBox blue;
    JCheckBox yellow;

    public CheckBoxLiveDemo(){
        red = new JCheckBox("red", false);
        blue = new JCheckBox("blue", false);
        yellow = new JCheckBox("yellow", false);

        add(jp);
        jp.add(red);
        jp.add(blue);
        jp.add(yellow);

        red.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }



    public static void main (String[] args){
        new CheckBoxLiveDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (red.isSelected() && blue.isSelected() && yellow.isSelected()){
            jp.setBackground(Color.BLACK);
        }
        else if (red.isSelected() && blue.isSelected() && !yellow.isSelected()){
            jp.setBackground(Color.MAGENTA);
        }
        else if (!red.isSelected() && blue.isSelected() && yellow.isSelected()){
            jp.setBackground(Color.GREEN);
        }
        else if (red.isSelected() && !blue.isSelected() && yellow.isSelected()){
            jp.setBackground(Color.ORANGE);
        }
        else if (red.isSelected() && !blue.isSelected() && !yellow.isSelected()){
            jp.setBackground(Color.RED);
        }
        else if (!red.isSelected() && blue.isSelected() && !yellow.isSelected()){
            jp.setBackground(Color.BLUE);
        }
        else if (!red.isSelected() && !blue.isSelected() && yellow.isSelected()){
            jp.setBackground(Color.YELLOW);
        }
        else jp.setBackground(Color.WHITE);

    }
}
