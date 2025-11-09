import java.util.*;

public class Recursion{

public static int firstOCcurence(int arr[] , int key , int i) {
 //base case 
 if ( i == arr.length){
   return -1;
 }
   if (arr[i] == key) {
    return i;
   }

   return firstOCcurence(arr , key , i+1);
}

public static void main(String args[]) {
    int arr[] = {3,6,7,8,9,5,6,7,5};
    System.out.println(firstOCcurence(arr , 5 , 0));      
     }
}



