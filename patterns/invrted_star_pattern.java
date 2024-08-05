import java.util.*;

public class invrted_star_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = sc.next().charAt(0);
        System.out.println("The Star Pattern is : ");
        // first type
        /*
         * for (int i = 200; i >= 1; i--) {
         * for (int j = i; j >= 1; j--) {
         * System.out.print(ch);// !!!!!!if we write println then the character prints on next line.so take print.
         * }
         * System.out.println();
         * }
         */
        // !!!!!!!!!!!!!!!!!!!!2nd type
        for (int i = 1; i <= 50; i++) {
            for (int j = 1; j <= (50 - i + 1); j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
