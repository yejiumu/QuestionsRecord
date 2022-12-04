package LeetCode.CodeCarl.dp;

/**
 * 买卖股票的最佳时机 III
 *
 * @author xoke
 * @date 2022/12/4
 */
class _123_maxProfit {
    /**
     * 执行用时：20 ms, 在所有 Java 提交中击败了44.68%的用户
     * 内存消耗：52 MB, 在所有 Java 提交中击败了89.20%的用户
     */
    public int maxProfit(int[] prices) {
        int len = prices.length;
        // 没有操作，第一次买入，第一次卖出，第二次买入,第二次卖出
        // 表示的是第i天，买入股票的状态，并不是说一定要第i天买入股票
        int[][] dp = new int[len][5];
        dp[0][1] = -prices[0];
        dp[0][3] = -prices[0];
        for (int i = 1; i < len; i++) {
            // 没有操作，沿用前一天买入的状态
            dp[i][0] = dp[i - 1][0];
            // 买入操作
            // 操作一：第i天买入股票了，那么dp[i][1] = dp[i-1][0] - prices[i]
            // 操作二：第i天没有操作，而是沿用前一天买入的状态，即：dp[i][1] = dp[i - 1][1]
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            // 卖出操作
            // 操作一：第i天卖出股票了，那么dp[i][2] = dp[i - 1][1] + prices[i]
            // 操作二：第i天没有操作，沿用前一天卖出股票的状态，即：dp[i][2] = dp[i - 1][2]
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
            dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
        }
        return dp[len - 1][4];
    }
}