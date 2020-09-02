package Övn1_Bildvisare;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

//Togglar mellan två bilder
public class BildvisareB extends JFrame implements ActionListener {
    
    JButton changeImageButton;
    JLabel imageViewer;
    final String imagePath0 = "src\\övningsuppgift1\\images\\bild0.jpg";
    final String imagePath3 = "src\\övningsuppgift1\\images\\bild3.jpg";
    int toggler = 0;
    
    public BildvisareB() {
        changeImageButton = new JButton("Byt bild");
        imageViewer = new JLabel(new ImageIcon(imagePath3));
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.BLACK);
        add(imageViewer);
        add(changeImageButton);
        changeImageButton.addActionListener(this);
        setSize(800,600);   
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
