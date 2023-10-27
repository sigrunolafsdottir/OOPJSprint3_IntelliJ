package Övn4_TextEditor;

import java.awt.*; 
import java.awt.event.*; 
import java.io.*; 
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.*; 

 public class TextEditComboBox extends JFrame implements ActionListener { 
   private final String fileNameCachePath = "src\\Övn4_TextEditor\\fileNameCache.txt";
   private JPanel p = new JPanel(); 
   Vector<String> fileCache = new Vector<>();

   String[] fileCacheArr = new String[5];
   private JComboBox<String> namn; 
   private JButton    öppna = new JButton("Öppna"); 
   private JButton    spara = new JButton("Spara");
   private JButton    skriv = new JButton("Skriv ut");
   private JButton    sluta = new JButton("Avsluta");
   private JTextArea  area  = new JTextArea(10,40);
   private JScrollPane sp   = new JScrollPane(area,
                       JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                       JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

   public TextEditComboBox() {
     laddaFilnamn();
      namn = new JComboBox(fileCacheArr);
     namn.setSelectedIndex(-1);
     area.setFont(new Font("Monospaced", Font.PLAIN, 12));
     p.setLayout(new GridLayout(1,6));
     p.add(new JLabel("Filnamn: ", JLabel.RIGHT));
     p.add(namn); p.add(öppna); p.add(spara);
     p.add(skriv); p.add(sluta);
     namn.setEditable(true);
     namn.addActionListener(this);
     öppna.addActionListener(this);
     spara.addActionListener(this);
     skriv.addActionListener(this);
     sluta.addActionListener(this);
     add(p,  BorderLayout.NORTH);
     add(sp, BorderLayout.CENTER);
     pack();
     setVisible(true);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   
   public void actionPerformed(ActionEvent e) { 
     if (e.getSource() == namn || e.getSource() == öppna)      {  
       läsInFil((String)namn.getSelectedItem());  
       if(fileCache.indexOf((String)namn.getSelectedItem()) == -1){
        namn.addItem((String)namn.getSelectedItem());
       }
     }
     else if (e.getSource() == spara)  
       sparaFil((String)namn.getSelectedItem());
      else if (e.getSource() == skriv) 
       try {
           area.print();  // skriver ut texten, kan ge exception
       }
       catch (Exception ex) {
           ex.printStackTrace();
       }
     else if (e.getSource() == sluta) {
         sparaNerFilnamn();
         System.exit(0);      
     }
    } 

   private void läsInFil(String filnamn) { 
     try (FileReader r = new FileReader(filnamn); ){ 
        area.read(r, null); 
     } 
     catch (IOException e) {} 
   } 
   
   private void laddaFilnamn() { 
     try (FileReader r = new FileReader(fileNameCachePath); 
        Scanner sc = new Scanner(r);){
         int i = 0;
         while(sc.hasNextLine() && i < 5){
            //fileCache.add(sc.nextLine().trim());
            fileCacheArr[i] = sc.nextLine().trim();
            i++;
        }
     } 
     catch (IOException e) {
        e.printStackTrace();
     } 
   } 

   private void sparaFil(String filnamn) { 
     try (FileWriter w = new FileWriter(filnamn); ){ 
       
       area.write(w); 
     }
     catch (IOException e) {
        e.printStackTrace();
     }
   } 
   
   private void sparaNerFilnamn() { 
        try (PrintWriter w = new PrintWriter(Files.newBufferedWriter(Paths.get(fileNameCachePath)));) {
               for (int i=0; i < 5 && i<namn.getItemCount(); i++){
                   w.println((String) namn.getItemAt(i));
               }    
        }
        catch (IOException e) {
            e.printStackTrace();
        } 

   } 

   public static void main (String[] arg) { 
     TextEditComboBox t = new TextEditComboBox(); 
   }   
 }

