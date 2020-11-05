package Övn14d_Kö;

import java.util.Scanner;


public class MainClass {
    
    public static void main(String[] args) throws InterruptedException{
        SimpleQueue buf = new SimpleQueue();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Amount of producers: ");
        Producer[] p = new Producer[sc.nextInt()];
        for (int i = 0; i < p.length; i++){
            System.out.println("Producer no "+ (i+1) + ":");
            System.out.println(" Interval:");
            int time = sc.nextInt();
            System.out.println(" Prio (must be a number between 1 and 10):");
            int pri = sc.nextInt();
            System.out.println("Text? ");
            String txt = sc.next();
            p[i] = new Producer(txt, time,pri, buf);
        }
        
        System.out.println("Amount of comsumers: ");
        Consumer[] c = new Consumer[sc.nextInt()];
        for (int i = 0; i < c.length; i++){
            System.out.println(" Interval:");
            int time = sc.nextInt();
            c[i] = new Consumer(time, buf);
        }
        
        for( int i = 0; i < p.length; i++){
            p[i].aktivitet.start();
        }
        for( int i = 0; i < c.length; i++){
            c[i].aktivitet.start();
        }
        Thread.sleep(15000);
        System.out.println("Antal kvar i kön "+ buf.size());
        buf.printQueue();
        System.exit(0);
    }

}
