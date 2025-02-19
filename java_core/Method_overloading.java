public class Method_overloading {
    void add(){
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y){
        
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x,double y){
        
        double c;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Method_overloading  r = new Method_overloading ();
        r.add();
        r.add(40,50);
        r.add(402,7.3);
    }
}
