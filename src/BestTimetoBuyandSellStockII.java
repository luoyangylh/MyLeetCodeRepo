/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 4/27/14
 * Time: 11:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int res = 0;
        int len = prices.length;

        for (int i = 0; i < len - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                res += prices[i+1] - prices[i];
            }

        }
        return res;
    }


}
