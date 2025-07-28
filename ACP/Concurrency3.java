package ACP;
public class Concurrency3 {
    int[] array ;
    int stacktop;
    Object lock;
    public Concurrency3(int capacity){
        array = new int[capacity];
        stacktop = -1;
        lock = new Object();
    }
    public boolean push(int el){
      synchronized(lock){
        // no primitives allowed in synchronized , wrapper class is allowed
          if(isfull()) return false;
        stacktop++;
        try{Thread.sleep(1000);} catch(Exception e){}
        array[stacktop] = el;
        return true;
      }
    }
    public synchronized int pop(){
      // by writing synchronized in the method then who will acquire the lock 
      // bts synchronized(this) {}  is working means current instance of the class has this lock
    //   but if static in declartion the Concurrency3.class  is bts
            if(isEmpty()) return Integer.MIN_VALUE;
       int obj = array[stacktop];
       array[stacktop] = Integer.MIN_VALUE;
        try{Thread.sleep(1000);} catch(Exception e){}
        stacktop--;
        return obj;
        
    }
    public boolean isEmpty(){
        return stacktop < 0;
    }
    public boolean isfull(){
        return stacktop>= array.length-1; 
    }

    public static void main(String[] args) {
        System.out.println("main is starting");

        Concurrency3 stack = new Concurrency3(5);

        new Thread(()->{
            int counter =0;
            while(++counter<10){
                System.out.println("Pushed "+stack.push(100));
            }

        },"Pusher").start();


        new Thread(()->{
            int counter =0;
            while(++counter<10){
                System.out.println("Popped "+stack.pop());
            }

        },"Popper").start();

        System.out.println("ended");
    }
}


// it givrd eerrror beca threads do not follow any seq so there might be a tym in which no elemtn was there still we popper (without synchronized)