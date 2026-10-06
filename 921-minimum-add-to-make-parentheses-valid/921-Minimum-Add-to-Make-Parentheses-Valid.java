// class Solution {
//     public int minAddToMakeValid(String s) {
//         Stack<Character> st=new Stack<>();
//         int open=0, close=0;
//         for(char c:s.toCharArray()){
//             if(c=='('){
//                 st.push(c);
//                 open++;
//             }
//             else{
//                 if(!st.isEmpty() && st.peek()=='('){
//                     st.pop();
//                     open--;
//                 }
//                 else{
//                     close++;
//                 }
//             }
//         }
//         return open+close;
//     }
// }




// ///////// 2nd approach 


class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int close=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                open++;
            }
            else{
                if(open>0){
                    open--;
                }
                else close++;
            }
        }
        return close+open;
    }
}