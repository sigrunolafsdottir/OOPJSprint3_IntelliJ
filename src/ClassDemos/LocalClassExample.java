package ClassDemos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
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
        class MWListener implements MouseListener{

            @Override
            public void mouseClicked(MouseEvent me) {
                    comp.setText("klick");
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
	}
        MyListener l = new MyListener();
        MWListener l2 = new MWListener();
        comp.addActionListener(l);
        comp.addMouseListener(l2);
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


