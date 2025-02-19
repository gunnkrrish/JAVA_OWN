public class This_keyword {
    void show(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        This_keyword r = new This_keyword();
        System.out.println(r);
        r.show();
    }
}
