class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long sSum=0, tSum=0;
        for(int x:source){
            sSum+=x;
        }
        for(int x:target){
            tSum+=x;
        }
        return sSum==tSum;
    }
}