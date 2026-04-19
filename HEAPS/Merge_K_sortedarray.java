import java.util.*;

class Node {
    int value;
    int row;
    int col;

    Node(int v, int r, int c) {
        value = v;
        row = r;
        col = c;
    }
}

public class MergeKSorted {

    public static List<Integer> mergeKSortedArrays(int[][] a) {
        int n = a.length;
        int m = a[0].length;

        List<Integer> res = new ArrayList<>();

        // Min Heap based on value
        PriorityQueue<Node> pq = new PriorityQueue<>(
            (x, y) -> x.value - y.value
        );

        // Step 1: push first element of each row
        for (int i = 0; i < n; i++) {
            pq.add(new Node(a[i][0], i, 0));
        }

        // Step 2: process heap
        while (!pq.isEmpty()) {
            Node curr = pq.poll();

            res.add(curr.value);

            int row = curr.row;
            int col = curr.col;

            // Step 3: push next element of same row
            if (col + 1 < m) {
                pq.add(new Node(a[row][col + 1], row, col + 1));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        System.out.println(mergeKSortedArrays(arr));
    }
}
