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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> reverseStack = new Stack<>();
        while(head != null){
            reverseStack.push(head);
            head = head.next;
        }
        ListNode head2 = reverseStack.isEmpty() ? null : reverseStack.peek();
        while(!reverseStack.isEmpty()){
            ListNode lastNode = reverseStack.pop();
            if(!reverseStack.isEmpty())
            {
                lastNode.next = reverseStack.peek();

            }
            else {
                lastNode.next = null;
            }
        }
        return head2;
    }
}
