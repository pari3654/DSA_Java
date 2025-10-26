public class XORSwap {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;  // b now becomes original a
        a = a ^ b;  // a now becomes original b

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
