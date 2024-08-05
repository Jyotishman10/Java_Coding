import java.util.*;

public class ABCD_Pyramid_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        char ch = 'A';
        System.out.println("The Pyramid Pattern is : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            sc.close();
        }
    }
}
