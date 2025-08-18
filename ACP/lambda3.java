package ACP;

 interface Innerlambda3 {
public String bookcab(String source,String destination);  
}
// class ola implements Innerlambda3{
//     public String bookcab(String source,String destination){
//         System.out.println("Ola cab is booked "+source+" to "+destination);
//         return ("Price: 5000 rs");
//     }

// }
public class lambda3 {
    public static void main(String[] args) {
        // Innerlambda3 obj = new ola();
        Innerlambda3 obj = (source,destination)->{System.out.println("Ola cab is booked "+source+" to "+destination);
        return "Price: 5000 rs";
    };

        System.out.println(obj.bookcab("panipat","delhi"));
    }
}
