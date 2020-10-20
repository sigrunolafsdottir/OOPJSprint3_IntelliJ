package ClassDemos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;


class InnerClassExample extends JFrame {
    JButton comp = new JButton("knapp");

    class MyListener implements ActionListener{
        @Override
	    public void actionPerformed(ActionEvent e) {
            comp.setText("tryckt");
        }
    }
    
    InnerClassExample() {
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
        InnerClassExample g = new InnerClassExample();
    }
}
//Trots att MyListener är en inre klass går det att komma åt den utifrån, via InnerClassExample
class anotherClass{
    InnerClassExample i = new InnerClassExample();
    InnerClassExample.MyListener innerObject = i.new MyListener();
    InnerClassExample.MyListener innerObject2 = new InnerClassExample().new MyListener();
}
