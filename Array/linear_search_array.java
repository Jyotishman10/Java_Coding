import java.util.*;

public class linear_search_array {
    public static int ls(int marks[], int key) {
        
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key)
                return i;
        }
        
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks[] = { 40, 5, 9, 6, 3, 2, 86, 23 };
        int key = 40;
        int index = ls(marks, key);

        
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("key is at index " + index);
        }
        sc.close();
    }
}
