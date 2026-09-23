class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        Stack<Character> st1 = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                if(!st1.empty())
                    st1.pop();
            }else{
                st1.push(ch);
            }
        }

        while(!st1.empty()){
            s1.append(st1.pop());
        }
        System.out.print(s1);



        StringBuilder s2 = new StringBuilder();
        Stack<Character> st2 = new Stack<>();

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(ch == '#'){
                if(!st2.empty()){
                    st2.pop();
                }
            }else{
                st2.push(ch);
            }
        }
        while(!st2.empty()){
            s2.append(st2.pop());
        }

        return s1.toString().equals(s2.toString());

        
    
    }
}