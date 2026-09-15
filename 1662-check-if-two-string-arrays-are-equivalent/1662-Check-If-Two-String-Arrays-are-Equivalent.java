// class Solution {
//     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//         StringBuilder s1=new StringBuilder();
//         StringBuilder s2=new StringBuilder();
//         for(int i=0; i<word1.length;i++){
//             for(int j=0; j<word1[i].length(); j++){
//                 s1.append(word1[i].charAt(j));
//             }
//         }
//         for(int i=0; i<word2.length;i++){
//             for(int j=0; j<word2[i].length(); j++){
//                 s2.append(word2[i].charAt(j));
//             }
//         }
//         if(s1.length()!=s2.length()) return false;
//         else{
//             int j=0;
//             for(int i=0; i<s1.length(); i++){
//                 if(s1.charAt(i)==s2.charAt(j)){
//                     j++;
//                 }
//                 else{
//                     return false;
//                 }
//             }
//             return true;
//         }
//     }
// }




/////////// 2nd approach



class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0; i<word1.length;i++){
            s1.append(word1[i]);
        }
        for(int i=0; i<word2.length;i++){
            s2.append(word2[i]);
        }
        String st1=s1.toString();
        String st2=s2.toString();
        if(st1.equals(st2)) return true;
        else{
            return false;
        }
    }
}