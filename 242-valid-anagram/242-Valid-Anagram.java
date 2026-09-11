class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        if(Arrays.equals(t1, s1)){
            return true;
        }
        else return false;

    }
}






//////2nd approach

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         int[] arr=new int[26];
//         if(s.length()!=t.length()) return false;
//         for(int i=0; i<s.length(); i++){
//             arr[s.charAt(i)-'a']++;
//             arr[t.charAt(i)-'a']--;
//         }
//         for(int i=0; i<26; i++){
//             if(arr[i]!=0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }