package LeetCode.CodeCarl.dp;

/**
 * 零钱兑换 II
 *
 * @author xoke
 * @date 2022/12/1
 */
public class _518_change {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了45.92%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了43.39%的用户
     */
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        int len = coins.length;
        dp[0] = 1;
        for (int i = 0; i < len; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
}
