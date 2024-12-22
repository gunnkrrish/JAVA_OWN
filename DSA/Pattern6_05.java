package DSA;
public class Pattern6_05 {
//     public static void main(String[] args) {
//         int n;
//         for(int i=1;i<=5;i++){
//             n=1;
//             for(int j=5;j>=i;j--){
//                 System.out.print(n+" ");
//                 n++;
//             }
//             System.out.println();
//         }
//     }
// }


    public static void main(String[] args) {
        
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }



    }
}
