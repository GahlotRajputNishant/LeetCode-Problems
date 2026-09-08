class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=x;
        int RevNum=0;
        while(n>0){
            int d=n%10;
            RevNum= RevNum * 10 + d;
            n=n/10;
        }
        if(RevNum==x){
            return true;
        }
        else{
            return false;
        }
    }
}