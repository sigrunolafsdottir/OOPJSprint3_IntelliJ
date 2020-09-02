package GUIDemo;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class TextAreaDemo extends JFrame implements ActionListener  {
    
   private final JPanel p = new JPanel();
   private final JPanel buttonPanel = new JPanel();
   private final JTextArea area  = new JTextArea(10,60); 
   private final JButton doubleButton = new JButton("Double");
   private final JButton clearButton = new JButton("Clear");
   
   public TextAreaDemo() { 
     area.setFont(new Font("Monospaced", Font.PLAIN, 12)); 
     p.setLayout(new BorderLayout());
     p.add(area, BorderLayout.CENTER); 
     buttonPanel.add(doubleButton); 
     buttonPanel.add(clearButton); 
     p.add(buttonPanel, BorderLayout.SOUTH);
     doubleButton.addActionListener(this);
     clearButton.addActionListener(this);
     area.setLineWrap(true);
     add(p); 
     pack(); 
     setVisible(true); 
     setDefaultCloseOperation(EXIT_ON_CLOSE);  
   } 
    
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == clearButton){
            area.setText("");
        }
        else if(e.getSource() == doubleButton){
            String newText = area.getText() + area.getText();
            area.setText(newText);
        }
    } 
    
    public static void main (String[] arg) { 
     TextAreaDemo t = new TextAreaDemo(); 
   } 
}
