import java.util.*;

public class inverted_rotated_half_pyramid_pattern {

    public static void halfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();
        halfPyramid(n);

        sc.close();
    }
}
