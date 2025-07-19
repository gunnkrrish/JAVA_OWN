package java_core;
import java.util.Random;
public class random_class {
    public static void main(String[] args) {
        int number;
        Random random = new Random();
        // number = random.nextInt();
        number = random.nextInt(100);
// (0-99)
        System.out.println("generated number is : "+number);

    }
}
