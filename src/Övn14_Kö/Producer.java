package Övn14_Kö;



public class Producer implements Runnable{
    
    public Thread aktivitet = new Thread(this);
    private QueueElement obj;
    private long interval;
    private SimpleQueue q;
    
    public Producer (String txt, long sec, SimpleQueue k){
        interval = sec * 1000;
        q = k;
        obj = new QueueElement(txt);
    }
    
    public void run(){
        while(!Thread.interrupted()){
            try{
                Thread.sleep(interval);
                q.put(obj);
            }
            catch (InterruptedException e){
                break;
            }
        }
    }
}
