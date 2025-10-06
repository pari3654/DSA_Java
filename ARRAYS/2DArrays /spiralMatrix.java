import java.util.*;

public class Array {

    // Function to print spiral order
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // 1️⃣ Top row (left → right)
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // 2️⃣ Right column (top → bottom)
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // 3️⃣ Bottom row (right → left)
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {  // single row remaining
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // 4️⃣ Left column (bottom → top)
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {  // single column remaining
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            // Move to inner spiral
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }

    // Main method
    public static void main(String args[]) {
        int matrix[][] = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15,16}
        };

        printSpiral(matrix);
    }
}
