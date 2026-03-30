import java.util.*;

public class Stacks {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Next Smaller Right 
        Stack<Integer> st = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) { // ✅ fixed here
                st.pop();
            }
            if(st.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = st.peek();
            }
            st.push(i);
        }
     
        // Next Smaller Left
        st = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = st.peek();
            }
            st.push(i);
        }
    
        // calculate Area 
        for(int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;

            maxArea = Math.max(currArea, maxArea);
        }
     
        System.out.println("max Area = " + maxArea);
    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 6, 2, 3}; // heights in histogram
        maxArea(arr);
    }
}
