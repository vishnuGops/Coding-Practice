class Solution {
    public int maxProfit(int[] prices) {
        int i =0;
        int j =1; 
        int max = Integer.MIN_VALUE;
        while(j < prices.length){
            if(prices[j] - prices[i] < 0){
                i = j;
                j++;
            }
            else{
                max = Math.max((prices[j] - prices[i]) , max);
                j++;
            }
        }
        return (max < 0)? 0: max;
    }
}