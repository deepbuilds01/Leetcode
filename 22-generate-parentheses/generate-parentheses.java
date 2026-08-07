class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("", 0, 0, n, ans);
        return ans;
    }
    static void solve(String str, int open, int close, int n,
                      List<String> ans) {
        // Base case
        if (str.length() == 2 * n) {
            ans.add(str);
            return;
        }
        // Add opening bracket
        if (open < n) {
            solve(str + "(", open + 1, close, n, ans);
        }
        // Add closing bracket
        if (close < open) {
            solve(str + ")", open, close + 1, n, ans);
        }
    }
}