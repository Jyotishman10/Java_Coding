public class MaxSubarraySumPrefix {

    public static void MaxSubArraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum;
        int prefix[] = new int[numbers.length];

        // Step 1: Create the prefix sum array
        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Step 2: Find the maximum subarray sum
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                // Print the current subarray sum
                System.out.println("Subarray sum from index " + i + " to " + j + " = " + currSum);

                // Update maxSum if the current subarray sum is greater
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        // Print the maximum subarray sum
        System.out.println("Total Max SubArray Sum = " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 }; // Define an array of integers
        MaxSubArraySum(numbers); // Call the function to find and print the max subarray sum
    }
}
