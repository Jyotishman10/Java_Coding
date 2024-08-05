import java.util.*;

public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Creating an array;
        int marks[] = new int[90];
        // int numbers[] = { 1, 2, 3 };

        // Input & Output
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("math : " + marks[0]);
        System.out.println("Physics : " + marks[1]);
        System.out.println("Chemistry : " + marks[2]);
        sc.close();

        marks[2] = marks[2] + 1;// * - / + you can use.
        System.out.println("Chemistry : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + "%");

        // array length measuring function
        System.out.println("Length of the marks array is = " + marks.length);
    }
}
