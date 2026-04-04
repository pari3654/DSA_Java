import java.util.*;

public class StackUsingQueues {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    // isEmpty
    public static boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    // push (O(1))
    public static void push(int data) {
        if (!q1.isEmpty()) {
            q1.add(data);
        } else {
            q2.add(data);
        }
    }

    // pop (O(n))
    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int top = -1;

        // case 1: q1 has elements
        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.remove();
                if (q1.isEmpty()) {
                    break;
                }
                q2.add(top);
            }
        } 
        // case 2: q2 has elements
        else {
            while (!q2.isEmpty()) {
                top = q2.remove();
                if (q2.isEmpty()) {
                    break;
                }
                q1.add(top);
            }
        }

        return top;
    }

    // peek (O(n))
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int top = -1;

        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.remove();
                q2.add(top);
            }
        } else {
            while (!q2.isEmpty()) {
                top = q2.remove();
                q1.add(top);
            }
        }

        return top;
    }

    public static void main(String args[]) {
        push(1);
        push(2);
        push(3);

        while (!isEmpty()) {
            System.out.println(peek());
            pop();
        }
    }
}
