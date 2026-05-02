public class Main {

    public static void permute(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // loop for choosing each character
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            // "abcde" = "ab" + "de" c ko hata diya
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // recursive call
            permute(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permute(str, "");
    }
}
