/*to get length use a.length 
 for copy size must be same ,in second size can be more but not less ,type must be same.
*/

//SORT ELEMENTS IN ASCENDING ORDER
package java_core;

public class Array_01 {
    public static void main(String[] args) {
        int a[] = {100,190,30,60,50};
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(a[i] >a[j]){
                    int temp=a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                
            }
            System.out.print(a[i]+" ");
        }
    }
}
