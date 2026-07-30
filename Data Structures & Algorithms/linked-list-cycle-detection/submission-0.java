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
    public boolean hasCycle(ListNode head) {
        ListNode fastP = head;
        ListNode slowP = head;

        while(fastP != null && fastP.next != null){
            fastP = fastP.next.next;
            slowP = slowP.next;

            if(fastP == slowP) return true;
        }
        return false;
        
    }
}
