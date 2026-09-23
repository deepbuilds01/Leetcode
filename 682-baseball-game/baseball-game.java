class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                st.pop();
            }
            else if (operations[i].equals("D")) {
                st.push(st.peek() * 2);
            }
            else if (operations[i].equals("+")) {
                int a = st.pop();
                int b = st.peek();

                st.push(a);
                st.push(a + b);
            }
            else {
                int x = Integer.parseInt(operations[i]);
                st.push(x);
            }
        }

        int sum = 0;

        while (!st.empty()) {
            sum += st.pop();
        }

        return sum;
    }
}