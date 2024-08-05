public class SubArrays {

    public static void subarr(int numbers[]) {
        int TotalSubArrays = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                TotalSubArrays++;
                System.out.println(); // Move to the next line after printing each subarray
            }
            System.out.println();
        }
        System.err.println("The Total SubArrays are " + TotalSubArrays);
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10 };
        subarr(number);
    }
}
