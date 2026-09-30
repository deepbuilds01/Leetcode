class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int oldFreq = map.get(nums[i]);
                map.put(nums[i], oldFreq + 1);
            } 
            else {
                map.put(nums[i], 1);
            }
        }

        
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

      
        for(int key : map.keySet()) {
            pq.add(key);
            
            if(pq.size() > k) {
                pq.poll();
            }
        }

    
        int[] ans = new int[k];

        for(int i = k - 1; i >= 0; i--) {
            ans[i] = pq.poll();
        }

        return ans;
    }
}
