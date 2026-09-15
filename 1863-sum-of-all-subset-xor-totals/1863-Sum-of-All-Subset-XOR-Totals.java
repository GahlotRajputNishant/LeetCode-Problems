class Solution {
    public int subsetXORSum(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            k|=nums[i];
        }
        return k*(1<<(nums.length-1));
    }
}