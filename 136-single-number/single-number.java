class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> list = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            list.put(nums[i], list.getOrDefault(nums[i], 0) + 1);
        }

        for(int key : list.keySet()){
            if(list.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}