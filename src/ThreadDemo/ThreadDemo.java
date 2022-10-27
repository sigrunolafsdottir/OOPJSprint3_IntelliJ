package ThreadDemo;

public class ThreadDemo {
    
    public static void main(String[] args) 
            throws InterruptedException {
        //En skrivare skriver ut ett ord med ett visst antal sekunders mellanrum
        Skrivare s1 = new Skrivare("Winter", 1);
        Skrivare s2 = new Skrivare("is", 2);
        Skrivare s3 = new Skrivare("coming", 3);
        
        s1.start();
        s2.start();
        s3.start();
        
     //   s1.run();
     //   s2.run();
     //   s3.run();
        
     //   Thread.sleep(10000);
        
        s1.interrupt();
        s2.interrupt();
        s3.interrupt();
    }

}
