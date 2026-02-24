import java.util.*;

public class Linkedlist {
 public static class Node {
    int data;
    Node next;
    
    //constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
 }

 public static Node head;
 public static Node tail;

//size of linkedlist-
 public static int size;

 
 //insert at start
 public void addStart(int data) {
    // create new node 
    Node newNode = new Node(data);
    size++;
    if( head == null) {
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
 }

// insert at last 
public void addLast(int data) {
   Node newNode = new Node(data);
   size++;
    if( head == null) {
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;
}

//insert at middle
public void addMiddle(int idx , int data) {
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0 ;

    while ( i < idx-1) {
        temp = temp.next;
        i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;
}

// print 
public void print() {
    Node temp  = head;
    while( temp != null) {
        System.out.print(temp.data + "->" );
        temp = temp.next;
    }
    System.out.println("null");
}

//REMOVE first 
public int removefirst() {
//base case 
if(size ==0 ) {
    System.out.println("ll is empty");
    return Integer.MIN_VALUE;
} else if (size == 1) {
    int val = head.data;
    head = tail = null;
    size = 0;
    return val;
} // remove 
   int val = head.data;
    head = head.next;
    size--;
    return val;
}

//REMOVE LAST
public int removeLast() {
if(size ==0 ) {
    System.out.println("ll is empty");
    return Integer.MIN_VALUE;
} else if (size == 1) {
    int val = head.data;
    head = tail = null;
    size = 0;
    return val;
} 

//prev : i = size-2
Node prev = head;
for(int i=0; i<size-2; i++) {
    prev = prev.next;
}

 int val = prev.next.data; // tail.data 
 prev.next = null;
 tail = prev;
 size--; 
 return val;
}


public static void main(String args[]) {
  Linkedlist l1 = new Linkedlist();
  l1.addStart(2);
  l1.addStart(1);
  l1.addLast (4);
  l1.addLast(5);
  l1.addMiddle(2 , 3);

  l1.print();

  l1.removefirst();
  l1.print();

  l1.removeLast();
  l1.print();
  System.out.println(l1.size);
}

}
