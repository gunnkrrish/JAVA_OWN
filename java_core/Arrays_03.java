package java_core;
import java.util.Scanner;
public class Arrays_03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size;
        
        size = sc.nextInt();
        int a1[] = new int[size];
        for(int i=0;i<size;i++){
            a1[i] = sc.nextInt();
        }
        int a2[] = new int[size+1];
        for(int i=0;i<size;i++){
            a2[i] = a1[i];
        }
        int target_loc;
        int target;
        target_loc = sc.nextInt();
        target = sc.nextInt();
        for(int i=size-1;i>=target_loc;i--){
            a2[i+1] = a2[i];
        }
        a2[target_loc] = target;
        for(int i=0;i<a2.length;i++){
            System.out.print(a2[i] + " ");
        }

    }
}
