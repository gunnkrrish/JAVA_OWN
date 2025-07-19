package java_core;

public class enum_ex {
//     public enum Month{
//         JAN(1),
//         FEB(2),
//         MAR(3);
//         int value;
//         Month(int value){
//         this.value = value;
//         }
//     }
//     public static void main(String[] args) {
//         for(Month m : Month.values()){
//             System.out.println(m+" "+m.value);
//         }
//     }




//************************************************ */
public enum Month{
    JAN,FEB,MAR
    //agr hum iski value de rhe h to hume constrcutor bnana pdega
}
public static void main(String[] args) {
    for(Month m : Month.values()){
        System.out.println(m);
    }
    System.out.println(Month.valueOf("JAN").ordinal());
    //System.out.println(Month.ordinal("JAN"));  //wrong

}
 }
