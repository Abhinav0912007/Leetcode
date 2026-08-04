class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Find the middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;
        while (second != null) {
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        second = prev;

        // Merge using a dummy node
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode first = head;

        while (first != null || second != null) {
            if (first != null) {
                curr.next = first;
                curr = curr.next;
                first = first.next;
            }

            if (second != null) {
                curr.next = second;
                curr = curr.next;
                second = second.next;
            }
        }

        curr.next = null;
    }
}