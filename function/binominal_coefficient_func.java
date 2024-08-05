import java.util.*;

public class binominal_coefficient_func {

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bc(int n, int r) {

        int binomal_coefficient = fact(n) / (fact(r) * fact(n - r));
        return binomal_coefficient;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();

        System.out.print("Enter the r : ");
        int r = sc.nextInt();

        System.out.print("The Bionominal Coefficient is : " + bc(n, r));

        sc.close();
    }
}
