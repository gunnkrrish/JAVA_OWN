package DSA.Heap;

public class basic {
int heapSize;
int heap[];
int capacity;
basic(int arr[]){
    heap = arr;
    heapSize = arr.length;
    capacity = arr.length;

}
public void increasecapacity(){
    capacity *= 2;
    int newHeap[] = new int[capacity];
    for(int i=0;i<heapSize;i++){
        newHeap[i] = heap[i];
    }
    heap = newHeap;
}
public void swap(int i,int j){
    int temp = heap[i];
    heap[i] = heap[j];
    heap[j] = temp;
}
public void heapify(int index){
    int largest = index;
    int leftchild = 2*index+1;
    int rightchild = 2*index+2;
    if(leftchild<heapSize && heap[leftchild]>heap[largest]){
        largest = leftchild;
    }
    if(rightchild<heapSize && heap[rightchild]>heap[largest]){
        largest = rightchild;
    }
    if(largest!=index){
        swap(index,largest);
        heapify(largest);
    }
}
public void buildTree(){
    //N/2 to N-1  //leaf node
    // 0 to N/2 // inside Node
    for(int index = heapSize/2-1;index >= 0;index--){
        heapify(index);
    }
}
//pop
public int extractmax(){
    if(heapSize ==0){
        System.out.println("heap is empty");
        return -1;
    }
    int max = heap[0];
    heap[0] = heap[heapSize-1];
    heapSize--;
    heapify(0);
    return max;
}
public void increasekey(int index,int newvalue){
    if(index<0 || index>=heapSize || heap[index]>=newvalue){
        System.out.println("wrong operation");
        return;
    }
    heap[index] = newvalue;
    while(index>0 && heap[index]>heap[ (int)(Math.ceil(index/2.0)-1)]){
        swap(index, (int)(Math.ceil(index/2.0)-1));
        index = (int)(Math.ceil(index/2.0)-1);
    }
}
public void decreasekey(int index,int newvalue){
    if(index<0 || index>=heapSize || heap[index]<=newvalue){
        System.out.println("wrong operation");
        return;
    }
    heap[index] = newvalue;
    heapify(index);
}
public void insert(int newvalue){
    if(heapSize+1>=capacity){
        increasecapacity();
    }
    heapSize+=1;
    heap[heapSize-1]= newvalue;
    int index = heapSize-1;
    while(index>0 && heap[index]>heap[ (int)(Math.ceil(index/2.0)-1)]){
        swap(index, (int)(Math.ceil(index/2.0)-1));
        index = (int)(Math.ceil(index/2.0)-1);
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
public void printtree(){
    for(int i=0;i<heapSize;i++){
        System.out.print(heap[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int arr[] = new int[]{10,5,20,6,11};
        basic heap = new basic(arr);
        heap.buildTree();
        heap.printtree();
        //System.out.println("max element is: "+heap.extractmax());
        
        heap.increasekey(4, 15);
        heap.printtree();
        heap.decreasekey(0, 4);
        heap.printtree();
       // System.out.println("removed element is : "+heap.extractmax());
        heap.printtree();
        heap.insert(18);
        heap.printtree();


    int res[] = heap.heapSort();
    for(int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");
    }

    }
}
