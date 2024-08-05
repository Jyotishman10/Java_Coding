import java.util.*;

public class Passing_array_as_argument_by_reference {

    public static void update(int marks[], int nonchangable) {
        nonchangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nonchangable = 5;// call by value
        int marks[] = { 50, 60, 89 };// call by reference
        update(marks, nonchangable);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println(nonchangable);
        sc.close();
    }
}
