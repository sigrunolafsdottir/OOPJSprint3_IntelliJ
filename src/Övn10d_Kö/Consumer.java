package Övn10d_Kö;


public class Consumer implements Runnable{
    public Thread aktivitet = new Thread(this);
    private long interval;
    private SimpleQueue q;

    int prio = 0;
    
    public Consumer (long sec, SimpleQueue k, int p){
        interval = sec * 1000;
        q = k;
        prio = p;
    }
    
    public void run(){
        aktivitet.setPriority(prio);
        while(!Thread.interrupted()){
            try{
                Thread.sleep(interval);
                QueueElement e = (QueueElement)q.take();
                System.out.println("Consumer w prio "+ prio +" is Taking "+e.getText());
            }
            catch (InterruptedException e){
                break;
            }
        }
    }

}
