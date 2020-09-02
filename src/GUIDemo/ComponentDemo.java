package GUIDemo;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ComponentDemo extends JFrame implements ActionListener{
    
    JPanel p = new JPanel();
    JButton A = new JButton("A");
    JButton B = new JButton("B");
    JButton C = new JButton("C");
    JButton D = new JButton("D");
    
    ComponentDemo(){
        add(p);
        p.setLayout(new FlowLayout());
        p.add(A); p.add(B); p.add(C);
        A.addActionListener(this);
        B.addActionListener(this);
        C.addActionListener(this);
        D.addActionListener(this);
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
         //Lägger till en extra knapp
        if (e.getSource() == A){
            p.add(D);
            p.revalidate();
            p.repaint(); //funkar även utan
        }
        if (e.getSource() == B){
            //Hämtar B:s förälder
            Container c1 =((Container)e.getSource())
                    .getParent();
            //Tar ut knapp A
            Component c2 = c1.getComponent(0);  
            //Vi vet att detta är en JButton, vi kan 
            //skriva ut texten för att veta att vi hämtat rätt
            System.out.println(((JButton)c2).getText());
        }
        
        if (e.getSource() == C){
            //Tar bort sig själv
           Container c1 =((Container)e.getSource())
                   .getParent();
           c1.remove(2);
           c1.revalidate();
           c1.repaint();
        }
        
        if (e.getSource() == D){
            //Tar bort alla knappar
           Container c1 =((Container)e.getSource())
                   .getParent();
           c1.removeAll();
           c1.revalidate();
           c1.repaint();
        }
    }
    
    public static void main(String[] args){
        ComponentDemo c = new ComponentDemo();
    }


}
