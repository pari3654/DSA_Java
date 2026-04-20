import java.util.*;

public class Classroom {
    public static void main(String[] args) {

        int ropes[] = {2, 3, 3, 4, 6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

      
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;

        while (pq.size() > 1) {
            int first = pq.remove();
            int second = pq.remove();

            int sum = first + second;
            cost = cost + sum;

            pq.add(sum);
        }

        System.out.println("Cost of connecting ropes = " + cost);
    }
}
