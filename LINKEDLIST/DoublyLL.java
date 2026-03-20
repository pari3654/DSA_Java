import java.util.*;

public class DoublyLL {
 
  //basic structure
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add first 
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        // empty list 
        if(head == null) {
            head = tail = newNode;
            return ;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

  //remove first
  public int removeFirst() {
    if(head == null) {
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
    }

//single node
    if( size == 1){
        int val = head.data;
        head = tail = null;
        size--;
        return val;
    }

    int val = head.data;
    head = head.next;
    head.prev = null;
    size--;
    return val;
  }

    //print
    public void print () {
        Node temp = head;
    
        while(temp != null) {
            System.out.print(temp.data + " <->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String args[]) {
       DoublyLL  DL  = new DoublyLL();
       DL.addFirst(3);
       DL.addFirst(2);
       DL.addFirst(5);

       DL.print();
       System.out.println(DL.size);

       DL.removeFirst();
       DL.print();
       System.out.println(DL.size);
    }
}
