package ACP;
//using runnable interface
public class Concurrency2 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread()+" "+i);
        }
    }
    public static void main(String[] args) {
        //Thread thread2 = new Thread(new Concurrency2());
        //thread2.start();
        // thread2.start(); //thread already strted error
         new Thread().run(); //will not give error simply check if target is null or not

    }
}
