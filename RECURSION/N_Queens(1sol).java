public class NQueensOneSolution {

    public static boolean isSafe(char board[][], int row, int col) {

        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }

        // left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    public static boolean nQueens(char board[][], int row) {

        // base case
        if (row == board.length) {
            printBoard(board);
            return true; // solution mil gaya → stop
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {

                board[row][j] = 'Q';

                if (nQueens(board, row + 1)) {
                    return true; // aage propagate karo
                }

                board[row][j] = 'x'; // backtrack
            }
        }

        return false; // koi solution nahi mila is path me
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
    }
}
