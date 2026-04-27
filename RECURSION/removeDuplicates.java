import java.util.HashSet;

public class Main {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, HashSet<Character> set) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        if (set.contains(currChar)) {
            // duplicate → skip
            removeDuplicates(str, idx + 1, newStr, set);
        } else {
            // first time → add
            set.add(currChar);
            newStr.append(currChar);
            removeDuplicates(str, idx + 1, newStr, set);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new HashSet<>());
    }
}
