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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        ListNode head = new ListNode();
        ListNode r = head;

        while(list1 != null || list2 != null){
            int valList1 = list1 == null ? Integer.MAX_VALUE : list1.val;
            int valList2 = list2 == null ? Integer.MAX_VALUE : list2.val;

            if(valList1 < valList2){
                r.next = list1;
                list1 = list1.next;
            }
            else{
                r.next = list2;
                list2 = list2.next;
            }
            r = r.next;
        }
        return head.next;
    }
}