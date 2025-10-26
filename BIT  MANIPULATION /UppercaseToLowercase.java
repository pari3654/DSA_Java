public class Solution {
    public static void main(String[] args) {
        System.out.println("Uppercase to Lowercase using bits:");

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            char lower = (char)(ch | ' '); // OR with space sets 6th bit
            System.out.print(lower + " ");
        }
    }
}
