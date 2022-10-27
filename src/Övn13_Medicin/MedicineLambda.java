package Övn13_Medicin;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class MedicineLambda {
    

  public static void main(String[] arg) 
          throws InterruptedException {
    Scanner sc;
    double ggr = 0.0;
    boolean go = true;
    while (go) { 
      String medicin = JOptionPane.showInputDialog(null, 
              "Viken medicin?");
      //tar hand om Cancel-tryck
      if (medicin == null || medicin.length() == 0){  
          System.exit(0); 
      }
      String ggrString = JOptionPane.showInputDialog(null, 
              "Hur många gånger per minut?");
      //tar hand om Cancel-tryck
      if (ggrString == null || ggrString.length() == 0){  
          System.exit(0); 
      }
      sc = new Scanner(ggrString);
      if (sc.hasNextDouble()){
          ggr = sc.nextDouble();
      }
      else {
          break;
      }

      Double finalGgr = ggr;
      Runnable runnable = () -> {
        while (!Thread.interrupted()) {
          try {
            Thread.sleep(Math.round((60/ finalGgr) * 1000));
            System.out.println("Dags att ta " + medicin);
          } catch (InterruptedException e) {
            break;
          }
        }
      };

      Thread t = new Thread(runnable);
      t.start();
    }
    System.exit(0);    
  }
}


