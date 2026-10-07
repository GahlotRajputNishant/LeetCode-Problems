class Solution {
    private static final int M=1_000_000_000+7;
    public int rearrangeSticks(int n, int k) {
        int[][] dp=new int[n+1][k+1];
        dp[1][1]=1;
        for(int i=2; i<=n; i++){
            for(int j=1; j<=i && j<=k; j++){
                long res=i-1;
                res=(res* dp[i-1][j])%M;
                res=(res+dp[i-1][j-1])%M;
                dp[i][j]=(int)res;
            }
        }
        return dp[n][k];
    }
}