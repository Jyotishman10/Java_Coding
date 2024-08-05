
public class BinarySearch {

    public static int bin_search(int[] d, int key) {
        int start = 0;
        int end = d.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (d[mid] == key) {
                return mid; // Return the index of the key
            } else if (d[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        int[] d = { 2, 4, 6, 8, 10, 12, 14 };
        final int key = 12;
        int result = bin_search(d, key);
        if (result == -1) {
            System.out.println("The Number does not exist");
        } else {
            System.out.println("The Number is in position " + result);
        }
    }
}
