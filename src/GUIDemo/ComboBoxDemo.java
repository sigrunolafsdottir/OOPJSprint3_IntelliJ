package GUIDemo;

import java.awt.*; 
import java.awt.event.*; 

import javax.swing.*; 
import static javax.swing.JFrame.EXIT_ON_CLOSE;

 public class ComboBoxDemo extends JFrame implements ActionListener { 
   
   private JPanel p = new JPanel(); 
   private JComboBox colorchooser; 
   private JLabel l = new JLabel(" "); 
   private final String colors[] = { "röd", "blå", "gul" };

   public ComboBoxDemo() { 
     colorchooser = new JComboBox(colors);
     colorchooser.setSelectedIndex(-1);
     p.setLayout(new GridLayout(2,1)); 
     p.add(colorchooser);
     p.add(l);
     colorchooser.setEditable(true);
     colorchooser.addActionListener(this);   
     add(p,  BorderLayout.NORTH); 
     pack(); 
     setVisible(true); 
     setDefaultCloseOperation(EXIT_ON_CLOSE);  
   } 

   
   public void actionPerformed(ActionEvent e) { 
     if (((String)colorchooser.getSelectedItem()).equalsIgnoreCase("röd")){
         p.setBackground(Color.red);
         l.setText("Du valde rött");
     }
     else if (((String)colorchooser.getSelectedItem()).equalsIgnoreCase("blå")){
         p.setBackground(Color.blue);
         l.setText("Du valde blått");
     }
     else if (((String)colorchooser.getSelectedItem()).equalsIgnoreCase("gul")){
         p.setBackground(Color.yellow);
         l.setText("Du valde gult");
     }
    } 

 
   public static void main (String[] arg) { 
     ComboBoxDemo t = new ComboBoxDemo(); 
   }   
 }

