import java.util.*;

public class while_loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        System.out.print("Enter the Number upto You want to Print: ");
        int n = sc.nextInt();
        while (counter <= n) {
            System.out.print(" "+ counter);
            counter++;
        }
        sc.close();
    }
}
