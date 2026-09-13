class Solution {
    public String removeTrailingZeros(String num) {
        int n=num.length();
        int j=0;
        for(int i=n-1; i>=0; i--){
            char c=num.charAt(i);
            if(c!='0'){
                j=i;
                break;
            }
        }
        return num.substring(0, j+1);
    }
}





////////// 2nd Approach




// class Solution {
//     public String removeTrailingZeros(String num) {
//         StringBuilder sb=new StringBuilder(num);
//         int i=sb.length()-1;
//         while(i>=0&& sb.charAt(i)=='0'){
//             sb.deleteCharAt(i);
//             i--;
//         }
//         return sb.toString();
//     }
// }