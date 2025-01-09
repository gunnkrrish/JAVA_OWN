package java_core;
public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb); 

        //char at index 2
        System.out.println(sb.charAt(2));

        //set char at index
        sb.setCharAt(2,'d');
        System.out.println(sb);

        //insert at specific index
        sb.insert(1,'k');
        System.out.println(sb);
        
        //delete this extra k
        sb.delete(1,2);  //here 2 is exclusive
        System.out.println(sb);

        sb.delete(2,3);  //here 3 is exclusive
        System.out.println(sb);

        //append at end 
        sb.append("s");
        System.out.println(sb);

        //length
        System.out.println(sb.length());
    }
}

