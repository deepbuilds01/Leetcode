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
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] ans = new ListNode[k] ;

        int len = 0;
        ListNode temp = head ;
        while(temp != null){
            temp = temp.next;
            len++;
        }

        int NoNodes = len/k;
        int remainder = len%k;

        ListNode prev = null;
        ListNode curr = head;

        for(int parts=0; parts<k; parts++){
            if(curr == null){
                ans[parts] = null;
                continue;
            }

            ans[parts] = curr;
            // System.out.print(NoNodes);
            // System.out.print(remainder);
            int width = NoNodes + (remainder > 0 ? 1 : 0);
            // System.out.print(width);
            remainder--;

            for(int i=1; i<=width; i++){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            prev = null;
        }
        return ans;
    }
}
