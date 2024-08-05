import java.util.*;

public class loop_break {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 8; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
        sc.close();
    }
}
