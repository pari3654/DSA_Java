
    //kadanes's algorithm 

    public static void kadanes( int numbers[] ) {
       int ms = Integer.MIN_VALUE;
       int cs = 0;

       for( int i=0; i<numbers.length; i++) {
        cs = cs + numbers[i];
        if (cs < 0) {
            cs = 0;
        }
        ms = Math.max(cs , ms);
       }
       System.out.println(" maximum subarray sum is :" + ms );
    }
 
     public static void main(String args[]) {
        int numbers[] = {-2, -3, 4 , -1 , -2, 1 , 5 , -3};
        kadanes(numbers);
    }
}


// handling test cases
import java.util.*;

public class KadaneOptimized {

    public static void kadanes(int numbers[]) {
        if(numbers.length == 0) { 
            System.out.println("Array is empty");
            return;
        }

        // Initialize current sum and max sum with first element
        int cs = numbers[0];
        int ms = numbers[0];

        // Loop through the array starting from second element
        for(int i = 1; i < numbers.length; i++) {
            cs = Math.max(numbers[i], cs + numbers[i]); // extend or start new
            ms = Math.max(ms, cs);                      // update max sum
        }

        System.out.println("Maximum subarray sum is: " + ms);
    }

    public static void main(String args[]) {
        int numbers1[] = {-2, -3, 4, -1, -2, 1, 5, -3}; // mix
        int numbers2[] = {-2, -3, -1, -4};              // all negative
        int numbers3[] = {5};                           // single element

        kadanes(numbers1); // Output: 7
        kadanes(numbers2); // Output: -1
        kadanes(numbers3); // Output: 5
    }
}




