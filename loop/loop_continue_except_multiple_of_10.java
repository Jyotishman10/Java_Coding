import java.util.*;

public class loop_continue_except_multiple_of_10 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Enter the number : ");
                int n = sc.nextInt();
                if (n % 10 == 0) {
                    continue;
                }
                System.out.println(n);
            } while (true);
        }
    }
}