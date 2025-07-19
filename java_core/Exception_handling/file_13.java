package java_core.Exception_handling;

public class file_13 {
    //try-catch vs throws
    public static void Wait() throws InterruptedException{
        for(int i=0;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    // public static void main(String[] args) throws Exception {
    //     Wait();
    //     System.out.println(10/0);   //not handled doest gurantee normal termination
    //     System.out.println("main ended");
    // }

     public static void main(String[] args){
        try{
             Wait();
        System.out.println(10/2);   //handled
        }
        catch(Exception e){
            System.out.println("exeption handled");
        }
        System.out.println("ended");
    }
}


// throws m try-catch lga hau h to vo hr trh ka exceptin handled krta h
// thorws m throws hi lga hua h to vo sirf ek hi exception ko handled krega
