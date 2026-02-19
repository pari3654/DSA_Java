import java.util.*;

public class PairSumRotated {

    // Step 1: Find pivot (breaking point)
    public static int findPivot(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return n - 1; // array not rotated
    }

    // Step 2: Pair sum logic using circular two pointers
    public static boolean pairSum(int[] arr, int target) {
        int n = arr.length;

        int pivot = findPivot(arr);

        int lp = (pivot + 1) % n; // smallest element
        int rp = pivot;           // largest element

        while (lp != rp) {
            int sum = arr[lp] + arr[rp];

            if (sum == target) {
                return true;
            }

            // Case 2: move lp forward
            if (sum < target) {
                lp = (lp + 1) % n;
            }
            // Case 3: move rp backward
            else {
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;

        System.out.println(pairSum(arr, target));
    }
}
