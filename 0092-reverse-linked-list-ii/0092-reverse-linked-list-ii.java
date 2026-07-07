class Solution {

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == right) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode temp = dummy;

        for (int i = 1; i < left; i++) {
            temp = temp.next;
        }

        ListNode tail1 = temp;
        ListNode head2 = temp.next;

        temp = head2;
        for (int i = left; i < right; i++) {
            temp = temp.next;
        }

        ListNode tail2 = temp;
        ListNode head3 = tail2.next;

        tail1.next = null;
        tail2.next = null;

        ListNode newHead = reverse(head2);

        tail1.next = newHead;
        head2.next = head3;

        return dummy.next;
    }
}