import java.util.*;

public class factorial_func {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int factorial = fact(num);
        System.out.println("The Factorial of " + num + " is : " + factorial);

        int factorial2 = fact(6);
        System.out.print("The Factorial of 6 is : " + factorial2);
        sc.close();
    }
}
