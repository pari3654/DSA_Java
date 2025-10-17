import java.util.*;

public class Strings {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        // Pehla letter ko uppercase bana do
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        //  Baaki string traverse karo
        for (int i = 1; i < str.length(); i++) {

            // Agar space mila, toh next character ko uppercase karna hai
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // space add kar do
                i++; // next char pe jao
                sb.append(Character.toUpperCase(str.charAt(i))); // next letter ko capital karo
            } else {
                // Normal character as it is add kar do
                sb.append(str.charAt(i));
            }
        }

        // Final string return kar do
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "hi, i am shradha";
        System.out.println(toUpperCase(str)); //  Output: Hi, I Am Shradha
    }
}
