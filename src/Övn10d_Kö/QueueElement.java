package Övn10d_Kö;

public class  QueueElement {
   protected String text;
   protected int pri;

   QueueElement(String o, int pri) {
     text=o; 
     this.pri = pri;
   }
   
   public String getText(){
       return text;
   }
   
   public int getPri(){
       return pri;
   }
   
 }
