import java.util.*;

public class n_natural_number_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number upto You want the Sum: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum+= i;
            i++;
        }
        System.out.print("The Sum for N Natural Numbers: " + sum);
        sc.close();
    }
}
