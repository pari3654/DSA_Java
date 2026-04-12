import java.util.*;

public class AggressiveCows {

    // Helper function to check if placing k cows is possible
    public static boolean canPlace(int[] stalls, int k, int guess) {
        int cows = 1; // first cow at first stall
        int prevpos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            int distance = stalls[i] - prevpos;
            if (distance  >= guess) {
                cows++;
                prevpos = stalls[i];
            }
        }

        return cows >= k;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls); // values sorted honi chaiye

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0]; //last - first 
        int res = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2; 

            if (canPlace(stalls, k, mid)) {
                res = mid;        // possible → store answer
                low = mid + 1;    // try bigger distance
            } else {
                high = mid - 1;   // reduce distance
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3;

        System.out.println(aggressiveCows(stalls, k)); // Output: 3
    }
}
