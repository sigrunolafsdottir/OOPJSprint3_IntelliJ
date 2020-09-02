package Övn3_PengarTillbaka;

 // Filen Vaxel.java
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 class PengarTillbaka extends JFrame implements ActionListener {
   JTextField prisSvar   = new JTextField(5);
   JTextField betaltSvar = new JTextField(5);
   JPanel p1 = new JPanel();       // frågor
   JPanel p2 = new JPanel();       // svarsrutor
   JPanel p3 = new JPanel();       // resultat
   JPanel p4 = new JPanel();       // checkboxar
   
   JLabel resultat1000 = new JLabel(); 
   JLabel resultat500  = new JLabel(); 
   JLabel resultat200  = new JLabel();
   JLabel resultat100 = new JLabel(); 
   JLabel resultat50  = new JLabel(); 
   JLabel resultat20  = new JLabel();
   JLabel resultat10  = new JLabel();
   JLabel resultat5   = new JLabel();
   JLabel resultat2   = new JLabel();
   JLabel resultat1   = new JLabel();
   
   JCheckBox ch1000 = new JCheckBox("1000", true); 
   JCheckBox ch500  = new JCheckBox("500", true); 
   JCheckBox ch200  = new JCheckBox("200", true);
   JCheckBox ch100 = new JCheckBox("100", true); 
   JCheckBox ch50  = new JCheckBox("50", true); 
   JCheckBox ch20  = new JCheckBox("20", true);
   JCheckBox ch10  = new JCheckBox("10", true);
   JCheckBox ch5   = new JCheckBox("5", true);
   JCheckBox ch2   = new JCheckBox("2", true);
   JCheckBox ch1   = new JCheckBox("1", true);

   // Konstruktor
   PengarTillbaka() {
     // placera ut komponenterna
     p1.setLayout(new GridLayout(2,1)); 
     p1.add(new JLabel("Pris? ", Label.RIGHT));
     p1.add(new JLabel("Betalt? ", Label.RIGHT));
     p2.setLayout(new GridLayout(2,1));
     p2.add(prisSvar);
     p2.add(betaltSvar);
     p3.setLayout(new GridLayout(7,1));
     p3.add(new JLabel("Växel tillbaka: ")); 
     p3.add(resultat1000);
     p3.add(resultat500);
     p3.add(resultat200);
     p3.add(resultat100);
     p3.add(resultat50);
     p3.add(resultat20);
     p3.add(resultat10);
     p3.add(resultat5);
     p3.add(resultat2);
     p3.add(resultat1);
     
     p4.setLayout(new GridLayout(7,1));
     p4.add(ch1000);
     p4.add(ch500);
     p4.add(ch200);
     p4.add(ch100);
     p4.add(ch50);
     p4.add(ch20);
     p4.add(ch10);
     p4.add(ch5);
     p4.add(ch2);
    // p4.add(ch1);

     // placera ut hela fönstrets komponenter
     setLayout(new BorderLayout());
     add("North",   p4);   // checkboxar
     add("West",   p1);   // frågor
     add("Center", p2);   // svar
     add("South", p3);    // resultat

     // ange vilken lyssnare som skall användas  
     prisSvar.addActionListener(this);
     betaltSvar.addActionListener(this);

     pack(); // beräkna fönstrets storlek
     setVisible(true);  // visa fönstret
     setDefaultCloseOperation(EXIT_ON_CLOSE); 
   }

   public static void main (String[] arg) {
     PengarTillbaka v = new PengarTillbaka();
   }

   // lyssnare
   public void actionPerformed(ActionEvent e) { 
     if (e.getSource()==prisSvar|| e.getSource()==betaltSvar) {
       // avläs svarsrutorna
       int pris   = Integer.parseInt(prisSvar.getText());
       int betalt = Integer.parseInt(betaltSvar.getText());
       int tillbaka = betalt - pris;
       if (ch1000.isSelected()){
        resultat1000.setText(tillbaka/1000 + " tusenlappar");
        tillbaka = tillbaka % 1000;
       }
       if (ch500.isSelected()){
        resultat500.setText(tillbaka/500 + " femhundralappar");
        tillbaka = tillbaka % 500;  
       }
       if (ch200.isSelected()){
        resultat200.setText(tillbaka/200 + " tvåhundralappar");
        tillbaka = tillbaka % 200;
       }
       if (ch100.isSelected()){
        resultat100.setText(tillbaka/100 + " hundralappar");
        tillbaka = tillbaka % 100;
       }
       if (ch50.isSelected()){
        resultat50.setText(tillbaka/50 + " femtiolappar");
        tillbaka = tillbaka % 50;
       }
       if (ch20.isSelected()){
        resultat20.setText(tillbaka/20 + " tjugor");
        tillbaka = tillbaka % 20;
       }
       if (ch10.isSelected()){
        resultat10.setText(tillbaka/10 + " tior");
        tillbaka = tillbaka % 10;
       }
       if (ch5.isSelected()){
        resultat5.setText(tillbaka/5 + " femmor");
        tillbaka = tillbaka % 5;
       }
       if (ch2.isSelected()){
       resultat2.setText(tillbaka/2 + " tvåkronor");
       tillbaka = tillbaka % 2;
       }
       resultat1.setText(tillbaka + " enkronor");
    }
  }
} 

