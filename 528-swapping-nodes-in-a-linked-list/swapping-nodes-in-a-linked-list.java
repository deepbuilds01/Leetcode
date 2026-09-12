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
        if(head==null){
            return null;
        }

        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }

        ListNode prev = head ;
        for(int i=0; i<k-1; i++){
            prev = prev.next;
        }
        // System.out.print(prev.val);

        temp= head;
        for(int i=0; i<count-k; i++){
            temp = temp.next;
        }
        // System.out.print(temp.val);

        int  change = temp.val;
        temp.val = prev.val;
        prev.val = change;
        return head;
    }
}