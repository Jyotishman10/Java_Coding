import java.util.*;

public class average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        float average = (float) (a + b + c) / 3;
        System.out.print("Average is:" + average);
        sc.close();
    }
}
