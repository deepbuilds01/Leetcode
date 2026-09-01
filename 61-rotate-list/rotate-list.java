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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;

        int count = 1;
        ListNode temp = head;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        k = k % count;

        if (k == 0) {
            return head;
        }
    

        temp.next = head;
        for(int i = 0; i < count-k; i++){
            temp = temp.next;
        }
        ListNode prev = temp;
        ListNode newhead = temp.next;
        prev.next = null;
        return newhead;
    }
}