class Solution {

    public ListNode sortList(ListNode head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // 1. find mid
        ListNode mid = getMid(head);

        // 2. split
        ListNode rightHead = mid.next;
        mid.next = null;

        // 3. recursion
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        // 4. merge
        return merge(left, right);
    }

    // find mid (slow-fast)
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //merge function 
     private ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }


        if (l1 != null) temp.next = l1;
        else temp.next = l2;

        return dummy.next;
    }
}
