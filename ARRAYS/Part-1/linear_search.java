import java.util.*;

public class Array {
public static int linearSearch(int numbers[] , int key) {
    for ( int i=0; i<numbers.length; i++) {
    if(numbers[i] == key) {
        return i;
    }
}
return -1; // -1 means key does not exist
}

     public static void main(String ars[]) {
      int numbers[] = {2, 4, 6 ,8 ,10, 12 , 14 , 16};
      int key = 10;
    
    //returning the index
    int index = linearSearch(numbers , key);
    if(index == -1) {
        System.out.println("not found");
    }
    System.out.println("key is at index :" + index);

    }
}
