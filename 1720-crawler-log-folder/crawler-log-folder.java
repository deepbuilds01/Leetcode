class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();

        for(int i=0; i<logs.length; i++){
            if(logs[i].equals("./")){
                continue;
            }else if(logs[i].equals("../")){
                if(!st.empty())
                    st.pop();
            }else{
                st.push(logs[i]);
            }
        }

        System.out.print(st);

        int count = 0;
        while(!st.empty()){
            count++;
            st.pop();
        }
        return count;
    }
}