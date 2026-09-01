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

        ArrayList<ListNode> ans = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            ans.add(temp);
            temp = temp.next;
        }

        int left = k - 1;
        int right = ans.size() - k;

        // Swap nodes
        ListNode tmp = ans.get(left);
        ans.set(left, ans.get(right));
        ans.set(right, tmp);

        // Reconnect nodes
        int i = 0;

        while (i < ans.size() - 1) {
            ans.get(i).next = ans.get(i + 1);
            i++;
        }

        ans.get(ans.size() - 1).next = null;

        return ans.get(0);
    }
}