class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int idx=0;
        for(int i=citations.length-1; i>=0; i--){
            if(citations[i]>idx) idx++;
            else break;
        }
        return idx;
    }
}











//////// 2nd Approach


// class Solution {
//     public int hIndex(int[] citations) {
//         Arrays.sort(citations);
//         int low=0, high=citations.length-1, ans=0, mid;
//         while(low<=high){
//             mid=low+(high-low)/2;
//             if(citations[mid]>=citations.length-mid){
//                 ans=citations.length-mid;
//                 high=mid-1;
//             }
//             else{
//                 low=mid+1;
//             }
//         }
//         return ans;
//     }
// }