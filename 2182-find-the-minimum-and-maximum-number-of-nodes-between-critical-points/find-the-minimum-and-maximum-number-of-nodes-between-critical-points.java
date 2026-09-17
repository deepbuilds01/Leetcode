class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ArrayList<Integer> ans = new ArrayList<>();

        ListNode temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        if(count < 3 || head == null){
            return new int[]{-1, -1};
        }

        ListNode left = head;
        ListNode curr = head.next;
        ListNode right = curr.next;

        int index = 1;

        while(right != null){

            if(curr.val > left.val && curr.val > right.val){
                ans.add(index);
            }
            else if(curr.val < left.val && curr.val < right.val){
                ans.add(index);
            }

            index++;

            left = left.next;
            curr = curr.next;
            right = right.next;
        }

        // Need at least 2 critical points
        if(ans.size() < 2){
            return new int[]{-1, -1};
        }

        // Maximum distance
        int max = ans.get(ans.size() - 1) - ans.get(0);

        // Minimum distance
        int min = Integer.MAX_VALUE;

        for(int i = 1; i < ans.size(); i++){
            int distance = ans.get(i) - ans.get(i - 1);
            min = Math.min(min, distance);
        }

        return new int[]{min, max};
    }
}