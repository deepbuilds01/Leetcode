// import java.util.HashMap;

class Solution {
    public int majorityElement(int[] arr) {
        int ans = 0;
        int freq = 0;
        for(int i=0; i<arr.length; i++){
            if(freq == 0){
                ans = arr[i];
            }
            if(arr[i]==ans){
                freq++;
            }else{
                freq--;
            }
        }
        return ans;
    }
}