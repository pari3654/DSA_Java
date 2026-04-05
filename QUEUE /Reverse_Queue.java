import java.util.*;

public class Queues {
   public static void reverse( Queue<Integer> q ) {
      Stack<Integer> st = new Stack<>();

      while(!q.isEmpty()){
        st.push(q.remove()); //stack mai push or queue se remove
      }

      while(!st.isEmpty()){
        q.add(st.pop()); // stack se pop or queue mai add
      }
   }



    public static void main(String args[]){
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
