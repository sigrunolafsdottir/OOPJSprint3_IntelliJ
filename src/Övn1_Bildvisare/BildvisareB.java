package Övn1_Bildvisare;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

//Togglar mellan två bilder
public class BildvisareB extends JFrame implements ActionListener {
    
    JButton changeImageButton;
    JLabel imageViewer;
    JPanel panel;
    final String imagePath0 = "src\\Övn1_Bildvisare\\images\\bild0.jpg";
    final String imagePath3 = "src\\Övn1_Bildvisare\\images\\bild3.jpg";
    int toggler = 0;
    
    public BildvisareB() {
        changeImageButton = new JButton("Byt bild");
        imageViewer = new JLabel(new ImageIcon(imagePath3));
        imageViewer.setPreferredSize(new Dimension(300, 300));
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.BLACK);
        panel.add(imageViewer);
        panel.add(changeImageButton);
        this.add(panel);
        changeImageButton.addActionListener(this);
        //setSize(800,600);
        pack();
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(toggler == 0){
            imageViewer.setIcon(new ImageIcon(imagePath0));
            toggler = 1;
        }
        else if(toggler == 1){
            imageViewer.setIcon(new ImageIcon(imagePath3));
            toggler = 0;
        }
    }
    
    public static void main(String args[]){
        BildvisareB bildvisare = new BildvisareB();
    }
}
