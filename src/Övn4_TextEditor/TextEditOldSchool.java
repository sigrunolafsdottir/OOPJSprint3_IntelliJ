package Övn4_TextEditor;

import java.awt.*; 
 import java.awt.event.*; 
 import java.io.*; 
 import javax.swing.*; 


 public class TextEditOldSchool extends JFrame 
         implements ActionListener { 
   private JPanel p = new JPanel(); 
   private JTextField namn  = new JTextField(); 
   private JButton    öppna = new JButton("Öppna"); 
   private JButton    spara = new JButton("Spara");
   private JButton    skriv = new JButton("Skriv ut");
   private JButton    sluta = new JButton("Avsluta");
   private JTextArea  area  = new JTextArea(10,60); 
   private JScrollPane sp   = new JScrollPane(area,
                       JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                       JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

   public TextEditOldSchool() { 
     area.setFont(new Font("Monospaced", Font.PLAIN, 12)); 
     p.setLayout(new GridLayout(1,6)); 
     p.add(new JLabel("Filnamn: ", JLabel.RIGHT));  
     p.add(namn); p.add(öppna); p.add(spara); 
     p.add(skriv); p.add(sluta); 
     namn.addActionListener(this);   
     öppna.addActionListener(this);  
     spara.addActionListener(this); 
     skriv.addActionListener(this);
     sluta.addActionListener(this);
     // placera ut panelen och textarean 
     add(p,  BorderLayout.NORTH); 
     add(sp, BorderLayout.CENTER); 
     pack(); 
     setVisible(true); 
     setDefaultCloseOperation(EXIT_ON_CLOSE);  
   } 

   public void actionPerformed(ActionEvent e) { 
     // undersök vilken knapp användaren har tryckt på 
     if (e.getSource() == namn || e.getSource() == öppna)    
       läsInFil(namn.getText());    
     else if (e.getSource() == spara)  
       sparaFil(namn.getText());
      else if (e.getSource() == skriv) 
       try {
           area.print();  // skriver ut texten, kan ge exception
       }
       catch (Exception ex) {
           ex.printStackTrace();
       }
     else if (e.getSource() == sluta) 
       System.exit(0);      
    } 

   private void läsInFil(String filnamn) { 
     try (FileReader r = new FileReader(filnamn)) { 
        area.read(r, null); 
     } 
     catch (IOException e) {
         e.printStackTrace();
     } 
   } 

   private void sparaFil(String filnamn) { 
     try (FileWriter w = new FileWriter(filnamn)) { 
       area.write(w); 
     }
     catch (IOException e) {
            e.printStackTrace();
       }
   } 

   public static void main (String[] arg) { 
     TextEditOldSchool t = new TextEditOldSchool(); 
   }   
 }
