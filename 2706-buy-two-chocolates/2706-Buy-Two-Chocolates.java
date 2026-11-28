class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int p:prices){
            if(p<min1 && p<min2){
                min2=min1;
                min1=p;
            }
            else if(p<min2){
                min2=p;
            }
        }
        int min=min1+min2;
        if(money>=min) return money-min;
        else return money;
    }
}






//////// 2nd approach


// class Solution {
//     public int buyChoco(int[] prices, int money) {
//         Arrays.sort(prices);
//         int temp=prices[0]+prices[1];
//         if(money>=temp){
//             return money-temp;
//         }
//         else{
//             return money;
//         }
//     }
// }