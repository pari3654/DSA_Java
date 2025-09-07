import java.util.*;

public class Array {
 public static int trappedRainwater (int height[]) {
    int n = height.length;
    
    //calculate left max boundary - array
    int leftMax[] = new int[n];
      leftMax[0] = height[0];
    for ( int i=1; i<n; i++) {
        leftMax[i] = Math.max(height[i] , leftMax[i-1]); //curr height vs previous max height 
    }

    //calculate right max boundary - array 
    int rightMax[] = new int[n];
    rightMax[n-1] = height[n-1];
     for ( int i=n-2; i>=0; i--) {
        rightMax[i] = Math.max(height[i] , rightMax[i+1]); //curr height vs previous max height 
    }

    //loop 
    int trappedWater = 0;

    for ( int i =0; i<n; i++ ) {
          //waterlevel = min ( leftmax bound , rightmaxbound)

        int waterlevel =  Math.min(leftMax[i] ,  rightMax[i]);
         //trapped water = waterlevel - height[i]
        trappedWater += waterlevel - height[i];

    }
   return trappedWater;
 }

     public static void main(String args[]) {
        int height[] = {4, 2 , 0 , 6 , 3 , 2 , 5}; 
        System.out.println( trappedRainwater(height)); 
    }
}






