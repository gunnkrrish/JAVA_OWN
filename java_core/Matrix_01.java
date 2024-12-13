package java_core;

public class Matrix_01 {
    public static void main(String[] args) {
        int a1[][] ={{1,2},{3,4}};
        int a2[][] ={{5,6},{1,2}};
        int sum[][] = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            sum[i][j] = a1[i][j] +a2[i][j];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
