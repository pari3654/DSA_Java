class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board) {

        // pura board traverse karo
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                // empty cell mila
                if (board[i][j] == '.') {

                    // 1 se 9 try karo
                    for (char num = '1'; num <= '9'; num++) {

                        if (isValid(board, i, j, num)) {

                            board[i][j] = num; // place

                            if (solve(board)) return true; // recursion

                            board[i][j] = '.'; // backtrack
                        }
                    }

                    return false; // koi number fit nahi hua
                }
            }
        }

        return true; // board fill ho gaya
    }

    public boolean isValid(char[][] board, int row, int col, char num) {

        for (int i = 0; i < 9; i++) {

            // row check
            if (board[row][i] == num) return false;

            // column check
            if (board[i][col] == num) return false;

            // 3x3 box check
            int r = 3 * (row / 3) + i / 3;
            int c = 3 * (col / 3) + i % 3;

            if (board[r][c] == num) return false;
        }

        return true;
    }
}
