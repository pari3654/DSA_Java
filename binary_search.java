import java.util.*;

public class Array {
 public static int binarySearch(int numbers[] , int key) {
    int start = 0, end = numbers.length-1;

    while(start <= end) {
        int mid =(start + end) / 2;

        //comparisons
        if(numbers[mid] == key ) {
            return mid ;
        }
        if (numbers[mid] < key) { // right
            start = mid+1;
        } else { //left
            end = mid-1;
        }
    }
    return -1; //key does not exist
 }
 

     public static void main(String args[]) {
        int numbers[] = {1, 2, 6, 10, 25};
        int key = 25;
        System.out.println(" index for key is  : " + binarySearch(numbers, key));
      
    }
}



