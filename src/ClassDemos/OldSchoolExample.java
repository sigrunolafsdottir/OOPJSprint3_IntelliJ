package ClassDemos;


import GUIDemo.ButtonDemo;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;


class OldSchoolExample extends JFrame implements ActionListener {
    JButton comp = new JButton("knapp");
    
    OldSchoolExample() {
        comp.addActionListener(this);
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        this.add(p);
        p.add(comp);
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){ 
        comp.setText("tryckt");
    }
    
    public static void main(String[] args){
        OldSchoolExample g = new OldSchoolExample();
    }
    
}