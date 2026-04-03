import java.util.*;

public class QueueUsingStacks {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    // isEmpty
    public static boolean isEmpty() {
        return s1.isEmpty();
    }

    // add (enqueue)
    public static void add(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(data);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // remove (dequeue)
    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.pop();
    }

    // peek
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.peek();
    }

    public static void main(String args[]) {
        add(1);
        add(2);
        add(3);

        while (!isEmpty()) {
            System.out.println(peek());
            remove();
        }
    }
}
