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
                QueueElement e = (QueueElement)q.take();
                System.out.println("Taking "+e.getText());
            }
            catch (InterruptedException e){
                break;
            }
        }
    }

}
