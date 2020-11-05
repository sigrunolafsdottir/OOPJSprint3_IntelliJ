package Övn14d_Kö;

import java.util.*;

 public class SimpleQueue {
   private List<QueueElement> l = new ArrayList<QueueElement>();

   public int size() {  // ger antalet element i kön
     return l.size();
   }

   public synchronized void put(QueueElement obj) {
       System.out.println("Putting "+ obj.getText());
     int p = Thread.currentThread().getPriority();
     //alternativt sätt att ta fram prioriteten:
     //int p = obj.getPri()
     int i;
     
     //leta baklänges i kön tills rätt prio hittas
       // i kommer att tilldelas värdet på den plats före där vi vill lägga in vårt obj
     for (i=size()-1; i>=0 && p > ((QueueElement) l.get(i)).pri; i--)
       ;     
        l.add(i+1, obj);
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

