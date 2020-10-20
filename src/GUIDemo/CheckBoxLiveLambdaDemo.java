package GUIDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxLiveLambdaDemo extends JFrame  {

    JPanel jp = new JPanel();
    JCheckBox red;
    JCheckBox blue;
    JCheckBox yellow;

    public CheckBoxLiveLambdaDemo(){
        red = new JCheckBox("red", false);
        blue = new JCheckBox("blue", false);
        yellow = new JCheckBox("yellow", false);

        add(jp);
        jp.add(red);
        jp.add(blue);
        jp.add(yellow);

        red.addActionListener(ae -> fixColor());
        blue.addActionListener(ae -> fixColor());
        yellow.addActionListener(ae -> fixColor());

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main (String[] args){
        new CheckBoxLiveLambdaDemo();
    }


    public void fixColor() {
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
