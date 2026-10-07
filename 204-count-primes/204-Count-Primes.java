class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        int count=n-2;
        byte[] s=new byte[n];   
        for(int i=2; i*i<n; i++){
            if(s[i]==0){
                for(int j=i*i; j<n; j+=i){
                    if(s[j]==0){
                        s[j]=1;
                        count--;
                    }
                }
            }
        }
        return count;
    }
}