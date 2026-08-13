/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this next = next; }
 * }
 */
class Solution {
    static ListNode solve(ListNode head , ListNode prev , ListNode curr){
        // basecase
        if(curr == null){
            return prev;
        }
        head = curr.next; 
        curr.next = prev;  
        prev = curr; 
        curr = head;    
        return solve(head , prev, curr);
    }
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode prev = null;
        ListNode curr = head;
        return solve(head, prev, curr);
    }
}