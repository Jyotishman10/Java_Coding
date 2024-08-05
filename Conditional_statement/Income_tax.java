import java.util.*;

public class Income_tax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The Income Will be: ");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income > 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        int newincome = (int) (income - tax);
        System.out.println("The Tax Will be : " + tax);
        System.out.println("Now the New Income is : " + newincome);
        sc.close();
    }
}
