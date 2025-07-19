package java_core.Exception_handling;

public class file_12 {

    // throw vs throws
    void div(int a,int b) throws ArithmeticException{
        if(b==0){
             throw new ArithmeticException();
        }
        else{
            int c = a/b;
            System.out.println(c);
        }
    }
     public static void main(String[] args) throws ArithmeticException {
        file_12 t = new file_12();
        t.div(20,0);
    //     try{
    //          t.div(20,0);
    //     }
    //    catch(Exception e){
    //     System.out.println("b =0 ");
    // }


     }
}
