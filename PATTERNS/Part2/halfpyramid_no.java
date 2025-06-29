public class Basics {
  public static void inverted_no(int n ){
    for (int i=1; i<=n; i++) {
      //inner- numbers
      for(int j=1; j<=n-i+1; j++) {
        System.out.print(j + " ");
      }
       System.out.println();
    }
    
  }
   
    public static void main(String args[]) {
     inverted_no(5);
    }
}
