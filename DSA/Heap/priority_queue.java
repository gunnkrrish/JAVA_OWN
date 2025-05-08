package DSA.Heap;


//import java.util.Collections;
import java.util.PriorityQueue;

 class student implements Comparable<student>{
   int marks;
   String name;
   student(String name,int marks){
      this.name = name;
      this.marks = marks;
   }
   public String toString(){
      return "Student name: "+this.name+" , marks: "+this.marks;
   }
   public int compareTo(student that){
      //return this.marks - that.marks; //inc-asc
      if(that.marks == this.marks){
         return this.name.compareTo(that.name);
      }
      return that.marks - this.marks; 
   }
   @Override
   public boolean equals(Object obj) {
       if(obj instanceof student){
         student that = (student) obj;
         if(this.marks == that.marks && (this.name.compareTo(that.name))==0){
            return true;
         }
         return false;
       }
       else{
         return false;
       }
      
   }
}
public class priority_queue {
   public static void main(String[] args) {
   //  PriorityQueue<Integer> pq = new PriorityQueue<>();  // by default min pq
   //  pq.offer(1);
   //  pq.offer(2);
   //  pq.offer(10);
   //  pq.offer(0);
   //  System.out.println("highest element is "+pq.peek());
   //  System.out.println("for max: ");
   //  PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());  // by default max pq
   //  maxpq.offer(1);
   //  maxpq.offer(2);
   //  maxpq.offer(10);
   //  maxpq.offer(0);
   //  System.out.println("highest element is "+maxpq.peek());    
   //  System.out.println("deleted element is "+maxpq.poll());
   //  System.out.println("highest element is "+maxpq.peek());
   //  System.out.println(maxpq.contains(10));


   PriorityQueue<student> minstupq = new PriorityQueue<>();
   // student ns = new student("gunn", 100);
   minstupq.offer(new student("gunn", 100));
   minstupq.offer(new student("zmandeep", 100));
   minstupq.offer(new student("mohit", 98));
   System.out.println(minstupq.peek());
   // System.out.println(minstupq.contains(ns));
   }

}
