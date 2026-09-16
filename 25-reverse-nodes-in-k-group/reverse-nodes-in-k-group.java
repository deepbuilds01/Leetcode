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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }

        if(k>count) return head;

        // hum first case solve karenge baki recursion dekh lega
        ListNode prev = null;
        ListNode curr = head;
        for(int i=0; i<k; i++){
            ListNode newnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newnode;
        }

        head.next = reverseKGroup(curr, k);
        return prev;
    }
}