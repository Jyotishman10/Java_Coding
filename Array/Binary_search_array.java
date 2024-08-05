import java.util.*;

public class Binary_search_array {

    public static int Binary_search(int marks[], int key) {

        int n = marks.length, start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (marks[mid] == key) {
                return mid;
            }
            if (marks[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int marks[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 20;

        System.out.println("The Element is at " + Binary_search(marks, key) + " position");
        sc.close();
    }
}
