import java.util.*;

public class Array {
    public static void main (String args[]) {
        // array creation
        int marks[] = new int[100];
      // input in array
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

    // output in array  
    System.out.println("phy : " + marks[0] );
     System.out.println("Chem : " + marks[1] );
      System.out.println("Maths : " + marks[2] );
   
   //updation in array
   marks[1] = 50;
    System.out.println("Chem : " + marks[1] );

    marks[2] = marks[2] + 5;
    System.out.println("Maths : " + marks[2] );
  
  // to calcaluate percentage 
  
    int percentage = (marks[0] + marks[1] + marks[2]) / 3;
    System.out.println("perctange = " + percentage + "%");

    }
}
