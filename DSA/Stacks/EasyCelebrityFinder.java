 package DSA.Stacks;
// import java.util.*;
// public class celebrity_problem_gfg {
//     public static int celebrity(int M[][],int n){
//         Stack<Integer> st = new Stack<>();
//         for(int i=0;i<n;i++){
//             st.push(i);
//         }
//         while(st.size()>1){
//             int v1 = st.pop();
//             int v2 = st.pop();

//             if(M[v1][v2] ==0){ //v1 celb ho skta h agr vo v2 ko nhi janta
//                 st.push(v1);

//             }
//             else if(M[v2][v1]==0) { //v2 may be cel
//                 st.push(v2);
//             }
            
//         }
//         if(st.size() ==0){
//             return -1;
//         }
//         int poten = st.pop();
//         for(int i=0;i<n;i++){
//             if(M[poten][i] ==1) return -1;
//         }

//         for(int i=0;i<n;i++){
//             if(i==poten) continue;
//             if(M[i][poten] ==0) return -1;
//         }
//         return poten;

        
//     }
    
//         public static void main(String[] args) {
//             int[][] mat = {
//                 {0, 1, 1, 1},
//                 {0, 0, 0, 0}, // This person (index 1) is the celebrity
//                 {0, 1, 0, 1},
//                 {0, 1, 0, 0}
//             };
//             int n = mat.length;
            
//             int result = celebrity(mat, n);
            
//             if (result == -1) {
//                 System.out.println("No celebrity found");
//             } else {
//                 System.out.println("Celebrity is at index: " + result);
// }
// }
//     }






















public class EasyCelebrityFinder {
    public static int findCelebrity(int[][] M, int n) {
        for (int i = 0; i < n; i++) {
            boolean isCelebrity = true;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                // If person i knows j or j doesn't know i ⇒ i can't be celebrity
                if (M[i][j] == 1 || M[j][i] == 0) {
                    isCelebrity = false;
                    break;
                }
            }

            if (isCelebrity) return i;
        }

        return -1; // No celebrity found
    }

    public static void main(String[] args) {
        int[][] M = {
            {0, 1, 1, 1},
            {0, 0, 0, 0}, // ← Celebrity
            {0, 1, 0, 1},
            {0, 1, 0, 0}
        };

        int result = findCelebrity(M, M.length);
        if (result == -1)
            System.out.println("No celebrity found");
        else
            System.out.println("Celebrity is at index: " + result);
    }
}
