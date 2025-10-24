import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        // Convert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check lengths
        if(str1.length() == str2.length()) {
            // Convert to char array and sort
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            // Compare
            if(Arrays.equals(str1Array, str2Array)) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
