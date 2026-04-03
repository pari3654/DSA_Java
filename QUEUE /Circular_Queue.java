import java.util.*;

public class Queue{
     static int arr[];
     static int size;
     static int rear;
     static int front;

    Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    } 

public static boolean isEmpty() {
    return rear == -1 && front == -1;
}

//if queue is full
public static boolean isFull() {
    return (rear+1)% size == front;
}

//ADD FUNCTION 
public static void add(int data) {
    //check if queue is empty 
    if(isFull()) {
        System.out.println("queue is full");
        return;
    }

   // add first elemnt
   if(front == -1) {
    front = 0;
 }
  
  //add element 
  rear = (rear+1) % size;
  arr[rear] = data;
}


//REMOVE FUNCTION 
public static int remove() {
    if(isEmpty()){
        System.out.println("empty queue");
        return -1;
    }

   int result = arr[front]; // front ko store krlo

   if(rear == front) {
    rear = front = -1;
   } else {
    front = (front + 1) % size;
   }
   return result;
}


//PEEK FUNCTION
public static  int peek() {
    if(isEmpty()) {
        System.out.println("empty queue");
        return -1;
    }
    return arr[front];
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

   

    

    
