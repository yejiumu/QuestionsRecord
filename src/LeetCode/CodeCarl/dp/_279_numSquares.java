package LeetCode.CodeCarl.dp;

import java.util.Arrays;

/**
 * 完全平方数
 *
 * @author xoke
 * @date 2022/12/2
 */
public class _279_numSquares {
    /**
     * 执行用时：25 ms, 在所有 Java 提交中击败了68.00%的用户
     * 内存消耗：40.5 MB, 在所有 Java 提交中击败了77.23%的用户
     */
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        int max = Integer.MAX_VALUE;
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i * i <= n; i++) {
            for (int j = i * i; j <= n; j++) {
                if (dp[j - i * i] != max) {
                    dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
                }
            }
        }
        return dp[n];
    }
}
