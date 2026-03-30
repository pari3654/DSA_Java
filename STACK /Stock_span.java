import java.util.*;

public class StackB {

    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();

        // Day 0
        span[0] = 1;
        s.push(0);

        // बाकी days
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];

            // jab tak current price bada hai, pop karo
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }

            // span calculate
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            // current index push karo
            s.push(i);
        }
    }

    public static void main(String args[]) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];

        stockSpan(stocks, span);

        // print result
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
