public class SelectionSort {

    public static void Selection_sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int smallNum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallNum] > arr[j]) {
                    smallNum = j;
                }
            }
            int temp = arr[smallNum];
            arr[smallNum] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 5, 4, 1, 3, 2 };
        Selection_sort(arr);

    }
}
