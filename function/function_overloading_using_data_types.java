import java.util.*;

public class function_overloading_using_data_types {
    // func to calc sum of 2 nums
    public static int sum(int a, int b) {
        return a + b;
    }

    // func to calc sum of 3 nums
    public static float sum(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println(sum(5, 2));
        System.out.println(sum(5.5f, 1.5f, 9.5f));
        sc.close();
    }

}
