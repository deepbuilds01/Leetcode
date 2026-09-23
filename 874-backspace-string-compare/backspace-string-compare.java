class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                if(s1.length()!=0)
                    s1.deleteCharAt(s1.length()-1);
            }else{
                s1.append(ch);
            }
        }
        // System.out.print(s1);

        StringBuilder s2 = new StringBuilder();

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(ch == '#'){
                if(s2.length()!=0){
                    s2.deleteCharAt(s2.length()-1);
                }
            }else{
                s2.append(ch);
                
            }
        }
         

        return s1.toString().equals(s2.toString());

        
    
    }
}