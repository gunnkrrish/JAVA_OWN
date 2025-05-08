package DSA.Heap;

public class basic_practise {
    int[] heap ;
    int heapSize;
    int capacity;
    basic_practise(int[] arr){
        heap = arr;
        heapSize = arr.length;
        capacity = arr.length;
    }
    public void swap(int i,int largest){
        int temp = heap[i];
        heap[i] = heap[largest];
        heap[largest] = temp;
    }
    public void heapify(int i){
        int largest = i;
        int lchild = 2*i+1;
        int rchild = 2*i+2;
        if(lchild < heapSize && heap[lchild] > heap[largest]){
            largest = lchild;

        }
        if(rchild < heapSize && heap[rchild] > heap[largest]){
            largest = rchild;
        }
        if(largest != i){
            swap(i,largest);
            heapify(largest);
        }
    }
    public void buildTree(){
        for(int i = heapSize/2-1;i>=0;i--){
            heapify(i);
        }
    }
    public int pop(){
        if(heapSize ==0 ) {
            System.out.println("heap is empty");
            return -1;
        }
        int i = heap[0];
        heap[0] = heap[heapSize-1];
        heapSize--;
        heapify(0);
        return i;
    }
    public void increasekey(int value,int index){
        if(index<0 || index >=heapSize || heap[index]>= value){
            System.out.println("wrong operation");
            return;
        }
        heap[index] = value;
        while(index>0 && heap[index] >  heap[(int) (Math.ceil(index/2.0)-1)]){
            swap(  (int) Math.ceil(index/2.0)-1,index);
            index = (int) (Math.ceil(index/2.0)-1);
        }

    }
    public void decreasekey(int value,int index){
        if(index<0 || index >=heapSize || heap[index]<= value){
            System.out.println("wrong operation");
            return;
        }
        heap[index] = value;
        heapify(index);
    }
    public void insert(int val){
        while(heapSize+1 >= capacity ){
            capacity *= 2;
            int newHeap[]  = new int[capacity];
            for(int i=0;i<heapSize;i++){
                newHeap[i] = heap[i];

            }
            heap = newHeap;
        }
        heapSize++;
        heap[heapSize-1] = val;
        int index = heapSize-1;
        while(index>0 && heap[index] >  heap[(int) (Math.ceil(index/2.0)-1)]){
            swap(  (int) Math.ceil(index/2.0)-1,index);
            index = (int) (Math.ceil(index/2.0)-1);
        }

    }
    public int[] heapSort(){
        buildTree();
        int size = heapSize;
        for(int i=0;i<size;i++){
            extractmaxandstore();
        }
        return heap;
    }
    public void extractmaxandstore(){
        if(heapSize ==0){
            System.out.println("heap is empty");
            return;
        }
        int max = heap[0];
        heap[0] = heap[heapSize-1];
        heap[heapSize-1] = max;
        heapSize--;
        heapify(0);
        return;
    }
    public void printobj(){
        for(int i=0;i<heapSize ;i++){
            System.out.print(heap[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr  ={10,5,20,6,11};
        basic_practise obj = new basic_practise(arr);
        obj.buildTree();
        obj.printobj();
        System.out.println();
        // System.out.println("removed element is : "+ obj.pop());
        // obj.printobj();
        obj.increasekey(15, 4);
        obj.printobj();
        System.out.println();
        obj.decreasekey(4, 0);
        obj.printobj();
        System.out.println();
        obj.insert(18);
        obj.printobj();
        System.out.println();
        int res[] = obj.heapSort();
    for(int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");
    }
    }
}
