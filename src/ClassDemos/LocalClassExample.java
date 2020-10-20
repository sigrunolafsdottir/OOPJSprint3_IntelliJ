package ClassDemos;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;


class LocalClassExample extends JFrame {
    JButton comp = new JButton("knapp");

    LocalClassExample() {
	    class MyListener implements ActionListener{
                @Override
		    public void actionPerformed(ActionEvent e) {
                    comp.setText("tryckt");
                }
	    }

        MyListener l = new MyListener();
        comp.addActionListener(l);

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        this.add(p);
        p.add(comp);
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        LocalClassExample g = new LocalClassExample();
    }

}


