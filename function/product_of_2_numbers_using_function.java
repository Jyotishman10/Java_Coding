import java.util.*;

public class product_of_2_numbers_using_function {

    public static int product(int a, int b) {
        int p = a * b;
        return p;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number : ");
        int num2 = sc.nextInt();

        int p = product(num1, num2);//1st type
        System.out.println("The Product is : " + p);

        int p2 = product(19, 9);//2nd type
        System.out.print("The Product is : " + p2);
        sc.close();
    }
}
