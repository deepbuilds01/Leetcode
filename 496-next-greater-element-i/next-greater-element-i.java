class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] arr = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    int k = j;
                    while(k<nums2.length && nums1[i]>=nums2[k] ){
                        k++;
                    }
                    if(k==nums2.length){
                        arr[i] = -1;
                    }else{
                        arr[i] = nums2[k];
                    }
                    break;
                }
            }
        }
        return arr;
    }
}