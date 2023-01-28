package LeetCode.剑指offer.II;

/**
 * 丑数
 *
 * @author jiumu
 * @date 2023/1/28
 */
public class _49_nthUglyNumber {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了98.34%的用户
     * 内存消耗：39.7 MB, 在所有 Java 提交中击败了44.67%的用户
     */
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int n1 = dp[a] * 2, n2 = dp[b] * 3, n3 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n1, n2), n3);
            if (dp[i] == n1) {
                a++;
            }
            if (dp[i] == n2) {
                b++;
            }
            if (dp[i] == n3) {
                c++;
            }
        }
        return dp[n - 1];
    }
}
