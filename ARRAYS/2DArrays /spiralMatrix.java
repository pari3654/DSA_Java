public static void printSpiral(int[][] arr) {

    int top = 0;
    int bottom = arr.length - 1;
    int left = 0;
    int right = arr[0].length - 1;

    while (top <= bottom && left <= right) {

        // 1️⃣ Top row
        for (int j = left; j <= right; j++)
            System.out.print(arr[top][j] + " ");
        top++;

        // 2️⃣ Right column
        for (int i = top; i <= bottom; i++)
            System.out.print(arr[i][right] + " ");
        right--;

        // 3️⃣ Bottom row
        if (top <= bottom) {
            for (int j = right; j >= left; j--)
                System.out.print(arr[bottom][j] + " ");
            bottom--;
        }

        // 4️⃣ Left column
        if (left <= right) {
            for (int i = bottom; i >= top; i--)
                System.out.print(arr[i][left] + " ");
            left++;
        }
    }
}
