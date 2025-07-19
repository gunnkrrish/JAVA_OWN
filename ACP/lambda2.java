package ACP;
 interface Innerlambda2 {
public void bookcab(String source,String destination);
    
}
// class ola implements Innerlambda2{
//     public void bookcab(String source,String destination){
//         System.out.println("Ola cab is booked "+source+" to "+destination);
//     }

// }
public class lambda2 {
    public static void main(String[] args) {
        //Innerlambda2 obj = new ola();
        Innerlambda2 obj = (source,destination)->System.out.println("Ola cab is booked "+source+" to "+destination);
        obj.bookcab("panipat","elhi");
    }
}
