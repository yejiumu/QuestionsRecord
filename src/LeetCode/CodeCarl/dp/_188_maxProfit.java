package LeetCode.CodeCarl.dp;

/**
 * 买卖股票的最佳时机 IV
 *
 * @author xoke
 * @date 2022/12/4
 */
public class _188_maxProfit {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.83%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了36.85%的用户
     */
    public int maxProfit(int k, int[] prices) {
        // 类比123题，其实很好理解
        int len = prices.length;
        int[][] dp = new int[len][2 * k + 1];
        for (int i = 1; i < 2 * k + 1; i += 2) {
            dp[0][i] = -prices[0];
        }
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < 2 * k - 1; j += 2) {
                dp[i][j + 1] = Math.max(dp[i - 1][j + 1], dp[i - 1][j] - prices[i]);
                dp[i][j + 2] = Math.max(dp[i - 1][j + 2], dp[i - 1][j + 1] + prices[i]);
            }
        }
        return dp[len - 1][2 * k];
    }
}
