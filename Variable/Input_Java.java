import java.util.*;

public class Input_Java {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            System.out.println(name);

            String n = sc.nextLine();
            System.out.println(n);

            int num = sc.nextInt();
            System.out.println(num);

            float price = sc.nextFloat();
            System.out.println(price);
            
            boolean a = sc.nextBoolean();
            System.out.println(a);

            short b = sc.nextShort();
            System.out.println(b);

            Long c = sc.nextLong();
            System.out.println(c);
        }
    }
}