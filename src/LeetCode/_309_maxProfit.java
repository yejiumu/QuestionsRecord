package LeetCode;

/**
 * 最佳买卖股票时机含冷冻期
 *
 * @author xoke
 * @date 2022/12/16
 */
public class _309_maxProfit {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了77.54%的用户
     * 内存消耗：40.2 MB, 在所有 Java 提交中击败了5.01%的用户
     */
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][] dp = new int[len][4];
        dp[0][0] -= prices[0];
        for (int i = 1; i < len; i++) {
            // 买入：昨天已经买入、昨天是冷冻期、昨天是
            dp[i][0] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][3], dp[i - 1][1]) - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][3]);
            dp[i][2] = dp[i - 1][0] + prices[i];
            dp[i][3] = dp[i - 1][2];
        }
        return Math.max(dp[len - 1][3], Math.max(dp[len - 1][1], dp[len - 1][2]));
    }
}
