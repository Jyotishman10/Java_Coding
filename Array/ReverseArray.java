public class ReverseArray {

    public static void reverse(int number[]) {
        int start = 0, end = number.length - 1;
        while (start < end) {
            // Swap elements at start and end
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        {
            int number[] = { 2, 4, 6, 8, 10 };
            reverse(number);

            for (int index = 0; index < number.length; index++) {
                System.out.print(number[index] + " ");
            }
        }
    }
}
