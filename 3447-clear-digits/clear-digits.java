class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char c:st){
            ans.append(c);
        }
        return ans.toString();
    }
}