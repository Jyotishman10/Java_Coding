import java.util.*;

public class if_else {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are an Adult.You can drive & vote");
        } else if (age < 18 && age > 13) {//***Else If Condition if the If statement become false then it is activated.
            System.out.println("You are a Teenager");
        } else {
            System.out.println("You are a Children");
        }
        sc.close();
    }
}
