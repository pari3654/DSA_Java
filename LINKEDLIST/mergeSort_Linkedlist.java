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

    // merge using dummy node
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if (l1 != null) temp.next = l1;
        else temp.next = l2;

        return dummy.next;
    }
}
