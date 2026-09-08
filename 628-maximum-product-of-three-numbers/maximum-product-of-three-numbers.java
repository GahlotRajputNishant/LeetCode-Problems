class Solution {
    public int maximumProduct(int[] nums) {
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        int fmin=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int n:nums){
            if(n>=fmax){
                tmax=smax;
                smax=fmax;
                fmax=n;
            }
            else if(n>smax){
                tmax=smax;
                smax=n;
            }
            else if(n>tmax){
                tmax=n;
            }
            if(n<=fmin){
                smin=fmin;
                fmin=n;
            }
            else if(n<smin){
                smin=n;
            }
        }
        return Math.max(smax*fmax*tmax, fmax*fmin*smin);
    }
}