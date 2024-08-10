public class InsertionSort {

    public static void Selection_Sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = i;
            int prev = i - 1;
            while (prev >= 0 && arr[i-1] > arr[i]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Selection_Sort(arr);
        PrintArray(arr);
    }
}
