class Solution {
    public int[] dailyTemperatures(int[] temp){
        int []arr = new int[temp.length];
        arr[arr.length-1] = 0;

        Stack<Integer> st = new Stack<>();
        st.push(temp.length-1);

        for(int i=temp.length-2; i>=0; i--){
            
            while(!st.empty() && temp[st.peek()]<=temp[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i] = 0;
            }else{
                arr[i] = st.peek()-i;
            }
            st.push(i);
        }
        return arr;
    }
}