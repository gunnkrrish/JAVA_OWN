
// package ACP;
// public class Concurrency1 extends Thread {
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("inside "+i);
//         }
//     }
//     public static void main(String[] args) {
//         // Thread thread1 = new Concurrency1();
//         Concurrency1 thread1 = new Concurrency1();
//         // thread1.setDaemon(true);    //if user thread complete execution it it not neccessary that daemon flag will run
//         thread1.start();
//         System.out.println("main");
//     }
// }





package ACP;
public class Concurrency1 extends Thread {
    public Concurrency1(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("inside "+Thread.currentThread().getName()+" "+i);
            // output inside Thread[nameofthread,5,main] 0  -> name , priority,parent
        }
    }
    public static void main(String[] args) {
        Thread thread1 = new Concurrency1("nameofthread");
        thread1.start();
        System.out.println("main");
    }
}

