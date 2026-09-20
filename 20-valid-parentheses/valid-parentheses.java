class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<>(); 
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                ans.push(ch);
            }else{
                if(ans.isEmpty()){
                    return false;
                }
                char ansch = ans.peek();
                if(ch == ')' && ansch == '(' ||
                   ch == ']' && ansch == '[' ||
                   ch == '}' && ansch == '{' ){
                    ans.pop();
                }else{
                    return false;
                }
            }
        }
        return ans.isEmpty();
    }
}