package Övn14_Kö;

public class Consumer implements Runnable{
    public Thread aktivitet = new Thread(this);
    private long interval;
    private SimpleQueue q;
    
    public Consumer (long sec, SimpleQueue k){
        interval = sec * 1000;
        q = k;
    }
    
    public void run(){
        while(!Thread.interrupted()){
            try{
                Thread.sleep(interval);
                String e = q.take();
                System.out.println("Taking "+e);
            }
            catch (InterruptedException e){
                break;
            }
        }
    }

}
