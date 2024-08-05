public class MaxSubArraySum {

    public static void MaxSubAraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer value

        // Iterate over each possible starting index of the subarray
        for (int i = 0; i < numbers.length; i++) {
            // Iterate over each possible ending index of the subarray
            for (int j = i; j < numbers.length; j++) {
                int currSum = 0; // Initialize current sum for the subarray

                // Calculate the sum of the subarray from index i to j
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }

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
        int number[] = {2, 4, 6, 8, 10}; // Define an array of integers
        MaxSubAraySum(number); // Call the function to find and print the max subarray sum
    }
}
