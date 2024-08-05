import java.util.*;

public class reverse_print_loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int lastdigit;
        System.out.print("The Reverse number is :");
        while (n > 0) {
            lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
        System.out.println();
        sc.close();
    }
}
