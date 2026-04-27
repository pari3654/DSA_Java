public class Main {

    public static void printBinary(int n, int last, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // always add '0'
        printBinary(n - 1, 0, str + "0");

        // add '1' only if last was not 1
        if (last == 0) {
            printBinary(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        printBinary(n, 0, "");
    }
}
