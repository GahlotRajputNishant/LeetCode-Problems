class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length(), count=0, j=n-1;
        while(j>=0 && s.charAt(j)==' '){
            j--;
        }
        while(j>=0 && s.charAt(j)!=' '){
            count++;
            j--;   
        }
        return count;
    }
}




// class Solution{
//     public int lengthOfLastWord(String s){
//         s=s.trim();
//         int ls=s.lastIndexOf(' ');
//         return s.length()-ls-1;
//     }
// }