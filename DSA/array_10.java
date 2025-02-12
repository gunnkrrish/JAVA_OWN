package DSA;

public class array_10 {
    public static void main(String[] args) {
       //syntax
    //    datatype[] vaR_name = new datatype[size] 
    // int[] rnos = new int[5];
    //or directly
    // int[] rnos = {23,12,34,56};

    int[] ros; //declartion
    ros = new int[5]; //initialization /creating object  in heap
    }
}

/* in java primitives like int char boolean float are store in stack whereas array string(non -primitive means that can be brokeen) stores in heap
* no pointers in java
 * array object are in heap
 * heap objects are not continuius
 * dynamic memory allocation
 * hence array object in java may not be continuous as it depends on jvm
 internally store 0 by default in array
 internally store null by default in string
 array are mutuable pr strings are immutable
 */