import java.util.*;

public class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue{
     static Node head = null;
     static Node tail = null;

    

public static boolean isEmpty() {
    return head == null && tail == null;
}

//ADD FUNCTION 
public static void add (int data) {
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;
}

//REMOVE FUNCTION 
public static int remove() {
    if(isEmpty()){
        System.out.println("empty queue");
        return -1;
    }

   int front = head.data; // front ko store krlo
  
   if(tail == head) {  //single element
    tail = head = null;
   } else {
    head = head.next;
   }
   return front;
}


//PEEK FUNCTION
public static  int peek() {
    if(isEmpty()) {
        System.out.println("empty queue");
        return -1;
    }
    return head.data;
}

 public static void main(String args[]) {
       Queue q = new Queue();
       q.add(1);
       q.add(2);
       q.add(3);
      
      
      //jb tk queue empty nhi ho jata hai usko peek krte jao or 
       while(!q.isEmpty()) {
          System.out.println(q.peek());
          q.remove();
       }
    }
}


   

    

    
