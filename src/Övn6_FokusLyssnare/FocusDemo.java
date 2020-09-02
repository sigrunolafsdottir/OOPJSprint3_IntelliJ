package Övn6_FokusLyssnare;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FocusDemo extends JFrame {
  JButton    överst = new JButton("Uppe");
  JTextField första = new JTextField("Skriv här");
  JButton    nederst= new JButton("Nere");

  public FocusDemo() {
    setLayout(new BorderLayout());
    add(första, BorderLayout.CENTER);
    add(överst, BorderLayout.NORTH); add(nederst, BorderLayout.SOUTH); 
    addWindowListener(fönsterLyss);
    första.addFocusListener(focusLyss);
    //setSize(200,100);
    setSize(500,500);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  WindowAdapter fönsterLyss = new WindowAdapter() {
    @Override
    public void windowActivated(WindowEvent e) {
      första.requestFocus();    
    }
  };

  FocusListener focusLyss = new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
      if (e.getComponent() == första) 
        första.setBackground(Color.blue);
    }

    @Override
    public void focusLost(FocusEvent e) {
      if (e.getComponent() == första) 
        första.setBackground(Color.white);
    }
  };

  public static void main(String argv[]) {
    new FocusDemo();
  }
}
