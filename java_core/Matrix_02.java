package java_core;

public class Matrix_02 {
    public static void main(String[] args) {
        int a1[][] = {{1,2},{4,3}};
        for(int i=0;i<2;i++){
            for(int j=1;j>=0;j--){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
