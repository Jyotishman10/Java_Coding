import java.util.*;

public class decimal_to_binary_func {

    public static void decnum(int n) {
        int my_num = n;
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int remainder = n % 2;
            bin = bin + (remainder * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("The Binary form of " + my_num + " is : " + bin);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        decnum(n);
        sc.close();
    }
}
