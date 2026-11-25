class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int temp=prices[0]+prices[1];
        if(money>=temp){
            return money-temp;
        }
        else{
            return money;
        }
    }
}