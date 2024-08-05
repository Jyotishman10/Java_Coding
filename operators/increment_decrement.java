import java.util.*;

public class increment_decrement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // ++a
        int a = 10;
        System.out.println(a);
        int b = ++a;
        System.out.println("++a = " + b);
        // f++
        int f = 45;
        System.out.println(f);
        int c = f++;
        System.out.println("f++ = " + c);
        // g--
        int g = 56;
        System.out.println(g);
        int d = g--;
        System.out.println("g-- = " + d);
        // --p
        int p = 89;
        System.out.println(p);
        int e = --p;
        System.out.println("--p = " + e);
        sc.close();
    }
}
