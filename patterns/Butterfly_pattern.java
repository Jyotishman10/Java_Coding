import java.util.*;

public class Butterfly_pattern {

    public static void pattern(int n) {
        // 1st part
        for (int i = 1; i <= n; i++) {
            // for 1st half column star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // for between 1st and 2nd half spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            // for 2nd half column star
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd part
        for (int i = n; i >= 1; i--) {// in 2nd half the code will change in this area.
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        pattern(n);
        sc.close();
    }
}
