package java_core;

public class Arrays_04 {
    public static void main(String[] args) {
        int a1[]= {10,20,30,40,50};
        int ele = 30;
        int a2[] = new int[a1.length-1];
        int j=0;
        for(int i=0;i<a1.length;i++){
            if(a1[i] == ele){
                continue;
            }
            else{
                a2[j] = a1[i];
                j++;
            }
        }
        for(int i=0;i<a2.length;i++){
            System.out.print(a2[i] + " ");
        }
    }
}
