import java.util.*;

public class largest_num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A >= B) {
            System.out.println("The Largest is: A = " + A);
        } else {
            System.out.println("The Largest is: B = " + B);
        }
        sc.close();
    }
}
