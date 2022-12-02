package LeetCode;

import java.util.Arrays;

/**
 * 零钱兑换
 *
 * @author xoke
 * @date 2022/12/2
 */
public class _322_coinChange {
    /**
     * 执行用时：11 ms, 在所有 Java 提交中击败了87.74%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了93.11%的用户
     */
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        int len = coins.length, max = Integer.MAX_VALUE;
        // 最小需要初始化最大
        Arrays.fill(dp, max);
        // 第一位要初始化为0，不然无结果
        dp[0] = 0;
        for (int i = 0; i < len; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j - coins[i]] != max) {
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }
        return dp[amount] == max ? -1 : dp[amount];
    }
}
