class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>ans= new ArrayList<>();
        for(int i=left; i<=right; i++) {
            if(isSelfDividing(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean isSelfDividing(int num) {
        int n=num;
        while(n>0) {
            int digit=n%10;
            if(digit==0) {
                return false;
            }
            if(num%digit!=0) {
                return false;
            }
            n/=10;
        }
        return true;
    }
}