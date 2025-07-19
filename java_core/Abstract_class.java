package java_core;

// abstract class animal{
//     animal(){
//         System.out.println("all animals...!");
//     }
//     public abstract void sound();       //no body
    
// }
// class Dog extends animal{
//     Dog(){
//         super();
//     }
//     public void sound(){
//         System.out.println("bark");
//     }
// }
// class Lion extends animal{
//     // Lion(){
//     //     super();         //without iske bhi call hoga super ka constructor
//     // }
//     public void sound(){
//         System.out.println("roar");
//     }
// }
// public class Abstract_class {
//     public static void main(String[] args) {
//         // animal r = new animal() ;   //we cant make object of abstract class
//          //animal r = new Dog(); //but can create interface 

//         // Dog r = new Dog();
//         // Lion l = new Lion();
//         //r.sound();
//         // l.sound();
//     }
// }




//2
// abstract class Prog{

//     public abstract void developer();
//     public abstract void rank();
// }
// class html extends Prog{
//     @Override
//     public void developer(){
//         System.out.println("tim berners lee");
//     }
//     @Override
//     public void rank(){
//         System.out.println("tim ");
//     }
// }
//  class Java extends Prog{
//     @Override
//     public void developer(){
//         System.out.println("james ghosling");
//     }

//     //if we dont override rank in java then it will make it abstact class then write abstract in front of class java 
// }
// class Abstract_class{
//     public static void main(String[] args) {
//         Prog h = new html(); //ref
//         h.developer(); h.rank();
//         Java j = new Java(); //obj
//         j.developer();
//     }
// }