// class Solution {
//     public long countBadPairs(int[] nums) {
//         int count=0;
//         for(int i=0; i<nums.length-1; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(j-i!=nums[j]-nums[i]) count++;
//             }
//         }
//         return count;
//     }
// }/////// This approch is brute force and this solution gives Time Limit Exceeded.










class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long goodPairs = 0;
        
        // Map to store frequency of (index - nums[index])
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            // Key transformation: nums[i] - i == nums[j] - j 
            // becomes equivalent to same values of (nums[k] - k)
            int val = nums[i] - i;
            
            // Get count of previously seen same values
            int count = map.getOrDefault(val, 0);
            goodPairs += count;
            
            // Update frequency map
            map.put(val, count + 1);
        }
        
        // Total pairs minus good pairs gives bad pairs
        long totalPairs = (long) n * (n - 1) / 2;
        
        return totalPairs - goodPairs;
    }
}