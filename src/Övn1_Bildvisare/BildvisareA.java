package Övn1_Bildvisare;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

//Visar en bild
public class BildvisareA extends JFrame {
    
    JButton changeImageButton;
    JLabel imageViewer;
    final String imagePath = "src\\övningsuppgift1\\images\\bild3.jpg";
    
    public BildvisareA() {
        changeImageButton = new JButton("Byt bild");
        imageViewer = new JLabel(new ImageIcon(imagePath));
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.BLACK);
        add(imageViewer);
        add(changeImageButton);
        setSize(800,600);   
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    
    public static void main(String args[]){
        BildvisareA bildvisare = new BildvisareA();
    }
}
