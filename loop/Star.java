import java.util.*;

public class Star {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Upto You Want To Print Star: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("****");
        }
        sc.close();
    }
}
