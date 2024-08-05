import java.util.*;

public class area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float area = (side * side);
        System.out.println("The Area of the Square: " + area);
        sc.close();
    }
}
