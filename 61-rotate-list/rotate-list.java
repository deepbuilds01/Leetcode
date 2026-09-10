class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        // 1. Edge case
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // 2. Find length and tail
        int count = 1;
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        // 3. Avoid unnecessary rotations
        k = k % count;

        if (k == 0) {
            return head;
        }

        // 4. Make the list circular
        temp.next = head;

        // 5. Find the new tail
        int steps = count - k;
        ListNode newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // 6. New head is after new tail
        ListNode newHead = newTail.next;

        // 7. Break the circle
        newTail.next = null;

        return newHead;
    }
}