package ACP;

import java.util.LinkedList;
import java.util.Queue;

public class Concurrency4 {
    private Queue<Integer> q;

    private int capacity;

    public Concurrency4(int cap){
        q = new LinkedList<>();
        capacity = cap;
    }
    public boolean add(int item){
        synchronized(q){
            while(q.size() == capacity){
                try{
                    q.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            q.add(item);
            q.notifyAll();
            return true;
        }
    }
     public int remove(){
        synchronized(q){
            while(q.size() == 0){
                // we have done this iff remove function is called first by thread but thread does not have any element to remove so it will wait for it to add somethinf
                // then after adding it will notify
                try{
                    q.wait();
                    // becaz if we write wait , it will help other thread to access this
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            int el = q.poll();
            q.notifyAll();
            // there are three mehtods wait, notify all,notify 
            return el;
        }
    }
}
