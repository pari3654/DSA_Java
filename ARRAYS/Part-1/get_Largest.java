import java.util.*;

public class Array {
 public static int getLargest(int numbers[]) {
    int largest = Integer.MIN_VALUE;// -infinity

    for(int i=0; i<numbers.length; i++) {
     if (largest < numbers[i]) {
        largest = numbers[i];
     }
    }
    return largest;
 }

     public static void main(String ars[]) {
        int numbers[] = {1, 2, 6, 10, 5};
        System.out.println(" largest value is : " + getLargest(numbers));
      
    }
}


