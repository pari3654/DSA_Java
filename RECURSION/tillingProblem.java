import java.util.*;

public class Recursion {
 public static int tilingProblem(int n ) { // 2 x n (floor size)
 //base case 
 if ( n == 0 || n == 1) {
  return 1;
 }
  //verical Choice
  int fnm1 = tilingProblem(n-1);
  //horizontal Choice
  int fnm2 = tilingProblem(n-2);
  //total ways 
  int totalWays = fnm1 + fnm2;
  return totalWays;
 } 

  public static void main(String args[]) {
    System.out.println( tilingProblem(3));
  }
}
