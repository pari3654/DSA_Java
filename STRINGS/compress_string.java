import java.util.*;

public class Strings {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            int count = 1; 

            // if next character is same then increase the count 
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i)); // add curr character 

            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString(); // final compressed string 
    }

    public static void main(String args[]) {
        String str = "aaabbbcccd";
        System.out.println(compress(str));  // Output: a3b3c3d
    }
}
