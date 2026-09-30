class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Convert keys to array
        Integer[] arr = map.keySet().toArray(new Integer[0]);

        // Sort according to frequency
        Arrays.sort(arr, (a, b) -> map.get(b) - map.get(a));
    
        // Answer
        int[] ans = new int[k];

        for(int i = 0; i < k; i++) {
            ans[i] = arr[i];
        }

        return ans;
    }
}