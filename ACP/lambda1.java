package ACP;

//Nrml way to implement
@FunctionalInterface
interface cab {
    public void bookcab();
    
}
// class Ola implements cab{
//     public void bookcab(){
//         System.out.println("ola cab is booked...");
//     }

    
// }
public class lambda1 {
    public static void main(String[] args) {
        //cab obj = new Ola();

        cab obj = ()->System.out.println("ola cab is booked...");
        obj.bookcab();
    }
}
