//HOLLOW RECTANGLE
public class Pattern1_05 {
    public static void main(String[] args) {
        for(int i=0;i<=3;i++){
            for(int j=0;j<=4;j++){
               if(i==0 || j==0|| i==3 ||j==4){
                System.out.print("* ");
               }
               else{
                System.out.print("  ");
               }
              
            }
            System.out.println();
        }
        
    }
}
