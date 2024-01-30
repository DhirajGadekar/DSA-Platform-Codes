/* *
 * 46] Best Time to Buy and Sell Stock
 */

class Solution {
    public int maxProfit(int[] prices) {

        int leftMin[] = new int[prices.length];
        leftMin[0] = prices[0];
        for(int i = 1; i < leftMin.length; i++) {

            if(leftMin[i - 1] > prices[i]) {

                leftMin[i] = prices[i];
            } else {

                leftMin[i] = leftMin[i - 1];
            }
        }
        for(int i = prices.length - 2; i >= 0; i--) {

            if(!(prices[i] > prices[i + 1])) {

                prices[i] = prices[i + 1];
            }
        }

        int max = 0;
        for(int i = 0; i < prices.length; i++) {

            if(max < prices[i] - leftMin[i]) {

                max = prices[i] - leftMin[i];
            }
        }
        return max;
    }
}
