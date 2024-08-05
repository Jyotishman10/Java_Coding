import java.util.*;

public class inverted_half_pyramid_with_numbers {

    public static void halfPyramid_numbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        halfPyramid_numbers(n);
        sc.close();
    }
}
