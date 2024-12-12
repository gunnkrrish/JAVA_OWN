//biggest elemnt in array
package java_core;

public class Arrays_02 {
    public static void main(String[] args) {
        int a[] = {20,30,400,50,10};
        int largest = a[0];
        for(int i=1;i<5;i++){
            if(a[i]>largest){
                largest = a[i];
            }
        }
        System.out.println(largest);
    }
}
