import java.util.*;

public class loop_prime_or_not {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.print("Number is Prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n)/* for smaller prime number replace with = (n - 1) */; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.print("Number is Prime");
            } else {
                System.out.print("Number is not Prime");
            }
        }
        sc.close();
    }
}