package ACP;

public class Concurrency7 {
    public static void main(String[] args) {
        //deadlock **************************IMP
        System.out.println("main is start");
        String lock1 = "gunn";
        String lock2 = "khurana";

        Thread thread1 = new Thread(()->{
            synchronized(lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(lock2){
                    System.out.println("lock acquired");
                }
            }
        });

         Thread thread2 = new Thread(()->{
            synchronized(lock2){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(lock1){
                    System.out.println("lock acquired");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
