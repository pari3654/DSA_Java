/*
Question:
Write a Java program to print the sum of the numbers 
in the second row of a 2D array.

Example:
Input:
int[][] nums = { 
    {1, 4, 9}, 
    {11, 4, 3}, 
    {2, 2, 3} 
};

Output:
18
*/

import java.util.*;

public class SumOfSecondRow {

    // Method to calculate sum of the second row
    public static int sumRow(int[][] matrix) {
        int sum = 0;
        
        // Loop through all elements of the second row (index 1)
        for (int j = 0; j < matrix[1].length; j++) {
            sum += matrix[1][j]; // adding sum to existing sum 
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3}
        };

        int totalSum = sumRow(matrix);
        System.out.println("Sum of elements in the second row: " + totalSum);
    }
}
