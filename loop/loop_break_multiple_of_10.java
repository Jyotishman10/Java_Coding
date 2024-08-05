import java.util.*;

public class loop_break_multiple_of_10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.print("I am out of the loop");
                break;
            }
            System.out.println(n);
        } while (true);
        sc.close();
    }
}
