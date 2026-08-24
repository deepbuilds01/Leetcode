//++++++ method step by step
// 1. divide into 2 parts of the array 
// 2. reverse both part saparetly
// 3. final part reverse whole part

// class Solution {
//     public void rotate(int[] nums, int k) {
//         k = k % nums.length;
//         reverse(nums, 0, nums.length - k - 1);
//         reverse(nums, nums.length - k, nums.length - 1);
//         reverse(nums, 0, nums.length - 1);
//     }
//     static void reverse(int[] nums, int left, int right) {
//         while (left < right) {
//             int temp = nums[left];
//             nums[left] = nums[right];
//             nums[right] = temp;
//             left++;
//             right--;
//         }
//     }
// }
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}