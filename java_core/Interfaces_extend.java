package java_core;

interface Gill{
    void add();
}
interface Raj extends Gill{
    
    void sub();
}
class Ankit implements Raj{
    @Override
    public void add(){
        int a=10,b=20,c;
        c=a+b;
        System.out.println("add "+c);
    }
    @Override
    public void sub(){
        int a=20,b=10,c;
        c=a-b;
        System.out.println("sub "+c);
    }

}
class Main{
    public static void main(String[] args) {
        Raj r = new Ankit();
        r.add(); r.sub();
    }
}
