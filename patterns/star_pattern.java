import java.util.*;

public class star_pattern {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = sc.next().charAt(0);
        System.out.println("The Star Pattern is : ");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);// !!!!!!if we write println then the character prints on next line.so take
                // print.
            }
            System.out.println();
        }
        sc.close();
    }
}