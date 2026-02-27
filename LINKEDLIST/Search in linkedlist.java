//Search in a linkedlist 
public int Search(int key) {
    Node temp = head;
    int i = 0;

    while( temp != null) {
        if ( temp.data == key ) {
            return i; 
        }
        temp = temp.next;
        i++;
    } 
        return -1;
    
}


