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
    public boolean hasCycle(ListNode head) {
HashSet<ListNode> var = new HashSet<>();

        ListNode curr = head;
        while(curr!=null){
            if(var.contains(curr)){
                return true;
            }
            var.add(curr);
            curr  = curr.next;
            
        
    }
    return false;
}
}