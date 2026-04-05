class Solution {
    public int maxProfit(int[] prices) {
        int min = 101, minIndex = -1;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
                minIndex = i;
            }
        }
        int max = min, maxIndex = -1;
        for(int j = minIndex; j < prices.length; j++) {
            if(prices[j] > max) {
                max = prices[j];
                maxIndex = j;
            }
        }
        if(maxIndex != -1) {
            return prices[maxIndex] - prices[minIndex];
        } else {
            return 0;
        }
    }
}
