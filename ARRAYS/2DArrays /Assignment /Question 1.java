/*
Question:
Write a Java program to count the number of 7’s in a 2D array.

Example:
Input:  int[][] array = { {4, 7, 8}, {8, 8, 7} };
Output: 2
*/

import java.util.*;

public class CountSevensIn2DArray {

    // Method to count number of 7s in the 2D array
    public static int countSevens(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {       // Traverse rows
            for (int j = 0; j < matrix[i].length; j++) { // Traverse columns
                if (matrix[i][j] == 7) {                 // Check for 7
                    count++;
                }
            }
        }

        return count; // Return total count
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {4, 7, 8},
            {8, 8, 7}
        };

        int totalSevens = countSevens(matrix);
        System.out.println("Number of 7s in the array: " + totalSevens);
    }
}
