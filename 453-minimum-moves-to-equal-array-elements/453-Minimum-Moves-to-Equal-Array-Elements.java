class Solution {
    public int minMoves(int[] nums) {
        int d=0;
        int min=nums[0];
        for(int i=0; i<nums.length; i++){
            min=Math.min(nums[i], min);
        }
        for(int i=0; i<nums.length; i++){
            d+=nums[i]-min;
        }
        return d;
    }
}