import java.util.*;

public class Array {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        /
        // Prefix Array 
        int prefix[] = new int[numbers.length];

        // pehla element ka prefix = numbers ka pehla element
        prefix[0] = numbers[0];

        // baaki prefix values fill karna
        for (int i = 1; i < prefix.length; i++) {
            // har index me store = previous total + current element
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // subarray sum calculation using prefix
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                // subarray sum using prefix array
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);
    }
}

