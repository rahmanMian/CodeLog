/*
SLIDING WINDOW APPROACH
keep the left planted until you find a smaller right value. Then shift left to that value. Calcualre teh max profit on every iteration.
*/


class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }


        int left = 0;
        int maxProfit = 0;

        for(int right = 1; right < prices.length; right++){
            maxProfit = Math.max(prices[right] - prices[left], maxProfit);

            if(prices[right] < prices[left]){
                left = right;
            }
        }

        return maxProfit; 
    }
}
