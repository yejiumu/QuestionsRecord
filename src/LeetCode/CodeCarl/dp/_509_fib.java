package LeetCode.CodeCarl.dp;

/**
 * 斐波那契数
 *
 * @author xoke
 * @date 2022/11/29
 */
public class _509_fib {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.3 MB, 在所有 Java 提交中击败了47.63%的用户
     */
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            int sum = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = sum;
        }
        return dp[1];
    }
}
