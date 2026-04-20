import java.util.*;

class Solution {
    public int[][] kNearestCars(int[][] cars, int k) {

        // Max Heap based on distance
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> b[0] - a[0] //max heap
        );

        for (int[] car : cars) {
            int x = car[0];
            int y = car[1];

            int dist = x * x + y * y;

            maxHeap.offer(new int[]{dist, x, y});

            // Maintain size k
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove farthest
            }
        }

        int[][] result = new int[k][2];

        int i = 0;
        while (!maxHeap.isEmpty()) {
            int[] curr = maxHeap.poll();
            result[i][0] = curr[1];
            result[i][1] = curr[2];
            i++;
        }

        return result;
    }
}
