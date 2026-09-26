class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        for(int i=0; i<n; i++){
            long sum=0;
            boolean[] d=new boolean[k];
            for(int j=i; j<n; j++){
                sum+=nums[j];
                int value=((nums[j]%k)+k)%k;
                int dValue=(2*value)%k;
                d[dValue]=true;
                int remainder=(int)(((sum%k)+k)%k);
                if(remainder==0){
                    ans=Math.max(ans, j-i+1);
                }
                else if(d[remainder]){
                    ans=Math.max(ans, j-i+1);
                }
            }
        }
        return ans;
    }
}