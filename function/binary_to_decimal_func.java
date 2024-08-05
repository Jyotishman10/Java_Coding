import java.util.*;

public class binary_to_decimal_func {

    public static void decimal(int num) {

        int real_n = num;
        int pow = 0;
        int dec = 0;
        while (num > 0) {

            int lastdigit = num % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            num = num / 10;
        }
        System.out.println("Decimal of " + real_n + " is : " + dec);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        decimal(n);
        sc.close();

    }
}
