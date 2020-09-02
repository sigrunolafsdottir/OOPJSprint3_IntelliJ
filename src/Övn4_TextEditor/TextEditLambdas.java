package Övn4_TextEditor;

import java.awt.*; 
import java.io.*; 
import javax.swing.*; 


 public class TextEditLambdas extends JFrame { 
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

   public TextEditLambdas() { 
     area.setFont(new Font("Monospaced", Font.PLAIN, 12)); 
     p.setLayout(new GridLayout(1,6)); 
     p.add(new JLabel("Filnamn: ", JLabel.RIGHT));  
     p.add(namn); 
     p.add(öppna); 
     p.add(spara); 
     p.add(skriv); 
     p.add(sluta); 
     
     namn.addActionListener(l -> {läsInFil(namn.getText());});  
     öppna.addActionListener(l -> {läsInFil(namn.getText());});  
     spara.addActionListener(l -> {sparaFil(namn.getText());}); 
     skriv.addActionListener(l -> {try {area.print();}
                                   catch (Exception ex) 
                                   {ex.printStackTrace();}
                                  });
     sluta.addActionListener(l -> {System.exit(0);});
     
     // placera ut panelen och textarean 
     add(p,  BorderLayout.NORTH); 
     add(sp, BorderLayout.CENTER); 
     pack(); 
     setVisible(true); 
     setDefaultCloseOperation(EXIT_ON_CLOSE);  
   } 


   private void läsInFil(String filnamn) { 
     try (FileReader r = new FileReader(filnamn); ){ 
        area.read(r, null); 
     } 
     catch (IOException e) {
         e.printStackTrace();
     } 
   } 

   private void sparaFil(String filnamn) { 
     try (FileWriter w = new FileWriter(filnamn);){ 
       area.write(w); 
     }
     catch (IOException e) {
         e.printStackTrace();
     }
   } 

   public static void main (String[] arg) { 
     TextEditLambdas t = new TextEditLambdas(); 
   }   
 }
