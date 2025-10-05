 
    // Method to find largest element in 2D array
    public static int largest(int matrix[][]) {
        int large = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) { // row
            for (int j = 0; j < matrix[0].length; j++) { // column
                if (matrix[i][j] > large) {
                    large = matrix[i][j];
                }
            }
        }

        System.out.println("The largest element is " + large);
        return large;
    }

// here the main function remains the same as input output and print just call the largest at end 

 // Call largest method in main function 
        largest(matrix);
