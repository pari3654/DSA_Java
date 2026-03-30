import java.util.*;

public class Stacks {
  
    public static boolean isDuplicate(String str) {
        Stack<Character> st = new Stack<>();

        for(int i =0 ; i<str.length(); i++) {
            char ch = str.charAt(i);
            //closing
            if( ch== ')') {
                int count = 0;
                while(st.peek() != '(') {
                    st.pop();
                    count++;
                }
                if(count < 1) {
                    return true; // duplicate
                } else {
                    st.pop();  //opening pair
                }
            } else {
                //opening 
                st.push(ch);
            }
        }
        return false;
    }
  

    public static void main(String args[]) {
     String str1 = "((a+b))"; //true
     String str2 = "(a-b)"; //false
     System.out.println(isDuplicate(str2));

    }
}
