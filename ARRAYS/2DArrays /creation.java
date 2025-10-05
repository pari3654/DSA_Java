import java.util.*;

public class Array {
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        // Input
        for (int i = 0; i < n; i++) { // row wise
            for (int j = 0; j < m; j++) { // column wise
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < n; i++) { // row wise
            for (int j = 0; j < m; j++) { // column wise
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
