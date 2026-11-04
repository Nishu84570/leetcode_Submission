class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                int a = st.peek();
                st.pop();

                int b = st.peek();
                st.pop();

                int c = a + b;
                st.push(c);
            }

            else if(tokens[i].equals("*")){
                int a = st.peek();
                st.pop();

                int b = st.peek();
                st.pop();

                int c = a * b;
                st.push(c);
            }

            else if(tokens[i].equals("-")){
                int a = st.peek();
                st.pop();

                int b = st.peek();
                st.pop();

                int c = b - a;
                st.push(c);
            }

            else if(tokens[i].equals("/")){
                int a = st.peek();
                st.pop();

                int b = st.peek();
                st.pop();

                int c = b / a;
                st.push(c);
            }

            else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }

        return st.peek();
    }
}