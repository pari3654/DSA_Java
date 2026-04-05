import java.util.*;

class Stack {
    Deque<Integer> deque = new LinkedList<>();

    // push
    public void push(int data) {
        deque.addLast(data);
    }

    // pop
    public int pop() {
        return deque.removeLast();
    }

    // peek
    public int peek() {
        return deque.getLast();
    }

    // isEmpty
    public boolean isEmpty() {
        return deque.isEmpty();
    }
}

public class Queues {
    public static void main(String args[]) {
        Stack st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("peek = " + st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
