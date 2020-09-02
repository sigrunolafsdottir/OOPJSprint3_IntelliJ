package Övn14_Kö;

import java.util.*;

 public class SimpleQueue {
   private List<QueueElement> l = new Vector<QueueElement>(); 

   public int size() {  // ger antalet element i kön
     return l.size();
   }

   public synchronized void put(QueueElement obj) {
       System.out.println("Putting "+ obj.getText());
  
        l.add(obj);
        notify();
     
   }

   public synchronized QueueElement take() { // tar ut första elementet
     while (l.isEmpty())
       try {
         wait();
       }
       catch (InterruptedException e) { 
         return null;
       }
     QueueElement e = (QueueElement) l.get(0);
     l.remove(0);
     return e;
   }
   
   public void printQueue(){
       l.forEach(o -> System.out.println(o.getText()));
   }
 }

