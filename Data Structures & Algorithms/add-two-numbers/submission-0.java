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
    int carrier = 0; 
    while(l1 != null || l2 != null || carrier != 0 ){
        int l1Val = l1 != null? l1.val : 0;
        int l2Val = l2 != null? l2.val : 0;

        int resultVal = l1Val + l2Val + carrier;
        int currentNode = resultVal % 10;
        current.val = currentNode;
        carrier = (resultVal - currentNode)/10;

        l1 = l1!= null? l1.next: null;
        l2 = l2 != null? l2.next: null;
        if(l1 != null || l2 != null || carrier != 0 ){
            current.next = new ListNode();
            current = current.next;
        }
    }
    return result;



        
    }
}
