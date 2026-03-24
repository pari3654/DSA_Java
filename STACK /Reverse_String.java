import java.util.*;

public class Stacks {

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx =0;
        // put all characters into stack 
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

       // stack se char remove krke stringbuilder mai daldo
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            char curr = s.pop(); //remove char
            result.append(curr); //add char to result
        }
        return result.toString();
    }

    public static void main(String args[]) {
       String str = "abc";
       String result =  reverseString(str);
       System.out.println(result);

    }
}
