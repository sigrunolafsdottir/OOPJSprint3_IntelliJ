package ThreadDemoInterface;

public class ThreadDemoLambda {


    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = new Runnable(){
            @Override
            public void run(){
                while (!Thread.interrupted()){
                    try {
                        Thread.sleep(1000);
                        System.out.println("hejkon");
                    }
                    catch (InterruptedException e){
                        break;
                    }
                }
            }
        };

        Runnable r2 = () -> {
                while (!Thread.interrupted()){
                    try {
                        Thread.sleep(2000);
                        System.out.println("bejkon");
                    }
                    catch (InterruptedException e){
                        break;
                    }
                }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        Thread.sleep(10000);

        t1.interrupt();
        t2.interrupt();
    }
}
