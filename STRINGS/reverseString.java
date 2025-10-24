public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";

        // Efficient reversal using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
