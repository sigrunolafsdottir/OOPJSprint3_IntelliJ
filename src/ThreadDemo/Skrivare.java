package ThreadDemo;

public class Skrivare extends Thread{
    private String text;
    private long interval;
    
    public Skrivare(String text, long interval){
        this.text = text;
        this.interval = interval * 1000;
    }
    
    @Override
    public void run()  {
        while (!Thread.interrupted()){
            try {
                Thread.sleep(interval);
                System.out.println(text);
            }
            catch (InterruptedException e){
                break;
            }
        }
    }
}
