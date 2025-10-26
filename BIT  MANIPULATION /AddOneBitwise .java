/*
 
 * Question:
  Add 1 to a given integer without using the '+' operator, using bit manipulation.
 
 * Concept:

 Jab hum 1 add karte hain, toh carry propagate hota hai:
 Agar bit 0 hai → 0 + 1 = 1 (carry 0)
 Agar bit 1 hai → 1 + 1 = 0 (carry 1)

Bitwise trick:
-n ya ~n + 1 ka use 2’s complement me hota hai.
Add 1: n + 1 = -~n
 */

public class AddOneBitwise {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(x + " + " + 1 + " is " + -~n);

        n = -4;
        System.out.println(x + " + " + 1 + " is " + -~n);

        n = 0;
        System.out.println(x + " + " + 1 + " is " + -~n);
    }
}
