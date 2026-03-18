class Solution {

    public void reorderList(ListNode head) {

        // Edge case: 0 ya 1 node → kuch karna hi nahi
        if (head == null || head.next == null) return;

        //  STEP 1: Find Middle using slow-fast pointer
        ListNode slow = head;
        ListNode fast = head;

        // fast 2 step, slow 1 step → slow middle pe pahuchega
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //  STEP 2: Reverse second half
        ListNode curr = slow.next; // mid ke baad wali list
        slow.next = null; // list ko break kar diya

        ListNode prev = null;
        ListNode next;

        // standard reverse linked list
        while (curr != null) {
            next = curr.next;   // next node store
            curr.next = prev;   // reverse link
            prev = curr;        // prev aage badhao
            curr = next;        // curr aage badhao
        }

        // ab prev = reversed list ka head hai

        //  STEP 3: Zig-Zag Merge
        ListNode left = head;   // first half
        ListNode right = prev;  // reversed second half

        // alternate merge: left → right → left → right
        while (right != null) {

            ListNode nextL = left.next;   // next left node
            ListNode nextR = right.next;  // next right node

            left.next = right;   // left ke baad right lagao
            right.next = nextL;  // right ke baad next left

            // pointers aage badhao
            left = nextL;
            right = nextR;
        }
    }
}
