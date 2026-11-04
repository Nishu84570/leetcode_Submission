class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char sym = s.charAt(i);

            if(st.isEmpty()){
                st.push(sym);
            }

            else if(st.peek() == '('){
                if(sym == ')'){
                    st.pop();
                }

                else{
                    st.push(sym);
                }
            }

            else if(st.peek() == '{'){
                if(sym == '}'){
                    st.pop();
                }

                else{
                    st.push(sym);
                }
            }

            else if(st.peek() == '['){
                if(sym == ']'){
                    st.pop();
                }

                else{
                    st.push(sym);
                }
            }
        }

        if(st.isEmpty()){
            return true;
        }

        return false;
    }
}