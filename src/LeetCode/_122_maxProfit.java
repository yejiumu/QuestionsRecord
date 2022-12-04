package LeetCode;

/**
 * 买卖股票的最佳时机 II
 *
 * @author xoke
 * @date 2022/12/4
 */
public class _122_maxProfit {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了24.79%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了79.88%的用户
     */
    public int maxProfit(int[] prices) {
        int len = prices.length;
        // dp[i][0] 表示第i天持有股票所得现金
        // dp[i][1] 表示第i天不持有股票所得最多现金
        int[][] dp = new int[len][2];
        dp[0][0] -= prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < len; i++) {
            // 第i-1天就持有股票，那么就保持现状，所得现金就是昨天持有股票的所得现金 即：dp[i - 1][0]
            // 第i天买入股票，所得现金就是昨天不持有股票的所得现金减去 今天的股票价格 即：dp[i - 1][1] - prices[i]
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            // 第i-1天就不持有股票，那么就保持现状，所得现金就是昨天不持有股票的所得现金 即：dp[i - 1][1]
            // 第i天卖出股票，所得现金就是按照今天股票佳价格卖出后所得现金即：prices[i] + dp[i - 1][0]
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
        }
        // 最后一天不持有股票的现金
        return dp[len - 1][1];
    }
}
