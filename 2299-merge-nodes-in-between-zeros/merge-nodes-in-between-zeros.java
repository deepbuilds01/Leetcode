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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next ;
        ListNode prev = head;
        int sum = 0;
        while(temp.next!=null){
            if(temp.val!=0){
                sum = sum + temp.val;
                temp = temp.next;
            }else{ // temp.val == 0
                prev.val  = sum ;
                prev = prev.next;
                temp = temp.next;
                sum = 0;
            }
        }
        prev.val  = sum ;
        prev.next = null;
        return head;
    }
}