class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='('){
                st.push(')');
            }
            else if(i=='{'){
                st.push('}');
            }
            else if(i=='['){
                st.push(']');
            }
            else{
                if(st.empty() || st.peek()!=i){
                    return false;
                }
                st.pop();
            }
        }
        return st.empty();
    }
}