class Solution {
    public char findTheDifference(String s, String t) {
        int[] c=new int[26];
        for(int i=0; i<s.length(); i++){
            c[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            c[t.charAt(i)-'a']--;
            if(c[t.charAt(i)-'a']<0) return t.charAt(i);
        }
        return ' ';
    }
}



///////2nd approach


// class Solution {
//     public char findTheDifference(String s, String t) {
//         char ans=0;
//         for(char c:s.toCharArray()){
//             ans^=c;
//         }
//         for(char ch:t.toCharArray()){
//             ans^=ch;
//         }
//         return ans;
//     }
// }