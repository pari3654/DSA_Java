// STEP 1️⃣: Find the largest element in the array (to know range)

// STEP 2️⃣: Create a count array of size (largest + 1)

// STEP 3️⃣: Count the frequency of each element in the input array

// STEP 4️⃣: Traverse count array → for each number, 
//           fill it in the original array according to its frequency

// STEP 5️⃣: Print the sorted array


import java.util.*;
import java.util.Arrays;

public class Sorting {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest , arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i =0; i<arr.length; i++)  {
            count[arr[i]]++;
        }
        //sorting 
        int j = 0;
        for(int i =0; i<count.length; i++ ) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

 public static void printArr(int arr[]) {
    for(int i=0; i<arr.length; i++) {
        System.out.print(arr[i] +"");

    }
    System.out.println();
 }

    public static void main(String args[]) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        printArr(arr);
    }
}
