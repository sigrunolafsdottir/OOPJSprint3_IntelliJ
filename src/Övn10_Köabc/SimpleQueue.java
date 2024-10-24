package Övn10_Köabc;

import java.util.*;

//exempel från boken
 public class SimpleQueue {
    private List<String> l = new ArrayList<>();

    public int size() {  // ger antalet element i kön
     return l.size();
   }

    public synchronized void put(String obj) {
       System.out.println("Putting "+ obj);
  
        l.add(obj);
        notify();
   }

   public synchronized String take() { // tar ut första elementet
        while (l.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                return null;
            }
        }
        String e =  l.get(0);
        l.remove(0);
        return e;
   }
   
   public void printQueue(){
       l.forEach(o -> System.out.println(o));
   }
 }

