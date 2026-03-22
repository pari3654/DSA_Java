import java.util.*;

public class Stacks {
    

    public static void main(String args[]) {
        // Stack s = new Stack();
        Stack<Integer> s = new Stack<>(); // java collection framework
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
