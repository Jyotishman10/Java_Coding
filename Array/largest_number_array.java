import java.util.*;

public class largest_number_array {

    public static int largest(int marks[]) {
        int largest = Integer.MIN_VALUE;// - infinity

        for (int i = 0; i < marks.length; i++) {

            if (largest < marks[i]) {
                largest = marks[i];
            }
        }
        return largest;
    }

    public static int smallest(int marks[]) {
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < marks.length; i++) {

            if (smallest > marks[i]) {
                smallest = marks[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int marks[] = { 1, 8, 9, 56, 25, 78, 100 };
        
        int largest = largest(marks);
        System.out.println("The Largest Value in the Array is : " + largest);

        int smallest = smallest(marks);
        System.out.println("The Smallest Value in the Array is : " + smallest);
        
        sc.close();
    }
}
