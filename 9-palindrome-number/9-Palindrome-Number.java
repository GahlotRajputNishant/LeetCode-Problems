class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int orig=x, rever=0;
        while(x>0){
            int d=x%10;
            rever=rever*10+d;
            x/=10;
        }
        return orig==rever;
    }
}