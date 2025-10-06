import java.util.*;

public class Array {
    // Function to perform Staircase Search
    public static boolean staircaseSearch(int matrix[][], int key) {
        // Start from top-right corner
        int row = 0;
        int col = matrix[0].length - 1;

        // Loop until we go out of matrix bounds
        while (row < matrix.length && col >= 0) {
            //  Check if current element is the key
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + ", " + col + ")");
                return true;
            }
            // If key is smaller, move left (col--)
            else if (key < matrix[row][col]) {
                col--;
            }
            //  If key is larger, move down (row++)
            else {
                row++;
            }
        }
        // If we reach here, element not found
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 33;
        staircaseSearch(matrix, key);
    }
}
