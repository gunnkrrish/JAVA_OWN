package DSA.Queue;

public class Circular_queue_Array {
    public static class Cqa{
        int front =-1;
        int rear=-1;
        int[] arr = new int[5];
        int size=0;

        public void add(int val) throws Exception{
            if(size==arr.length){
                // System.out.println("Queue is full");
                // return;

                throw new Exception("queue is full");
            }
            if(size==0){
                front = rear=0;
                arr[0] = val;
                
            }
            else if(rear<arr.length-1){
                arr[++rear] = val;
            }
            else if(rear == arr.length-1){
                rear =0;
                arr[0] = val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("queue is empty");
            }
            else
            { 
                int val = arr[front];
                if(front==arr.length-1){
                    front =0;
            }
            else{
                front++;
            }
            size--;
            return val;
            }
           
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("queue is empty");

            }
            else return arr[front];
        }
        public void display() {
            if(size==0){
                System.out.println("queue is empty");
            }
            else if(front <= rear){
                for(int i= front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            else {
                for(int i=front;i<=arr.length-1;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int j=0;j<=rear;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
            
        }

    }
    public static void main(String[] args) throws Exception {
        Cqa q = new Cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();;
        q.remove();
        q.display();
        q.add(6);
        q.display();

        for(int i=0;i<q.arr.length;i++){
            System.out.print(q.arr[i]+" ");
        }
    }
}
