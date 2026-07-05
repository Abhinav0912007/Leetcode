/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t1= d1;
        ListNode t2= d2;
        int len= 0;

        while(temp!=null){
            temp = temp.next;
            len++;
        }
        temp= head;
        for(int i = 1; i<=len ; i++){
            if(i%2!=0){
                t1.next = temp;
                t1=t1.next;

            }
            else{
                t2.next = temp;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        t2.next = null;
        t1.next = d2.next;
        return d1.next;
    }
}