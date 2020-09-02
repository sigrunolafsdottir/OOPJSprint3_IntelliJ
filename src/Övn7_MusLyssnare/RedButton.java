package Övn7_MusLyssnare;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//På Mac måste även opaciteten för knappen justeras 
//för att detta ska funka

public class RedButton extends JFrame {
  JButton  b = new JButton("Röd");
 
  public RedButton() {
    setLayout(new FlowLayout());
    add(b);
    b.addMouseListener(musLyss);
    setSize(200,100);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  MouseAdapter musLyss = new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
      if (e.getComponent() == b) 
        b.setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
      if (e.getComponent() == b) 
        b.setBackground(Color.lightGray);
    }
  };

  public static void main(String argv[]) {
    new RedButton();
  }
}

