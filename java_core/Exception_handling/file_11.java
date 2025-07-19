package java_core.Exception_handling;

public class file_11 {
    public static void main(String[] args) throws InterruptedException{
        //throws keyword
        for(int i=1;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);

            //yha pe ek ek second ka interruption arha h or usko hmne handle ni kiya and we want ki jvm usko khud handle kre to hmne yha throws keyword use kiya h
        }
        // we can also handle with try-catch block
    }
}
