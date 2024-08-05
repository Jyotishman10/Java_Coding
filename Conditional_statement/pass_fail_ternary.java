import java.util.*;

public class pass_fail_ternary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int marks = sc.nextInt();
        String type = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(type);
        sc.close();
    }
}
