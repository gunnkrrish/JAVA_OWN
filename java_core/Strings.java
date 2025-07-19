package java_core;


public class Strings {
    public static void main(String[] args) {

        //BY LITERAL

        // String a = "ankit";     //literal
        //  System.out.println(a);

        // String b = "ankit";
        // System.out.println(b);

        // // a.concat("kumar");      //it is not possible 
        // // System.out.println(a);          //output : ankit
       

        // a=a.concat("kumar");      //forcefully u can do it by
        // System.out.println(a);



        //BY NEW KEYWORD


        // String a = new String("ankit");
        // System.out.println(a);

        // String b = new String("ankit");
        // System.out.println(b);

        // a.concat("kumar");          //no change
        // System.out.println(a);

        // a=a.concat("kumar");          //change
        // System.out.println(a);


        //CHECK OUTPUT

        String a = new String("ankit");
        System.out.println(a);

        String b = new String("ankit");
        System.out.println(b);

        a ="kumar";         //isse a ka nya obj bn gya h ise b pe koi frk nhi ayega
        System.out.println(a);

    }

    

}
