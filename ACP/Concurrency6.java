package ACP;

public class Concurrency6 {
      public static void main(String[] args) {
        System.out.println("main started");
        Thread thread3 = new Thread(()->{
            System.out.println(Thread.currentThread());
        }, "Our thread");

        thread3.start();
            try{  
                    thread3.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(thread3.getPriority());
            thread3.setPriority(4);
            System.out.println("main is exiting");
        }
       
    }

// it is giving output in a sequence
// by removing try and catch it is not coming sequentially