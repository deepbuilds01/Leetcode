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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        int i = 1; 
        while(i<k){
            left = left.next;
            i++;
        }
        ListNode right = head;
        ListNode temp = left.next;
        while(temp!=null){
            temp = temp.next;
            right = right.next;
        }
        int store = left.val;
        left.val = right.val;
        right.val = store;
        return head;
    }
}