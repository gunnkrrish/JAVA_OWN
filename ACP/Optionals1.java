package ACP;
// import java.util.NoSuchElementException;
import java.util.Optional;

// public class Optionals1 {
//     public static void main(String[] args) {
//         Optional<String> name = getName(2);
//         if(name.isPresent()){
//             System.out.println(name.get());
//         }
//         // name.ifPresent(x-> System.out.println(x));        //consumer
//         //              Or
//         name.ifPresent(System.out::println);
        
//     }
//     private static Optional<String> getName(int id){
//         String name = null;
//         // return Optional.of(name);   isme agr null value hui to bhi error de rha h isliye hmne optionalofnullable use kiya h
//         return Optional.ofNullable(name);

//     }
// }




// *******************************************************

// public class Optionals1 {
//     public static void main(String[] args) {
//         Optional<String> name = getName(2);
//     //    String nametoused = name.isPresent()? name.get(): "Na";
//                             //Or
//     //    String nametoused = name.orElse("Na");
//                             //or
//        //String nametoused = name.orElseGet(() -> "Na");        //supplier
    
//        String nametoused = name.orElseThrow(() -> new NoSuchElementException());  

//        System.out.println(nametoused);
        
//     }
//     private static Optional<String> getName(int id){
//       return Optional.empty();
//     // return Optional.of("Shyam");
//     }
// }


//************************************************************************** */
public class Optionals1 {
    public static void main(String[] args) {
        Optional<String> optional = getName(2);
        Optional<Integer> optional1 = optional.map(x -> x.length());
        optional1.ifPresent(System.out::println);
    }
    private static Optional<String> getName(int id){
    //   return Optional.empty();
    return Optional.of("Shyam");
    
    }
}

