import java.util.*;

class Solution {
    public static void interleaveQueue(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            System.out.println("Queue size must be even");
            return;
        }

        int half = q.size() / 2;
        Queue<Integer> firstHalf = new LinkedList<>();

        // Step 1: first half nikal lo
        for (int i = 0; i < half; i++) {
            firstHalf.add(q.poll());
        }

        // Step 2: interleave karo
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.poll()); // first half se
            q.add(q.poll());         // second half se
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        interleaveQueue(q);

        System.out.println(q); // [1, 3, 2, 4]
    }
}
