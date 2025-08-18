package ACP;

class sarkar{
    public Runnable workforme(Runnable run){
        run.run(); 
        System.out.println("yes boss...");
        return run;
    }
}
public class HOF1 {
    public static void main(String[] args) {
        System.out.println("Hof");
        sarkar s = new sarkar();
        Runnable runnable = s.workforme(()->{
            System.out.println("lambda");
        });
        System.out.println("calling from main");
        runnable.run();

    }


    
}
