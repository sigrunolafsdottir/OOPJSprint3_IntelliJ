package ThreadDemo;


class SampleThread extends Thread {
    public int processingCount = 0;
 
    SampleThread(int processingCount) {
        this.processingCount = processingCount;
        System.out.println("Thread Created");
    }
 
    @Override
    public void run() {
        System.out.println("Thread " 
                + this.getName() 
                + " started");
        while (processingCount > 0) {
            try {
                Thread.sleep(1000);
                System.out.println("Thread " + this.getName() 
                        + " processcount " + processingCount); 
            } catch (InterruptedException e) {
                System.out.println("Thread " + this.getName() 
                        + " interrupted");
            }
            processingCount--;
        }
        System.out.println("Thread " 
                + this.getName() 
                + " exiting");
    }
}
 
class Runner{
public static void  main(String[] args) 
        throws InterruptedException {
      Thread t2 = new SampleThread(3);
      t2.start();
      System.out.println("Invoking join, waiting.........");
      t2.join(10);
      System.out.println("Returned from join, yay!");
      System.out.println("is t2 alive " + t2.isAlive());
  }
}