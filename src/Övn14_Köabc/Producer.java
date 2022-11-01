package Övn14_Köabc;

//exempel från boken

public class Producer implements Runnable{
    
    public Thread aktivitet = new Thread(this);
    private String text;
    private long interval;
    private SimpleQueue q;
    
    public Producer (String txt, long sec, SimpleQueue k){
        interval = sec * 1000;
        q = k;
        text = txt;
    }
    
    public void run(){
        while(!Thread.interrupted()){
            try{
                Thread.sleep(interval);
                q.put(text);
            }
            catch (InterruptedException e){
                break;
            }
        }
    }
}
