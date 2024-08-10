import java.util.HashSet;

public class DuplicateFinder {
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicates = false;

        for (int num : arr) {
            if (!set.add(num)) {
                hasDuplicates = true;
                System.out.println("Duplicate found: " + num);
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 0, 3, 4, 2, 5, 3};
        findDuplicates(numbers);
    }
}
