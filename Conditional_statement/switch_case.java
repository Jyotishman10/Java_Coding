import java.util.*;

public class switch_case {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        float a = sc.nextFloat();
        System.out.print("Enter The Second Number: ");
        float b = sc.nextFloat();
        System.out.print("Enter The Operation: ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;

            default:
                System.out.println("Wrong Operator");
                break;
        }
        sc.close();
    }
}