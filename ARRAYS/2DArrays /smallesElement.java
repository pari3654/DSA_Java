
    // Method to find smallest element in 2D array
    public static int smallest(int matrix[][]) {
        int small = Integer.MAX_VALUE; // start with max value

        for (int i = 0; i < matrix.length; i++) { // row
            for (int j = 0; j < matrix[0].length; j++) { // column
                if (matrix[i][j] < small) {
                    small = matrix[i][j];
                }
            }
        }

        System.out.println("The smallest element is " + small);
        return small;
    }
