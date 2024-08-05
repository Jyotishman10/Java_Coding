import java.util.*;

public class TernaryOperator {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("The Number can be : ");
            int number = sc.nextInt();
            
            String result = number > 46 ? "The number you entered is great" : "smaller than your Pass Marks";
            System.out.println("The result is : " + result);
        }
    }
}
