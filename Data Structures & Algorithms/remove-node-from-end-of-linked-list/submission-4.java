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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode counter = head;
        while(counter != null){
            counter = counter.next;
            length++;
        }

        int valueToRemove = length - n;

        int currposition = 0;
        ListNode prev = null;
        ListNode pointer = head;
        while(head != null){
            if(currposition == valueToRemove){
                if(prev == null) { 
                    head = head.next;
                    break;
                }
                else{
                    prev.next = pointer.next;
                     break;
                }
            }
            prev = pointer;
            pointer = pointer.next;
            currposition++;
        }
    return head;
 
    }
}
