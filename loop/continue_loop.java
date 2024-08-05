import java.util.*;

public class continue_loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 8; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println(i);
        }
        sc.close();
    }
}
