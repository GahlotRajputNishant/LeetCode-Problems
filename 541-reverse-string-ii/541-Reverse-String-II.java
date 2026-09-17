class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0; i<sb.length(); i+=k*2){
            int left=i;
            int right=Math.min(i+k-1, sb.length()-1);
            while(left<right){
                char temp= sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;
            }
        }
        return sb.toString();
    }
}








///////// 2nd approach




// class Solution {
//     public String reverseStr(String s, int k) {
//         char[] arr=s.toCharArray();
//         int srt=0;
//         for(int i=0; i<arr.length; i+=2*k){
//             srt=i;
//             int end=Math.min(i+k-1,arr.length-1);
//             reverse(srt,end,arr);
//         }
//         return String.valueOf(arr);
//     }
//     public void reverse(int srt,int end,char[] arr){
//         while(srt<end){
//             char temp=arr[srt];
//             arr[srt]=arr[end];
//             arr[end]=temp;
//             srt++;
//             end--;
//         }
//     }
// }