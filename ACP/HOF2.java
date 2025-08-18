package ACP;


class sarkar1{
    public void testing(dance d){
        d.dance();
    }
}
 interface dance{
    public void dance();
}
public class HOF2 {
    public static void main(String[] args) {
        sarkar1 s = new sarkar1();
        dance d =()->{
            System.out.println("dancing");
        };

        s.testing(()->{
            System.out.println("lets dance");
        });
    }
}


// output******************************************
