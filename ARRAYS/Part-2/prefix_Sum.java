PREFIX SUM 
/*
================= Logic  =================

1. Prefix array:
   - prefix[0] = numbers[0]
   - prefix[i] = prefix[i-1] + numbers[i]
   - Har index tak ka running total store hota hai.

2. Subarray sum using prefix:
   - start = 0 → sum = prefix[end]
   - start > 0 → sum = prefix[end] - prefix[start-1]
   - Ye isliye kaam karta hai kyunki prefix[end] me shuru se end tak ka sum hota hai,
     aur prefix[start-1] subtract karne se sirf start → end ka sum bacha.

3. Maximum subarray sum:
   - Sab subarrays ke sum check karke maxSum update karte hain.

Time Complexity: O(n^2)
Space Complexity: O(n)
*/


import java.util.*;

public class Array {
 public static void maxSubarraySum (int numbers[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] =  new int [numbers.length];

    //calculate prefix array 
    for(int i =1; i<prefix.length; i++) {
        prefix[i] =  prefix[i-1] + numbers[i];
    }

    for(int i=0; i<numbers.length; i++) {
        int start = i;
       for(int j=i;  j<numbers.length; j++)  {
        int end = j;

        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
        
        
        if(maxSum < currSum ) {
            maxSum = currSum;
        }
       }
    }
     System.out.println("max Sum = " + maxSum);
 }
 
     public static void main(String args[]) {
        int numbers[] = {1, -2, 6 , -1 , 3};
        maxSubarraySum(numbers);
    }
}



