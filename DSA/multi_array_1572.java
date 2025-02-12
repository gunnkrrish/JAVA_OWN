package DSA;
public class multi_array_1572 {
    public static void main(String[] args) {
        int[][] arr ={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j || i+j == (arr.length-1)){
                    sum = sum+ arr[i][j];
                }
            }
        } 
        System.out.println(sum);
    }
}
