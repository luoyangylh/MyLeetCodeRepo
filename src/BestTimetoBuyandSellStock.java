/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 6/9/14
 * Time: 9:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int res = 0;
        if (prices.length < 2) return res;

        int low = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - low > res) {
                res = prices[i] - low;
            }

            if (prices[i] < low) {
                low = prices[i];
            }

        }
        return res;

    }

}
