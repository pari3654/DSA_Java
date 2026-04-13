class Solution {

    public static boolean isPossible(int[] books, int n, int limit, int students) {
        int k = 1;       // student count
        int pages = 0;   // pages for current student

        for (int i = 0; i < n; i++) {

            if (books[i] > limit) {
                return false;
            }

            if (pages + books[i] <= limit) {
                pages = pages + books[i];
            } else {
                k = k + 1;           // new student
                pages = books[i];    // assign current book

                if (k > students) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int allocateBooks(int[] books, int students) {
        int n = books.length;

        if (students > n) {
            return -1;
        }

        int low = books[0];
        int high = books[0];

       
        for (int i = 1; i < n; i++) {
            if (books[i] > low) {
                low = books[i];   // max element
            }
            high = high + books[i]; // sum
        }

        int res = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(books, n, mid, students)) {
                res = mid;
                high = mid - 1;   // minimize
            } else {
                low = mid + 1;    // increase
            }
        }

        return res;
    }
}
