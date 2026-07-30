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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = result;

        int Carrier = 0;
        while(l1 != null || l2 != null || Carrier != 0){
            int l1CurrentValue = l1 != null? l1.val : 0;
            int l2CurrentValue = l2 != null? l2.val : 0;
            
            int FinalSum = l1CurrentValue + l2CurrentValue + Carrier;
            current.val = FinalSum % 10;
            Carrier = (FinalSum - current.val)/10;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

            if(l1 != null || l2 != null || Carrier != 0){
                current.next = new ListNode();
                current = current.next;
            }
        }
        return result;

  }
}
