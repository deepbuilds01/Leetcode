class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int i=0; 
        while(i<nums.length){
            if(nums[i]==1){
                count++;
                i++;
            }else if(nums[i]!=1){ 
                max = Math.max(max, count);
                count = 0;
                i++;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}