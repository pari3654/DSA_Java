import java.util.*;

public class Recursion {

    public static int lastOccurence(int arr[], int key, int i) {
        // Base case: when i reaches end of array
        if (i == arr.length) {
            return -1;
        }

        // Recursive call for next index
        int isFound = lastOccurence(arr, key, i + 1);

        // If not found ahead, and current element matches key
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        // Otherwise return the found index
        return isFound;
    }

    public static void main(String args[]) {
        int arr[] = {5, 6, 7, 5, 5};
        System.out.println(lastOccurence(arr, 5, 0));  // Output → 4
    }
}
