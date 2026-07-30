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
    public void reorderList(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null  && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode secondPart = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = secondPart;
        while(curr != null){
           ListNode tmp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = tmp;
        }


        ListNode second = prev;
        ListNode first = head;
        while (second != null ){
            ListNode firstExtr = first.next;
            ListNode secondExtr = second.next;

            first.next = second;
            first.next.next = firstExtr;

            first = firstExtr;
            second = secondExtr;
            
        
        }




        

    }
}
