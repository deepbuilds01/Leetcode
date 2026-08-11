class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; 
        int j = 0; 
        int k = 0;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                if(j==nums.length-1){
                    nums[k] = nums[i];
                }
                j++;
            }
            else{
                nums[k] = nums[i];
                k++;
                i=j;
            }
        }
        // nums[k] = nums[i];
        // k++;
        return k+1;
    }
}