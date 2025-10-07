/*
Question:
Write a Java program to find the Transpose of a Matrix.

Definition:
Transpose of a matrix is obtained by swapping its rows and columns.
If original matrix is of size n x m, the transposed matrix will be of size m x n.

Example:
Original Matrix (2x3):
1 2 3
4 5 6

Transposed Matrix (3x2):
1 4
2 5
3 6
*/

import java.util.*;

public class TransposeMatrix {

    public static void main(String[] args) {
        // Original matrix
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = original.length;       // Number of rows in original
        int cols = original[0].length;   // Number of columns in original

        // Create matrix to store the transpose (size cols x rows)
        int[][] transpose = new int[cols][rows];

        // Fill the transpose matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = original[i][j];
            }
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
