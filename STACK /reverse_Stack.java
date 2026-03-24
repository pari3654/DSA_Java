import java.util.*;

public class Stacks {

    // push at bottom using recursion
    public static void pushAtBottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();          // remove element from top 
        pushAtBottom(s, data);     // recursive call
        s.push(top);               // vapas element daldo
    }


   public static void reverseStack(Stack<Integer> s) {
     if(s.isEmpty()) {
        return;
     }

     int top = s.pop(); // top se element remove
     reverseStack(s); // reverse call
     pushAtBottom(s , top); // push elemnt bottom pr

   }

   public static void printStack(Stack<Integer> s) {
     while(!s.isEmpty()) {
        System.out.println(s.pop());
     }
   }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       //3 , 2, 1

        reverseStack(s);
        printStack(s); // 1,2,3


    }
}
