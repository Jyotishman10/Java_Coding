import java.util.*;

public class even_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int num = sc.nextInt();
        System.out.println("The Number is:" + num);
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        sc.close();
    }
}
