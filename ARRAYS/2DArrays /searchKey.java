import java.util.*;

public class Array {

    // Method to search a key in 2D array
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) { // row wise
            for (int j = 0; j < matrix[0].length; j++) { // column wise
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    // Example main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        // Input matrix elements
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("\nThe matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Input key to search
        System.out.print("\nEnter key to search: ");
        int key = sc.nextInt();

        // Call search method
        search(matrix, key);
    }
}
