import java.util.*;

public class Queue{
     static int arr[];
     static int size;
     static int rear;

    Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
    } 

public static boolean isEmpty() {
    return rear == -1;
}

public static void add(int data) {
    //check if queue is empty 
    if(rear == size-1) {
        System.out.println("queue is empty");
        return;
    }
  
  //add element 
  rear = rear+1;
  arr[rear] = data;
}

//REMOVE FUNCTION 
public static int remove() {
    if(isEmpty()){
        System.out.println("empty queue");
        return -1;
    }

    int front = arr[0]; //first element in arr is front 
    //remove element --> ek ek index peeche krdo
    for(int i =0; i<rear; i++) {
        arr[i] = arr[i+1]; 
    }
    rear = rear-1;
     return front;
}

//PEEK FUNCTION
public static  int peek() {
    if(isEmpty()) {
        System.out.println("empty queue");
        return -1;
    }
    return arr[0];
}

 public static void main(String args[]) {
       Queue q = new Queue(5);
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

   

    

    
