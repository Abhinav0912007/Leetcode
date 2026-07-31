/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();

        ListNode curr = head;

        while (curr != null) {
            if (map.containsKey(curr)) {
                return curr;
            }
            map.put(curr, 1);
            curr = curr.next;
        }

        return null;
    }
}