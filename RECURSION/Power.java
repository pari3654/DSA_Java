import java.util.*;

public class Recursion {
  
  public static int Power(int x , int n) {
    // base case 
    if(n == 0){
      return 1;
    }
    // recursive case
    return x * Power(x, n-1);
  }

  public static void main(String args[]) {
    System.out.println(Power(2 , 10));  // Output: 1024
  }
}
