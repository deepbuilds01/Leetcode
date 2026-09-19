class Solution {
    public boolean isValid(String s) {

        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                ans.append(ch);
            }else{
                if(ans.length()==0){
                    return false;
                }
                char last = ans.charAt(ans.length()-1);
                if(last == '(' && ch == ')' ||
                last == '{' && ch == '}' ||
                last == '[' && ch == ']' ) {
                    ans.deleteCharAt(ans.length()-1);
                }else{
                    return false;
                }
            }
        }
         return ans.length() == 0;


    }
}