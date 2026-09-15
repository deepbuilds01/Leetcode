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
    public ListNode partition(ListNode head, int x) {
        ListNode smallerHead = new ListNode(-1);
        ListNode smallerTail = smallerHead;

        ListNode greaterHead = new ListNode(-1);
        ListNode greaterTail = greaterHead;
        
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                ListNode newnode = new ListNode(temp.val);
                smallerTail.next = newnode;
                smallerTail = smallerTail.next;
            }
            else{
                ListNode newnode = new ListNode(temp.val);
                greaterTail.next = newnode;
                greaterTail = greaterTail.next;
            }
            temp = temp.next;
        }
        smallerTail.next = greaterHead.next;
        greaterTail.next = null;
        return smallerHead.next;

        
    }
}