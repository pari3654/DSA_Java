class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) {
            return true;
        }

        // 1. find middle
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. reverse second half
        ListNode prev = null;
        ListNode curr = slow;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3. compare both halves
        ListNode first = head;
        ListNode second = prev;

        while(second != null) {
            if(first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }
}
